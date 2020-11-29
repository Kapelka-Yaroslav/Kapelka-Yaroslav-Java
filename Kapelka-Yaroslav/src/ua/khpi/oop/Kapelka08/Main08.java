package ua.khpi.oop.Kapelka08;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main08 
{
	public static void main(String[] args) 
	{
		RouteClassList Route_list = new RouteClassList();
		String Name_route1 = "Лозовая-Харьков";
		String Name_route2 = "Харьков-Изюм";
		String Station_name1 = "Лозовая";		
		String Station_name2 = "Панютино";
		String Station_name3 = "Харьков";
		String Station_name4 = "Харьков";
		String Station_name5 = "Маяк";
		String Station_name6 = "Изюм";
		String arrival_time1 = "15:20";
		String arrival_time2 = "15:35";
		String arrival_time3 = "19:13";
		String arrival_time4 = "11:55";
		String arrival_time5 = "14:52";
		String arrival_time6 = "15:41";
		String departure_time1 = "15:24";
		String departure_time2 = "15:36";
		String departure_time3 = "Времени отправления нету, так как это конечная станция.";
		String departure_time4 = "12:00";
		String departure_time5 = "14:53";		
		String departure_time6 = "Времени отправления нету, так как это конечная станция.";
		int number_of_free_seats1 = 55;
		int number_of_free_seats2 = 78;
		int number_of_free_seats3 = 63;
		int number_of_free_seats4 = 87;
		int number_of_free_seats5 = 61;
		int number_of_free_seats6 = 75;
		String Status_station1 = "Начальная";	
		String Status_station2 = "Промежуточная";
		String Status_station3 = "Конечная";
		String Status_station4 = "Начальная";	
		String Status_station5 = "Промежуточная";
		String Status_station6 = "Конечная";
		GregorianCalendar days_of_the_week1 = new GregorianCalendar(2020, 11, 7);
		days_of_the_week1.set(Calendar.HOUR_OF_DAY, 00);
		days_of_the_week1.set(Calendar.MINUTE, 00);
		days_of_the_week1.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week2 = new GregorianCalendar(2020, 11, 8);
		days_of_the_week2.set(Calendar.HOUR_OF_DAY, 00);
		days_of_the_week2.set(Calendar.MINUTE, 00);
		days_of_the_week2.set(Calendar.SECOND, 00);
		
		StationClass Station_list_mas[] = new StationClass[3];
		Station_list_mas[0] = new StationClass(Station_name1, arrival_time1, departure_time1, number_of_free_seats1, Status_station1);
		Station_list_mas[1] = new StationClass(Station_name2, arrival_time2, departure_time2, number_of_free_seats2, Status_station2);
		Station_list_mas[2] = new StationClass(Station_name3, arrival_time3, departure_time3, number_of_free_seats3, Status_station3);
		StationClass Station_list1_mas[] = new StationClass[3];
		Station_list1_mas[0] = new StationClass(Station_name4, arrival_time4, departure_time4, number_of_free_seats4, Status_station4);
		Station_list1_mas[1] = new StationClass(Station_name5, arrival_time5, departure_time5, number_of_free_seats5, Status_station5);
		Station_list1_mas[2] = new StationClass(Station_name6, arrival_time6, departure_time6, number_of_free_seats6, Status_station6);
		
		RouteClass routeclass1 = new RouteClass(Name_route1, Station_list_mas, 150, days_of_the_week1, 1);
		RouteClass routeclass2 = new RouteClass(Name_route2, Station_list1_mas, 200, days_of_the_week2, 2);
		Route_list.addElement(routeclass1);
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
				for(RouteClass route : Route_list.route)
				{
						route.outputData();		
						System.out.println();
				}
				break;
				
			case 2:
				System.out.print("\nВведите номер маршрута: ");
				int value = scan.nextInt();
				if(value < 1)
				{
					System.out.print("Ошибка. Неверный размер списка.");
					break;
				}
				scan.nextLine();
				System.out.print("Введите название маршрута: ");
				String list = scan.nextLine();
				System.out.print("Введите количество станций, которые будут присутствовать в маршруте: ");
				int count_stan = scan.nextInt();
				StationClass newStation[] = new StationClass[count_stan];
				for(int i = 0; i < count_stan; i++)
				{
					scan.nextLine();
					System.out.print("Введите название станции: ");
					String list1 = scan.nextLine();
					System.out.print("Введите время прибытия на станцию: ");
					String list2 = scan.nextLine();
					System.out.print("Введите время отправления с станции: ");
					String list3 = scan.nextLine();
					System.out.print("Введите количество пустых мест: ");
					int list4 = scan.nextInt();
					scan.nextLine();
					System.out.print("Введите статус станции: ");				
					String list5 = scan.nextLine();
					newStation[i] = new StationClass(list1,list2,list3,list4,list5);
				}		
				scan.nextLine();
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
				
				System.out.print("Введите общее количество мест: ");
				int total = scan.nextInt();
				System.out.print("Введите номер рейса: ");
				value = scan.nextInt();
				System.out.println("\nЭлемент добавлен.\n");
				
				RouteClass newRoute = new RouteClass(list,newStation,total,days_of_the_week7,value);
				Route_list.addElement(newRoute);
				
				break;
				
			case 3:
				System.out.println();
				for(RouteClass route : Route_list.route)
				{
						route.outputData();		
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
