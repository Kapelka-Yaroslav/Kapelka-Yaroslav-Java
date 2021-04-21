package ua.khpi.oop.Kapelka14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Helper {
	static <T extends Route> void sort(MyCollection<T> collection, ESort choose) {
		boolean przEnd = true;
		while (przEnd) {
			przEnd = false;
			for (int i = 0; i < collection.getSize() - 1; i++) {
				switch (choose) {
				case TOTALNUMBEROFSEATS:
					if (collection.get(i).getTotal_number_of_seats()
							.compareTo(collection.get(i + 1).getTotal_number_of_seats()) > 0) {
						collection.swap(i, i + 1);
						przEnd = true;
					}
					break;
				case DAYOFTHEWEEK:
					if (collection.get(i).getDays_of_the_week()
							.compareTo(collection.get(i + 1).getDays_of_the_week()) > 0) {
						collection.swap(i, i + 1);
						przEnd = true;
					}
					break;
				case FLIGHTNUMBER:
					if (collection.get(i).getFlight_number().compareTo(collection.get(i + 1).getFlight_number()) > 0) {
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

	static void TransitRoutes(MyCollection<Route> collection) {
		String patternStation = "(Харьков)";
		String patternStatus = "(Промежуточная)";
		String patternDepartureTime = "((1[6-9])|(2[0-3])):[0-5][0-9]";
		String patternArrivalTime = "((1[6-9])|(2[0-3])):[0-5][0-9]";
		Pattern rStation = Pattern.compile(patternStation);
		Pattern rStatus = Pattern.compile(patternStatus);
		Pattern rDepartureTime = Pattern.compile(patternDepartureTime);
		Pattern rArrivalTime = Pattern.compile(patternArrivalTime);

		for (var value : collection) {
			if ((rStation.matcher(value.getStation_name())).find()
					&& (rStatus.matcher(value.getStatus_station())).find()
					&& (rDepartureTime.matcher(value.getDeparture_time())).find()
					&& (rArrivalTime.matcher(value.getArrival_time())).find()) {
				System.out.println("Маршрут " + value.getNameRoute() + " есть транзитным.");
			}
			if (!(rStation.matcher(value.getStation_name())).find()
					&& !(rStatus.matcher(value.getStatus_station())).find()
					&& !(rDepartureTime.matcher(value.getDeparture_time())).find()
					&& !(rArrivalTime.matcher(value.getArrival_time())).find()) {
				System.out.println("Маршрут " + value.getNameRoute() + " есть не транзитным.");
			}
			if ((rStation.matcher(value.getStation_name())).find()
					&& (rStatus.matcher(value.getStatus_station())).find()
					&& !(rDepartureTime.matcher(value.getDeparture_time())).find()
					&& !(rArrivalTime.matcher(value.getArrival_time())).find()) {
				System.out.println("Маршрут " + value.getNameRoute() + " есть не транзитным.");
			}
			if (!(rStation.matcher(value.getStation_name())).find()
					&& !(rStatus.matcher(value.getStatus_station())).find()
					&& (rDepartureTime.matcher(value.getDeparture_time())).find()
					&& (rArrivalTime.matcher(value.getArrival_time())).find()) {
				System.out.println("Маршрут " + value.getNameRoute() + " есть не транзитным.");
			}
			if ((rStation.matcher(value.getStation_name())).find()
					&& !(rStatus.matcher(value.getStatus_station())).find()
					&& (rDepartureTime.matcher(value.getDeparture_time())).find()
					&& (rArrivalTime.matcher(value.getArrival_time())).find()) {
				System.out.println("Маршрут " + value.getNameRoute() + " есть не транзитным.");
			}
			if ((rStation.matcher(value.getStation_name())).find()
					&& !(rStatus.matcher(value.getStatus_station())).find()
					&& !(rDepartureTime.matcher(value.getDeparture_time())).find()
					&& !(rArrivalTime.matcher(value.getArrival_time())).find()) {
				System.out.println("Маршрут " + value.getNameRoute() + " есть не транзитным.");
			}
		}
	}

	enum ESort {
		TOTALNUMBEROFSEATS, DAYOFTHEWEEK, FLIGHTNUMBER
	}

	static void saveToFile(String filename, String str) throws IOException {

		FileWriter file = new FileWriter(filename);
		file.write(str);
		file.close();
	}

	static String readFromFile(String filename) throws IOException {
		FileReader file = new FileReader(filename);
		String str = new String();

		int c = 0;
		while ((c = file.read()) != -1) {
			str += new String(new char[] { (char) c });
		}
		file.close();
		return str;
	}

	static MyCollection<Route> parsingPerson(String str) {
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
		while (str.indexOf("NameRoute: ") >= 0 && str.length() > 0) {
			name = str.substring(str.indexOf("NameRoute: ") + 11, str.indexOf("Station Name: ") - 1);
			station = str.substring(str.indexOf("Station Name: ") + 14, str.indexOf("Departure time: ") - 1);
			departure = str.substring(str.indexOf("Departure time: ") + 16, str.indexOf("Arrival time: ") - 1);
			arrival = str.substring(str.indexOf("Arrival time: ") + 14, str.indexOf("Number of free seats: ") - 1);
			number = str.substring(str.indexOf("Number of free seats: ") + 22, str.indexOf("Status station: ") - 1);
			status = str.substring(str.indexOf("Status station: ") + 16, str.indexOf("Total number of seats: ") - 1);
			total_number = str.substring(str.indexOf("Total number of seats: ") + 23,
					str.indexOf("Days of the week: ") - 1);
			days = str.substring(str.indexOf("Days of the week: ") + 18, str.indexOf("Flight number: ") - 1);
			flight = new String();
			for (int i = str.indexOf("Flight number: ") + 15; str.charAt(i) != '\n' && i < str.length(); i++) {
				flight += str.charAt(i);
			}

			try {
				array.add(new Route(name, station, departure, arrival, number, status, total_number, days, flight));

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = str.substring(str.indexOf(flight) + flight.length() + 1);
		}
		return array;
	}

	static void Auto() throws IOException {
		MyCollection<Route> collection = parsingPerson(readFromFile("DataRoute.txt"));
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

	static void Menu() throws IOException {
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
		ThreadFindAspects thr1 = null;
		ThreadFindAspects thr2 = null;
		ThreadFindAspects thr3 = null;
		while (prz) {
			System.out.println(
					"\n1.Добавить элемент\n2.Удалить элемент\n3.Сортировать\n4.Вывод всех элементов.\n5.Записать в файл\n6.Считать с файла\n7.Найти транзитные маршруты\n8.Многопоточное вычисление\n9.Сравнение\n0.Выход\nВаш выбор:");
			switch (scan.nextInt()) {
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
				try {
					collection.add(
							new Route(name, station, departure, arrival, number, status, total_number, days, flight));
				} catch (ParseException e) {
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
				switch (scan.nextInt()) {
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
				collection = parsingPerson(readFromFile(scan.nextLine()));
				break;
			case 7:
				Helper.TransitRoutes(collection);
				break;
			case 8:
				for (int i = 0; i < 500; i++) {
					try {
						collection.add(new Route("Минск-Запорожье", "Харьков", "00:19", "00:41", "68", "Промежуточная",
								"150", "21.03.2021", "2"));
					} catch (ParseException e) {
						System.out.println("Не удалось коректно считать");
						continue;
					}
				}
				System.out.println("Введите максимальное время ожидания (миллисекунды): ");
				int slp = 0;
				slp = scan.nextInt();
				thr1 = new ThreadFindAspects(collection, FindAspects.STATIONNAME);
				thr1.start();
				thr2 = new ThreadFindAspects(collection, FindAspects.STATUSSTATION);
				thr2.start();
				thr3 = new ThreadFindAspects(collection, FindAspects.TOTALNUMBEROFSEATS);
				thr3.start();
				try {
					Thread.sleep(slp);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				thr1.interrupt();
				thr2.interrupt();
				thr3.interrupt();
				collection.clear();
				break;
			case 9:
				try {
					Сomparison(collection);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

	static void Сomparison(MyCollection<Route> collection) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите максимальное время ожидания (миллисекунды): ");
		int slp = 0;
		slp = scan.nextInt();
		System.out.println("---------------------");
		System.out.println("Вывод линейно........");
		System.out.println("---------------------");
		long timeT = 0;
		long timeL = System.currentTimeMillis();;
		String pattern = null;
		String str = new String();
		int count = 0;
		
		for (int i = 0; i < 200; i++) {
			try {
				collection.add(new Route("Минск-Запорожье", "Харьков", "00:19", "00:41", "68", "Промежуточная",
						"150", "21.03.2021", "1"));
			} catch (ParseException e) {
				System.out.println("Не удалось коректно считать");
				continue;
			}
		}
		pattern = "(Харьков)";
		str = "Количество маршрутов с названием станции \"Харьков\": ";
		Pattern r = Pattern.compile(pattern);
		for (var value : collection) {
			if ((r.matcher(value.getStation_name())).find()) {
				Thread.sleep(10);
				count++;
			}
		}
		
		System.out.println(str + count);
		count = 0;
		pattern = "(Промежуточная)";
		str = "Количество маршрутов с статусом станции \"Промежуточная\": ";
		r = Pattern.compile(pattern);
		for (var value : collection) {
			if ((r.matcher(value.getStatus_station())).find()) {
				Thread.sleep(10);
				count++;
			}
		}

		System.out.println(str + count);
		count = 0;
		pattern = "(150)";
		str = "Количество маршрутов с количеством пустых мест в 150: ";
		r = Pattern.compile(pattern);
		for (var value : collection) {
			if ((r.matcher(value.getTotal_number_of_seats())).find()) {
				Thread.sleep(10);
				count++;
			}
		}

		System.out.println(str + count);
		timeL = System.currentTimeMillis() - timeL;

		System.out.println("---------------------");
		System.out.println("Вывод многопоточно...");
		System.out.println("---------------------");
		
		ThreadFindAspects thr1 = null;
		ThreadFindAspects thr2 = null;
		ThreadFindAspects thr3 = null;
		thr1 = new ThreadFindAspects(collection, FindAspects.STATIONNAME);
		thr1.start();
		thr2 = new ThreadFindAspects(collection, FindAspects.STATUSSTATION);
		thr2.start();
		thr3 = new ThreadFindAspects(collection, FindAspects.TOTALNUMBEROFSEATS);
		thr3.start();
		try {
			Thread.sleep(slp);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thr1.interrupt();
		thr2.interrupt();
		thr3.interrupt();
		if(thr1.getTime() < thr2.getTime())
			if(thr2.getTime() < thr3.getTime())
				timeT = thr3.getTime();
			else
				timeT = thr2.getTime();
		else
			if(thr1.getTime()<thr3.getTime())
				timeT = thr3.getTime();
			else 
				timeT = thr1.getTime();
		
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
		System.out.println("-_-_-Время выполнения-_-_");
		System.out.println("___Линейно__|Многопоточно");
		System.out.println(String.format("%12d|%12d", timeL, timeT));
		System.out.println(String.format("Потоки быстрее в: %7f", ((float) timeL / (float) timeT)));
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
		collection.clear();
	}
}

class ThreadFindAspects extends Thread {
	MyCollection<Route> collection;
	FindAspects findProp;
	public long time = 0;
	long getTime(){
		return time;
		
	}
	
	public ThreadFindAspects(MyCollection<Route> collection, FindAspects findProp) {
		this.collection = collection;
		this.findProp = findProp;
	}
	public void run() {
		long m = System.currentTimeMillis();
		String pattern = null;
		String str = new String();
		int count = 0;
		switch (findProp) {
		case STATIONNAME:
			pattern = "(Харьков)";
			str = "Количество маршрутов с названием станции \"Харьков\": ";
			break;
		case STATUSSTATION:
			pattern = "(Промежуточная)";
			str = "Количество маршрутов с статусом станции \"Промежуточная\": ";
			break;
		case TOTALNUMBEROFSEATS:
			pattern = "(150)";
			str = "Количество маршрутов с количеством пустых мест в 150: ";
			break;
		default:
			break;
		}

		Pattern r = Pattern.compile(pattern);
		try {
			for (var value : collection) {
				if (!isInterrupted()) {
					if ((r.matcher(value.getStation_name())).find()) {
						count++;
						Thread.sleep(1);
					}
				} else {
					throw new InterruptedException();
				}
				if (!isInterrupted()) {
					if ((r.matcher(value.getStatus_station())).find()) {
						count++;
						Thread.sleep(1);
					}
				} else {
					throw new InterruptedException();
				}
				if (!isInterrupted()) {
					if ((r.matcher(value.getTotal_number_of_seats())).find()) {
						count++;
						Thread.sleep(1);
					}
				} else {
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Превышено время ожидания потока");
		}
		time = System.currentTimeMillis() - m;
		System.out.println(str + count + "\nПрошло миллисекунд с начала выполнения: " + (time));
	}
}

enum FindAspects {
	TOTALNUMBEROFSEATS, STATUSSTATION, STATIONNAME
}