package ua.khpi.oop.Kapelka11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Helper
{
	static <T extends Route> void sort(MyCollection<T> collection, ESort choose) 
	{
		boolean przEnd = true;
		while (przEnd) 
		{
			przEnd = false;
			for (int i = 0; i < collection.getSize() - 1; i++) 
			{
				switch (choose) 
				{
				case TOTALNUMBEROFSEATS:
					if (collection.get(i).getTotal_number_of_seats().compareTo(collection.get(i + 1).getTotal_number_of_seats()) > 0)
					{
						collection.swap(i, i + 1);
						przEnd = true;
					}
					break;
				case DAYOFTHEWEEK:
					if (collection.get(i).getDays_of_the_week().compareTo(collection.get(i + 1).getDays_of_the_week()) > 0)
					{
						collection.swap(i, i + 1);
						przEnd = true;
					}
					break;
				case FLIGHTNUMBER:
					if (collection.get(i).getFlight_number().compareTo(collection.get(i + 1).getFlight_number()) > 0)
					{
						collection.swap(i, i + 1);
						przEnd = true;
					}
					break;
				default:
					break;
				}
			}
		}
	}

	enum ESort 
	{
		TOTALNUMBEROFSEATS, DAYOFTHEWEEK, FLIGHTNUMBER
	}

	static void saveToFile(String filename, String str) throws IOException
	{

		FileWriter file = new FileWriter(filename);
		file.write(str);
		file.close();
	}

	static String readFromFile(String filename) throws IOException 
	{
		FileReader file = new FileReader(filename);
		String str = new String();

		int c = 0;
		while ((c = file.read()) != -1)
		{
			str += new String(new char[] { (char) c });
		}
		file.close();
		return str;
	}

	static MyCollection<Route> parsingRoute(String str) 
	{
		MyCollection<Route> array = new MyCollection<Route>();
		String name = new String();
		String station = new String();
		String departure = new String();
		String arrival = new String();
		String number = new String();
		String status = new String();
		String total_number = new String();
		String days = new String();
		String flight = new String();
		while (str.indexOf("NameRoute: ") >= 0 && str.length() > 0) 
		{
			name = str.substring(str.indexOf("NameRoute: ") + 11, str.indexOf("Station Name: ") - 1);
			station = str.substring(str.indexOf("Station Name: ") + 14, str.indexOf("Departure time: ") - 1);
			departure = str.substring(str.indexOf("Departure time: ") + 16, str.indexOf("Arrival time: ") - 1);
			arrival = str.substring(str.indexOf("Arrival time: ") + 14, str.indexOf("Number of free seats: ") - 1);
			number = str.substring(str.indexOf("Number of free seats: ") + 22, str.indexOf("Status station: ") - 1);
			status = str.substring(str.indexOf("Status station: ") + 16, str.indexOf("Total number of seats: ") - 1);
			total_number = str.substring(str.indexOf("Total number of seats: ") + 23, str.indexOf("Days of the week: ") - 1);
			days = str.substring(str.indexOf("Days of the week: ") + 18, str.indexOf("Flight number: ") - 1);
			flight = new String();
			for (int i = str.indexOf("Flight number: ") + 15; str.charAt(i) != '\n' && i < str.length(); i++) 
			{
				flight += str.charAt(i);
			}

			try 
			{
				array.add(new Route(name, station, departure, arrival, number, status, total_number, days, flight));

			} catch (ParseException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = str.substring(str.indexOf(flight) + flight.length() + 1);
		}
		return array;
	}

	static void Auto() throws IOException, ParseException 
	{
		MyCollection<Route> collection = new MyCollection<Route>();
		collection.add(new Route("Лозовая-Харьков","Лозовая","15:20","15:24","55","Начальная","200","11.05.2021","1"));
		collection.add(new Route("Минск-Запорожье","Харьков","00:19","00:41","68","Промежуточная","150","21.03.2021","2"));
		System.out.println(collection);
		sort(collection, ESort.TOTALNUMBEROFSEATS);
		System.out.println("После сортировки: Общее количество мест");
		System.out.println(collection);
		sort(collection, ESort.DAYOFTHEWEEK);
		System.out.println("После сортировки: День недели");
		System.out.println(collection);
		sort(collection, ESort.FLIGHTNUMBER);
		System.out.println("После сортировки: Номер рейса");
		System.out.println(collection);
	}

	static void Menu() throws IOException 
	{
		MyCollection<Route> collection = new MyCollection<Route>();
		Scanner scan = new Scanner(System.in);
		boolean prz = true;
		String name = new String();
		String station = new String();
		String departure = new String();
		String arrival = new String();
		String number = new String();
		String status = new String();
		String total_number = new String();
		String days = new String();
		String flight = new String();
		while (prz) 
		{
			System.out.println(
					"\n1.Добавить элемент\n2.Удалить элемент\n3.Сортировать\n4.Вывод всех элементов.\n5.Записать в файл\n6.Считать с файла\n0.Выход\nВаш выбор:");

			switch (scan.nextInt()) 
			{
			case 1:
				scan.nextLine();
				System.out.println("Имя маршрута: ");
				name = scan.nextLine();
				System.out.println("Имя станции: ");
				station = scan.nextLine();
				System.out.println("Время прибытия на станцию: ");
				departure = scan.nextLine();
				System.out.println("Время отправления со станции: ");
				arrival = scan.nextLine();
				System.out.println("Количество пустых мест: ");
				number = scan.nextLine();
				System.out.println("Статус станции: ");
				status = scan.nextLine();
				System.out.println("Общее количество мест: ");
				total_number = scan.nextLine();
				System.out.println("День недели в формате День.Месяц.Год: ");
				days = scan.nextLine();
				System.out.println("Номер рейсу: ");
				flight = scan.nextLine();
				try
				{
					collection.add(new Route(name, station, departure, arrival, number, status, total_number, days, flight));
				} catch (ParseException e) 
				{
					System.out.println("Не удалось коректно считать");
					continue;
				}
				break;
			case 2:
				System.out.println("Номер элемента (начало с 0): ");
				collection.delete(scan.nextInt());
				break;
			case 3:
				System.out.println(
						"Как сортировать?1.По общему количеству мест.\n2.По дню недели.\n3.По номеру рейса.\nВаш выбор: ");
				switch (scan.nextInt()) 
				{
				case 1:
					sort(collection, ESort.TOTALNUMBEROFSEATS);
					break;
				case 2:
					sort(collection, ESort.DAYOFTHEWEEK);
					break;
				case 3:
					sort(collection, ESort.FLIGHTNUMBER);
					break;
				default:
					break;
				}

				break;
			case 4:
				System.out.println(collection);
				break;
			case 5:
				scan.nextLine();
				System.out.println("Введите имя файла: ");
				saveToFile(scan.nextLine(), collection.toString());
				break;
			case 6:
				scan.nextLine();
				System.out.println("Введите имя файла: ");
				collection = parsingRoute(readFromFile(scan.nextLine()));
				break;
			case 0:
				prz = false;
				break;
			default:
				break;
			}
		}
		scan.close();
	}

}
