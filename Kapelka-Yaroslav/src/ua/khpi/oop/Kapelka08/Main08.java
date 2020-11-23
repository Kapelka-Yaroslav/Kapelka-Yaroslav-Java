package ua.khpi.oop.Kapelka08;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main08 
{
	public static void main(String[] args) 
	{
		RouteClassList Route_list = new RouteClassList();
		String[] listOfStation_name1 = {"Лозовая-Харьков", "Харьков-Гавриловка", "Харьков-Изюм"};
		String[] listOfStation_name2 = {"Красноград-Харьков", "Мерефа-Харьков", "Славянск-Харьков"};
		String[] listOfdeparture_time1 = {"15:24", "15:59", "06:40"};
		String[] listOfdeparture_time2 = {"16:44", "06:58", "06:27"};
		String[] listOfarrival_time1 = {"19:13", "20:37", "10:14"};
		String[] listOfarrival_time2 = {"19:34", "7:45", "10:51"};
		String[] listOfstarting_station1 = {"Лозовая", "Харьков", "Харьков"};	
		String[] listOfstarting_station2 = {"Красноград", "Мерефа", "Славянск"};
		String[] listOfterminal_station1 = {"Харьков", "Гавриловка", "Изюм"};		
		String[] listOfterminal_station2 = {"Харьков", "Харьков", "Харьков"};
		String[] listOfintermediate_stations1 = {"Панютино", "Мерефа", "Маяк"};
		String[] listOfintermediate_stations2 = {"Власовка", "Покотиловка", "Гусаровка"};
		String[] listOfdeparture_time_of_intermediate_stations1 = {"15:35", "16:43", "09:24"};
		String[] listOfdeparture_time_of_intermediate_stations2 = {"17:37", "07:25", "6:56"};
		String[] listOfarrival_time_of_intermediate_stations1 = {"15:36", "16:54", "09:25"};
		String[] listOfarrival_time_of_intermediate_stations2 = {"17:38", "07:26", "6:57"};
		int[] listOfnumber_of_free_seats1 = { 35, 48, 72};
		int[] listOfnumber_of_free_seats2 = { 65, 37, 86};
		
		ArrayList<GregorianCalendar> List_days_of_the_week1 = new ArrayList<GregorianCalendar>();
		GregorianCalendar days_of_the_week1 = new GregorianCalendar(2020, 10, 22);
		days_of_the_week1.set(Calendar.HOUR_OF_DAY, 15);
		days_of_the_week1.set(Calendar.MINUTE, 24);
		days_of_the_week1.set(Calendar.SECOND, 00);
		List_days_of_the_week1.add(days_of_the_week1);
		GregorianCalendar days_of_the_week2 = new GregorianCalendar(2020, 10, 25);
		days_of_the_week2.set(Calendar.HOUR_OF_DAY, 15);
		days_of_the_week2.set(Calendar.MINUTE, 59);
		days_of_the_week2.set(Calendar.SECOND, 00);
		List_days_of_the_week1.add(days_of_the_week2);
		GregorianCalendar days_of_the_week3 = new GregorianCalendar(2020, 10, 30);
		days_of_the_week3.set(Calendar.HOUR_OF_DAY, 6);
		days_of_the_week3.set(Calendar.MINUTE, 40);
		days_of_the_week3.set(Calendar.SECOND, 00);
		List_days_of_the_week1.add(days_of_the_week3);

		RouteClass routeclass1 = new RouteClass(listOfStation_name1, listOfdeparture_time1, listOfarrival_time1, listOfstarting_station1, listOfterminal_station1, listOfintermediate_stations1, listOfdeparture_time_of_intermediate_stations1, listOfarrival_time_of_intermediate_stations1, listOfnumber_of_free_seats1, 150, List_days_of_the_week1, 1);
		Route_list.addElement(routeclass1);
		
		ArrayList<GregorianCalendar> List_days_of_the_week2 = new ArrayList<GregorianCalendar>();
		GregorianCalendar days_of_the_week4 = new GregorianCalendar(2020, 10, 22);
		days_of_the_week4.set(Calendar.HOUR_OF_DAY, 16);
		days_of_the_week4.set(Calendar.MINUTE, 44);
		days_of_the_week4.set(Calendar.SECOND, 00);
		List_days_of_the_week2.add(days_of_the_week4);
		GregorianCalendar days_of_the_week5 = new GregorianCalendar(2020, 10, 25);
		days_of_the_week5.set(Calendar.HOUR_OF_DAY, 6);
		days_of_the_week5.set(Calendar.MINUTE, 58);
		days_of_the_week5.set(Calendar.SECOND, 00);
		List_days_of_the_week2.add(days_of_the_week5);
		GregorianCalendar days_of_the_week6 = new GregorianCalendar(2020, 10, 30);
		days_of_the_week6.set(Calendar.HOUR_OF_DAY, 6);
		days_of_the_week6.set(Calendar.MINUTE, 27);
		days_of_the_week6.set(Calendar.SECOND, 00);
		List_days_of_the_week2.add(days_of_the_week6);
		
		RouteClass routeclass2 = new RouteClass(listOfStation_name2, listOfdeparture_time2, listOfarrival_time2, listOfstarting_station2, listOfterminal_station2, listOfintermediate_stations2, listOfdeparture_time_of_intermediate_stations2, listOfarrival_time_of_intermediate_stations2, listOfnumber_of_free_seats2, 200, List_days_of_the_week2,2);
		Route_list.addElement(routeclass2);
		
		boolean stop = false;
		Scanner scan = new Scanner(System.in); 
		int choise;
		
		while(!stop)
		{
			System.out.println("Какой номер из списка выберете?");
			System.out.println("1. Вывести данные");
			System.out.println("2. Добавить элемент");
			System.out.println("3. Удалить элемент");
			System.out.println("4. Сериализовать данные");
			System.out.println("5. Десериализовать данные");
			System.out.println("6. Завершить программу");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_");
			System.out.print("Ваш выбор: ");
			
			choise = scan.nextInt();
			
			switch (choise) 
			{
			case 1:
				System.out.println();
				for (int i = 0; i < Route_list.getSize(); i++) 
				{
					System.out.println(i+1 + ") ");
					Route_list.route[i].outputData();
					System.out.println();
				}
				break;
				
			case 2:
				System.out.print("\nВведите номер маршрута: ");
				int value = scan.nextInt();
				if(value < 1)
				{
					System.out.println("Ошибка. Неверный размер списка.");
					break;
				}				
				String[] list = new String[value];
				System.out.println("Введите список названий станций: ");
				scan.nextLine();
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list[i] = scan.nextLine();
				}
				String[] list1 = new String[value];
				System.out.println("Введите список времени отправления: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list1[i] = scan.nextLine();
				}
				String[] list2 = new String[value];
				System.out.println("Введите список времени прибытия: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list2[i] = scan.nextLine();
				}
				String[] list3 = new String[value];
				System.out.println("Введите список начальных станций: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list3[i] = scan.nextLine();
				}
				String[] list4 = new String[value];
				System.out.println("Введите список конечных станций: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list4[i] = scan.nextLine();
				}
				String[] list5 = new String[value];
				System.out.println("Введите список промежуточных станций: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list5[i] = scan.nextLine();
				}
				String[] list6 = new String[value];
				System.out.println("Введите список времени отправления для промежуточных станций: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list6[i] = scan.nextLine();
				}
				String[] list7 = new String[value];
				System.out.println("Введите список времени прибытия для промежуточных станций: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list7[i] = scan.nextLine();
				}
				int[] list8 = new int[value];
				System.out.println("Введите список количества пустых мест: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list8[i] = scan.nextInt();
				}
				
				ArrayList<GregorianCalendar> List_days_of_the_week3 = new ArrayList<GregorianCalendar>();
				GregorianCalendar days_of_the_week7 = new GregorianCalendar();
				System.out.print("Введите год: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.YEAR, value);
				System.out.print("Введите месяц: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.MONTH, value);
				System.out.print("Введите день: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.DAY_OF_MONTH, value);
				System.out.print("Введите часы: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.HOUR_OF_DAY, value);
				System.out.print("Введите минуты: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.MINUTE, value);
				List_days_of_the_week3.add(days_of_the_week7);
				
				GregorianCalendar days_of_the_week8 = new GregorianCalendar();
				System.out.print("Введите год: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.YEAR, value);
				System.out.print("Введите месяц: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.MONTH, value);
				System.out.print("Введите день: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.DAY_OF_MONTH, value);
				System.out.print("Введите часы: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.HOUR_OF_DAY, value);
				System.out.print("Введите минуты: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.MINUTE, value);
				List_days_of_the_week3.add(days_of_the_week8);
				
				GregorianCalendar days_of_the_week9 = new GregorianCalendar();
				System.out.print("Введите год: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.YEAR, value);
				System.out.print("Введите месяц: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.MONTH, value);
				System.out.print("Введите день: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.DAY_OF_MONTH, value);
				System.out.print("Введите часы: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.HOUR_OF_DAY, value);
				System.out.print("Введите минуты: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.MINUTE, value);
				List_days_of_the_week3.add(days_of_the_week9);
				
				System.out.print("Введите количество мест: ");
				scan.nextLine();
				int total = scan.nextInt();
				System.out.print("Введите номер рейса: ");
				value = scan.nextInt();
				System.out.println("\nЭлемент добавлен.\n");
				
				RouteClass newRoute = new RouteClass(list,list1,list2,list3,list4,list5,list6,list7,list8,total,List_days_of_the_week3,value);
				Route_list.addElement(newRoute);
				
				break;
				
			case 3:
				System.out.println();
				for (int i = 0; i < Route_list.getSize(); i++) 
				{
					System.out.println(i+1 + ") ");
					Route_list.route[i].outputData();
					System.out.println();
				}
				
				System.out.print("Введите номер элемента для удаления: ");
				int position = scan.nextInt();
				if(position > Route_list.getSize() || position < 1)
				{
					System.out.println("Ошибка.Неправильный номер.");
					break;
				}
				Route_list.deleteElement(position);
				System.out.println("\nЭлемент удален.\n");
				
				break;
				
			case 4:
				String address = new File("").getAbsolutePath(); //адрес начальной директории	
				File folder = new File(address);                 //создание файла
				File[] arrayFiles = folder.listFiles();          //список файлов в текущей директории
				String filename;						         //название файла для записи
				String currentDirectory = address;		         //адресс текущей директории
				String highestDir = folder.getName();	         //название максимально допустимой высокой директории
				
				boolean stop2 = false;  //выход из цикла выбора директории
				int index = 0;
				int choise2 = 0;
				
				System.out.print("\nВведите имя XML файла: ");
				scan.nextLine();
				filename = scan.nextLine();
				
				if (filename.indexOf(".xml") == -1) {
					filename += ".xml";
				}
				
				while(!stop2)
				{
					index = 0;
					
					System.out.println("\nТекущий путь: " + currentDirectory);
					System.out.println("Текущее имя файла XML: " + filename);
					System.out.println("\nФайлы и каталоги в текущем пути:");
					for (index = 0; index < arrayFiles.length; index++) {
						System.out.println(index+1 + ". " + arrayFiles[index].toString().substring(currentDirectory.length()+1));
					}
					
					System.out.println();
					System.out.println("Какой номер из списка выберете?");
					System.out.println("1. Записать XML-файл в текущею директорию");
					System.out.println("2. Перейти на один уровень вверх по папке");
					System.out.println("3. Войти в папку");
					System.out.println("4. Измените имя файла XML");
					System.out.println("5. Выйти из сериализации");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.print("Ваш выбор: ");
					choise2 = scan.nextInt();
					
					switch(choise2)
					{
					case 1:
						stop2 = true;
						break;
						
					case 2:
						if(folder.getName().equals(highestDir))
						{
							System.out.print("\nВы не можете подняться на один уровень вверх по папке");
							break;
						}
						currentDirectory = currentDirectory.substring(0, currentDirectory.indexOf(folder.getName())-1);
						folder = new File(currentDirectory);
						arrayFiles = folder.listFiles();	//список файлов в текущей директории
						
						break;
						
					case 3:
						boolean choise3 = false;
						
						while(!choise3)
						{
							System.out.print("\nВыберите номер каталога: ");
							index = scan.nextInt();
							if(index < 1 || index > arrayFiles.length || !arrayFiles[index-1].isDirectory())
							{
								System.out.println("Это не каталог. Попробуйте снова.");
							}
							else
							{
								currentDirectory = arrayFiles[index-1].toString();
								System.out.println("Новый текущий каталог: " + currentDirectory);
								folder = new File(currentDirectory);
								arrayFiles = folder.listFiles();	//список файлов в текущей директории
								choise3 = true;
							}
						}
						break;
						
					case 4:
						System.out.print("\nВведите имя XML файла: ");
						scan.nextLine();
						filename = scan.nextLine();
						
						if (filename.indexOf(".xml") == -1) {
							filename += ".xml";
						}
						break;
						
					case 5:
						System.out.println("Выход из раздела сериализации");
						break;
						
					default:
						System.out.println("Ошибка. Неправильная команда. Попробуйте еще раз");
						break;					
					
					}
					
				}
				address = currentDirectory;
				System.out.println("\nФайл будет записан в текущий каталог: " + address);
				System.out.println("Имя файла XML: " + filename);
				folder = new File(address);
				File realFile = new File(folder,filename);
				try {
					XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(realFile)));
					encoder.writeObject(Route_list.route);
					encoder.close();
				} catch (Exception e) {
					System.out.println(e);
					break;
				}
				System.out.println("Сериализация прошла успешно.\n");
				
				break;
				
			case 5:
				address = new File("").getAbsolutePath();	//адрес начальной директории
				folder = new File(address);					//создание файла
				arrayFiles = folder.listFiles();			//список файлов в текущей директории
				currentDirectory = address;					//адресс текущей директории
				highestDir = folder.getName();				//название макчимально допустимой высокой директории
				
				stop2 = false;	//выход из цыула выбора директории
				index = 0;
				choise2 = 0;
				
				while(!stop2)
				{
					index = 0;
					
					System.out.println("\nТекущий путь: " + currentDirectory);
					System.out.println("Файлы и каталоги в текущем пути:");
					for (index = 0; index < arrayFiles.length; index++) {
						System.out.println(index+1 + ". " + arrayFiles[index].toString().substring(currentDirectory.length()+1));
					}
					
					System.out.println();
					System.out.println("Какой номер из списка выберете?");
					System.out.println("1. Прочитать XML-файл в текущем каталоге");
					System.out.println("2. Перейти на один уровень вверх по папке");
					System.out.println("3. Войти в папку");
					System.out.println("4. Выйти из сериализации");
					System.out.println("======================================");
					System.out.print("Ваш выбор: ");
					choise2 = scan.nextInt();
					
					switch(choise2)
					{
					case 1:
						System.out.print("\nВведите ID файла: ");
						index = scan.nextInt();
						if(arrayFiles[index-1].getName().indexOf(".xml")==-1 || arrayFiles[index-1].isDirectory())
						{
							System.out.println("Это не файл .XML.");
							break;
						}
						
						stop2 = true;
						break;
						
					case 2:
						if(folder.getName().equals(highestDir))
						{
							System.out.println("Вы не можете подняться на один уровень в папке.");
							break;
						}
						currentDirectory = currentDirectory.substring(0, currentDirectory.indexOf(folder.getName())-1);
						folder = new File(currentDirectory);
						arrayFiles = folder.listFiles();	//список файлов в текущей директории
						
						break;
						
					case 3:
						boolean choise3 = false;
						
						while(!choise3)
						{
							System.out.print("\nВыберите номер каталога: ");
							index = scan.nextInt();
							if(index < 1 || index > arrayFiles.length || !arrayFiles[index-1].isDirectory())
							{
								System.out.println("Это не каталог. Попробуйте снова.");
							}
							else
							{
								currentDirectory = arrayFiles[index-1].toString();
								System.out.println("Новый текущий каталог: " + currentDirectory);
								folder = new File(currentDirectory);
								arrayFiles = folder.listFiles();	//список файлов в текущей директории
								choise3 = true;
							}
						}
						break;
						
					case 4:
						System.out.println("Выход из раздела сериализации");
						stop2 = true;
						break;
						
					default:
						System.out.println("Ошибка. Неправильная команда. Попробуйте еще раз");
						break;					
					
					}
					
				}
				address = currentDirectory;
				System.out.println("Адрес файла XML: " + address + "\\" + arrayFiles[index-1].getName());
				address = address + "\\" + arrayFiles[index-1].getName();
				folder = new File(address);
				try {
					XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(folder)));
					Route_list.route = (RouteClass[])decoder.readObject();
					decoder.close();
					Route_list.setSize(Route_list.route.length);
				} catch (Exception e) {
					System.out.println(e);
					break;
				} 
				System.out.println("Десериализация прошла успешно.\n");
				
				break;
				
			case 6:
				System.out.println("\nЗавершение программы");
				stop = true;
				break;
				
			default:
				System.out.println("Ошибка. Неправильная команда. Попробуйте еще раз.");
				break;
			}
		}
	}
}
