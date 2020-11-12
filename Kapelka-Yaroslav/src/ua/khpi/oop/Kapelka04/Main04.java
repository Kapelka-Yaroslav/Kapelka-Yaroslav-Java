package ua.khpi.oop.Kapelka04;

import java.util.Scanner;

class Main04
{
  public static void main(String args[])
  {
	  for(var str : args) 
	  {
			if(str.equals("-h") || str.equals("-help")) 
		System.out.println("Автор: Капелька Ярослав\nВвести текст. Знайти та вивести, скiльки разiв повторюється в текстi кожне слово. Результат вивести у виглядi таблицi.\nПараметр \"-h\" чи \"-help\": вiдображається iнформація про автора програми, призначення (iндивiдуальне завдання), детальний опис режимiв роботи (пунктiв меню та параметрiв командного рядка);\r\n" + 
				"Параметр \"-d\" чи \"-debug\": в процесi роботи програми вiдображаються додатковi данi, що полегшують налагодження та перевiрку працездатностi програми: дiагностичнi повідомлення, промiжні значення змiнних, значення тимчасових змiнних та iн.");
			
		if(str.equals("-d") || str.equals("-debug"))
		{
			HelpMenu.debugMod(true);
		}
			
	  }
	  Menu();
  }
  public static void Menu()
  {
	 Scanner sc = new Scanner(System.in);
	 StringBuilder line = null;
	 boolean temp = true;
	 while(temp)
	 {
		 System.out.println("1.Ввести текст\n2.Посмотреть веденные данные\n3.Посмотреть результат\n4.Закончить работу\nВыберите номер пункта,который хотите выполнить: ");
		 switch(sc.nextInt())
		 {
		 case 1:
			 System.out.println("Введите текст: ");
			 sc.nextLine();		
			 line = new StringBuilder(sc.nextLine());
			 break;
		 case 2:
			 System.out.println("Вот введенные данные: ");
			 System.out.println(line);
			 break;
		 case 3:
			 HelpMenu.util.task(line.toString(),true);
			 break;
		 case 4:
			 temp = false;
			 break;
		 default:
			 break;
		 }
	 }
	 sc.close();
  }
}
