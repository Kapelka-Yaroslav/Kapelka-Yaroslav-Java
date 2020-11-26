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
		RouteClass Station_list = new RouteClass();
		String Station_name1 = "Лозовая-Харьков";
		String Station_name2 =  "Харьков-Гавриловка";
		String Station_name3 = "Харьков-Изюм";
		String Station_name4 = "Красноград-Харьков";
		String Station_name5 = "Мерефа-Харьков";
		String Station_name6 = "Славянск-Харьков";
		String departure_time1 = "15:24";
		String departure_time2 = "15:59";
		String departure_time3 = "06:40";
		String departure_time4 = "16:44";
		String departure_time5 = "06:58";
		String departure_time6 = "06:27";
		String arrival_time1 = "19:13";
		String arrival_time2 = "20:37";
		String arrival_time3 = "10:14";
		String arrival_time4 = "19:34";
		String arrival_time5 = "07:45";
		String arrival_time6 = "10:51";
		String starting_station1 = "Лозовая";	
		String starting_station2 = "Харьков";
		String starting_station3 = "Харьков";
		String starting_station4 = "Красноград";
		String starting_station5 = "Мерефа";
		String starting_station6 = "Славянск";
		String terminal_station1 = "Харьков";		
		String terminal_station2 = "Гавриловка";
		String terminal_station3 = "Изюм";
		String terminal_station4 = "Харьков";
		String terminal_station5 = "Харьков";
		String terminal_station6 = "Харьков";
		String intermediate_stations1 = "Панютино";
		String intermediate_stations2 = "Мерефа";
		String intermediate_stations3 =  "Маяк";
		String intermediate_stations4 = "Власовка";
		String intermediate_stations5 = "Покотиловка";
		String intermediate_stations6 = "Гусаровка";
		String departure_time_of_intermediate_stations1 = "15:35";
		String departure_time_of_intermediate_stations2 = "16:43";
		String departure_time_of_intermediate_stations3 = "09:24";
		String departure_time_of_intermediate_stations4 = "17:37";
		String departure_time_of_intermediate_stations5 = "07:25";
		String departure_time_of_intermediate_stations6 = "06:56";
		String arrival_time_of_intermediate_stations1 = "15:36";
		String arrival_time_of_intermediate_stations2 = "16:54";
		String arrival_time_of_intermediate_stations3 = "09:25";
		String arrival_time_of_intermediate_stations4 = "17:38";
		String arrival_time_of_intermediate_stations5 = "07:26";
		String arrival_time_of_intermediate_stations6 = "06:57";
		int number_of_free_seats1 = 35;
		int number_of_free_seats2 = 48;
		int number_of_free_seats3 = 72;
		int number_of_free_seats4 = 65;
		int number_of_free_seats5 = 37;
		int number_of_free_seats6 = 86;
		
		GregorianCalendar days_of_the_week1 = new GregorianCalendar(2020, 10, 22);
		days_of_the_week1.set(Calendar.HOUR_OF_DAY, 15);
		days_of_the_week1.set(Calendar.MINUTE, 24);
		days_of_the_week1.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week2 = new GregorianCalendar(2020, 10, 25);
		days_of_the_week2.set(Calendar.HOUR_OF_DAY, 15);
		days_of_the_week2.set(Calendar.MINUTE, 59);
		days_of_the_week2.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week3 = new GregorianCalendar(2020, 10, 30);
		days_of_the_week3.set(Calendar.HOUR_OF_DAY, 6);
		days_of_the_week3.set(Calendar.MINUTE, 40);
		days_of_the_week3.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week4 = new GregorianCalendar(2020, 10, 22);
		days_of_the_week4.set(Calendar.HOUR_OF_DAY, 16);
		days_of_the_week4.set(Calendar.MINUTE, 44);
		days_of_the_week4.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week5 = new GregorianCalendar(2020, 10, 25);
		days_of_the_week5.set(Calendar.HOUR_OF_DAY, 6);
		days_of_the_week5.set(Calendar.MINUTE, 58);
		days_of_the_week5.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week6 = new GregorianCalendar(2020, 10, 30);
		days_of_the_week6.set(Calendar.HOUR_OF_DAY, 6);
		days_of_the_week6.set(Calendar.MINUTE, 27);
		days_of_the_week6.set(Calendar.SECOND, 00);
		
		StationClass stationclass1 = new StationClass(Station_name1, departure_time1, arrival_time1, starting_station1, terminal_station1, intermediate_stations1, departure_time_of_intermediate_stations1, arrival_time_of_intermediate_stations1, number_of_free_seats1);
		StationClass stationclass2 = new StationClass(Station_name2, departure_time2, arrival_time2, starting_station2, terminal_station2, intermediate_stations2, departure_time_of_intermediate_stations2, arrival_time_of_intermediate_stations2, number_of_free_seats2);
		StationClass stationclass3 = new StationClass(Station_name3, departure_time3, arrival_time3, starting_station3, terminal_station3, intermediate_stations3, departure_time_of_intermediate_stations3, arrival_time_of_intermediate_stations3, number_of_free_seats3);
		StationClass stationclass4 = new StationClass(Station_name4, departure_time4, arrival_time4, starting_station4, terminal_station4, intermediate_stations4, departure_time_of_intermediate_stations4, arrival_time_of_intermediate_stations4, number_of_free_seats4);
		StationClass stationclass5 = new StationClass(Station_name5, departure_time5, arrival_time5, starting_station5, terminal_station5, intermediate_stations5, departure_time_of_intermediate_stations5, arrival_time_of_intermediate_stations5, number_of_free_seats5);
		StationClass stationclass6 = new StationClass(Station_name6, departure_time6, arrival_time6, starting_station6, terminal_station6, intermediate_stations6, departure_time_of_intermediate_stations6, arrival_time_of_intermediate_stations6, number_of_free_seats6);
		
		RouteClass routeclass1 = new RouteClass(150, days_of_the_week1, 1);
		RouteClass routeclass2 = new RouteClass(200, days_of_the_week2, 2);
		RouteClass routeclass3 = new RouteClass(250, days_of_the_week3, 3);
		RouteClass routeclass4 = new RouteClass(300, days_of_the_week4, 4);
		RouteClass routeclass5 = new RouteClass(270, days_of_the_week5, 5);
		RouteClass routeclass6 = new RouteClass(120, days_of_the_week6, 6);
		Station_list.addElementStation(stationclass1);
		Station_list.addElementStation(stationclass2);
		Station_list.addElementStation(stationclass3);
		Station_list.addElementStation(stationclass4);
		Station_list.addElementStation(stationclass5);
		Station_list.addElementStation(stationclass6);
		Route_list.addElement(routeclass1);
		Route_list.addElement(routeclass2);
		Route_list.addElement(routeclass3);
		Route_list.addElement(routeclass4);
		Route_list.addElement(routeclass5);
		Route_list.addElement(routeclass6);
		
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
					Station_list.station[i].outputDataStation();
					Route_list.route[i].outputData();				
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
				System.out.print("Введите названии станции: ");
				String list = scan.nextLine();
				System.out.print("Введите времени отправления: ");
				String list1 = scan.nextLine();
				System.out.print("Введите времени прибытия: ");
				String list2 = scan.nextLine();
				System.out.print("Введите начальную станцию: ");
				String list3 = scan.nextLine();
				System.out.print("Введите конечную станцию: ");
				String list4 = scan.nextLine();
				System.out.print("Введите промежуточную станцию: ");
				String list5 = scan.nextLine();
				System.out.print("Введите время прибытия для промежуточной станции: ");
				String list6 = scan.nextLine();
				System.out.print("Введите время отправления для промежуточной станции: ");
				String list7 = scan.nextLine();
				System.out.print("Введите количество пустых мест: ");
				int list8 = scan.nextInt();
				
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
				System.out.print("Введите номер рейса: ");;
				value = scan.nextInt();
				System.out.println("\nЭлемент добавлен.\n");
				StationClass newStation = new StationClass(list,list1,list2,list3,list4,list5,list6,list7,list8);
				Station_list.addElementStation(newStation);
				RouteClass newRoute = new RouteClass(total,days_of_the_week7,value);
				Route_list.addElement(newRoute);
				
				break;
				
			case 3:
				System.out.println();
				for (int i = 0; i < Route_list.getSize(); i++) 
				{
					System.out.println(i+1 + ") ");
					Station_list.station[i].outputDataStation();
					Route_list.route[i].outputData();
					System.out.println();
				}
				
				System.out.print("Введите номер элемента для удаления: ");
				int position = scan.nextInt();
				if(position > Route_list.getSize() || position < 1 && position > Station_list.getSize() || position < 1)
				{
					System.out.println("Ошибка.Неправильный номер.");
					break;
				}
				Route_list.deleteElement(position);
				Station_list.deleteElementStation(position);
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
