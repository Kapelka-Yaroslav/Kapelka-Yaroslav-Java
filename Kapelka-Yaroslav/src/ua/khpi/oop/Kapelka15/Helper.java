package ua.khpi.oop.Kapelka15;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Helper {
	static void Auto() {
		ArrayList<Route> collection = new ArrayList<Route>();
		collection.add(new Route("�������-�������", "�������", "15:20", "15:24", "55", "���������", "150",
				new GregorianCalendar(2021, 11, 7), "1"));
		collection.add(new Route("�������-����", "����", "14:52", "14:53", "61", "�������������", "200",
				new GregorianCalendar(2021, 11, 8), "2"));
		collection.add(new Route("����������-�������", "�������", "19:34",
				"������� ����������� ����, ��� ��� ��� �������� �������.", "78", "��������", "170",
				new GregorianCalendar(2021, 1, 20), "3"));
		collection.add(new Route("�����-���������", "�����", "01:07", "01:12", "55", "���������", "230",
				new GregorianCalendar(2021, 2, 15), "4"));
		collection.add(new Route("�������-����", "��������", "17:59", "18:05", "69", "�������������", "200",
				new GregorianCalendar(2021, 2, 25), "5"));

		for (var value : collection) {
			System.out.println(value);
		}
		System.out.println("\n\n����� ����������\n\n");
		sort(collection, ESort.TOTALNUMBEROFSEATS);
		for (var value : collection) {
			System.out.println(value);
		}
		collection.remove(0);
		collection.remove(0);
		collection.remove(0);
		collection.remove(0);
		collection.remove(0);
		System.out.println("\n\n����� ��������������\n\n");
		try {
			downloadSer("s", collection);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (var value : collection) {
			System.out.println(value);
		}

	}

	static void Menu() {
		ArrayList<Route> collection = new ArrayList<Route>();
		Scanner scan = new Scanner(System.in);
		String name = new String();
		String station = new String();
		String departure = new String();
		String arrival = new String();
		String number = new String();
		String status = new String();
		String total_number = new String();
		String days = new String();
		String flight = new String();
		boolean prz = true;
		int rez = 0;
		while (prz) {
			System.out.println(
					"\n1.�������� �������\n2.������� �������\n3.����� ���� ���������.\n4.�����������\n5.�����\n6.�����������\n7.��������������\n0.�����\n��� �����:");
			switch (scan.nextInt()) {
			case 1:
				scan.nextLine();
				System.out.println("��� ��������: ");
				name = scan.nextLine();
				System.out.println("��� �������: ");
				station = scan.nextLine();
				System.out.println("����� �������� �� �������: ");
				departure = scan.nextLine();
				System.out.println("����� ����������� �� �������: ");
				arrival = scan.nextLine();
				System.out.println("���������� ������ ����: ");
				number = scan.nextLine();
				System.out.println("������ �������: ");
				status = scan.nextLine();
				System.out.println("����� ���������� ����: ");
				total_number = scan.nextLine();
				System.out.println("���� ������ � ������� ����.�����.���: ");
				days = scan.nextLine();
				System.out.println("����� �����: ");
				flight = scan.nextLine();
				try {
					collection.add(
							new Route(name, station, departure, arrival, number, status, total_number, days, flight));
				} catch (ParseException e) {
					System.out.println("�� ������� �������� �������");
					continue;
				}
				break;
			case 2:
				System.out.println("������� id ��� ��������: ");
				collection.remove(scan.nextInt());
				break;
			case 3:
				System.out.println();
				for (var value : collection)
					System.out.println(value);
				break;
			case 4:
				System.out.println(
						"��� �����������?\n1.�� ���������� ������ ����.\n2.�� ��� ������.\n3.�� ������ ��������.\n��� �����: ");
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
			case 5:
				System.out.println(
						"�� ������ ���� ���������� �����\n1.�� ����� ��������\n2.�� ������� �������\n3.�� ��� ������\n��� �����: ");
				switch (scan.nextInt()) {
				case 1:
					System.out.println("������� ��� ��������: ");
					scan.nextLine();
					rez = find(collection, EFind.NAME, scan.nextLine());
					break;
				case 2:
					System.out.println("������� ������ �������: ");
					scan.nextLine();
					rez = find(collection, EFind.STATUSSTATION, scan.nextLine());
					break;
				case 3:
					System.out.println("������� ���� ������(d.m.y): ");
					scan.nextLine();
					rez = find(collection, EFind.DAYOFTHEWEEK, scan.nextLine());
					break;
				
				default:
					break;
				}
				if (rez == -1)
					System.out.println("������� �� ������");
				else
					System.out.println("Id ��������: " + rez);
				break;
			case 6:
				System.out.println("��� �������������?\n1.����������� ������\n2.XML\n��� �����: ");
				try {
					switch (scan.nextInt()) {
					case 1:
						System.out.println("������� ��� �����: ");
						scan.nextLine();
						saveSer(scan.nextLine(), collection);
						break;
					case 2:
						scan.nextLine();
						System.out.println("������� ��� �����: ");
						saveXml(scan.nextLine(), collection);
						break;

					default:
						break;
					}
				} catch (IOException e) {
					System.out.println("�� ������� ����� ����");
					continue;
				}
				break;
			case 7:
				System.out.println("��� ���������������?\n1.����������� ������\n2.XML\n��� �����: ");

				try {
					switch (scan.nextInt()) {
					case 1:
						scan.nextLine();
						System.out.println("������� ��� �����: ");
						downloadSer(scan.nextLine(), collection);
						break;
					case 2:
						scan.nextLine();
						System.out.println("������� ��� �����: ");
						downloadXml(scan.nextLine(), collection);
						break;

					default:
						break;
					}
				} catch (IOException e) {
					System.out.println("�� ������� ����� ����");
					continue;
				} catch (ClassNotFoundException e) {
					System.out.println("�� ������� ������������� ���");
					continue;
				}
				break;
			case 0:
				prz = false;
				break;
			default:
				continue;

			}
		}

		scan.close();
	}

	static <T extends Route> void sort(ArrayList<T> collection, ESort choose) {
		boolean przEnd = true;
		T temp = null;
		while (przEnd) {
			przEnd = false;
			for (int i = 0; i < collection.size() - 1; i++) {
				switch (choose) {
				case TOTALNUMBEROFSEATS:

					if (collection.get(i).getTotal_number_of_seats()
							.compareTo(collection.get(i + 1).getTotal_number_of_seats()) > 0) {
						temp = collection.get(i);
						collection.remove(i);
						collection.add(i + 1, temp);
						przEnd = true;
					}
					break;
				case DAYOFTHEWEEK:
					if (collection.get(i).getDays_of_the_week()
							.compareTo(collection.get(i + 1).getDays_of_the_week()) > 0) {
						temp = collection.get(i);
						collection.remove(i);
						collection.add(i + 1, temp);
						przEnd = true;
					}
					break;
				case FLIGHTNUMBER:
					if (collection.get(i).getFlight_number().compareTo(collection.get(i + 1).getFlight_number()) > 0) {
						temp = collection.get(i);
						collection.remove(i);
						collection.add(i + 1, temp);
						przEnd = true;
					}
					break;
				default:
					break;
				}
			}
		}

	}

	static <T extends Route> int find(ArrayList<T> collection, EFind choose, String str) {
		Route temp = null;
		try {
			switch (choose) {
			case NAME:
				temp = new Route(str, "����", "11:11", "11:11", "11", "����", "111", "22.22.2001", "1");
				break;
				case STATUSSTATION:
				temp = new Route("����-����", "����", "11:11", "11:11", "11", str, "111", "22.22.2001", "1");
				break;
			case DAYOFTHEWEEK:
				temp = new Route("����-����", "����", "11:11", "11:11", "11", "����", "111", str, "1");
				break;
			default:
				break;
			}
		} catch (ParseException | IllegalArgumentException e) {
			System.out.println("������� �������� ������");
			return -1;
		}
		for (int i = 0; i < collection.size(); i++) {
			switch (choose) {
			case NAME:
				if (collection.get(i).getNameRoute().equals(temp.getNameRoute()))
					return i;
				break;
			case STATUSSTATION:
				if (collection.get(i).getStatus_station().equals(temp.getStatus_station()))
					return i;
				break;
			case DAYOFTHEWEEK:
				if (collection.get(i).getDays_of_the_week().equals(temp.getDays_of_the_week()))
					return i;
				break;

			default:
				break;
			}
		}

		return -1;
	}

	static public void saveXml(String fileName, ArrayList<Route> collection) throws FileNotFoundException {
		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));

		for (var value : collection)
			encoder.writeObject(value);
		encoder.close();
		System.out.println("������������ ������ �������.");
	}

	static public void downloadXml(String fileName, ArrayList<Route> collection) throws FileNotFoundException {
		XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
		try {
			while (true) {
				collection.add((Route) d.readObject());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			d.close();
			System.out.println("�������������� ������ �������\n");
		} catch (Exception e) {
			throw e;
		}

	}

	static public void saveSer(String fileName, ArrayList<Route> collection) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		for (var value : collection)
			objectOutputStream.writeObject(value);
		objectOutputStream.close();
	}

	static public void downloadSer(String fileName, ArrayList<Route> collection)
			throws IOException, ClassNotFoundException {
		FileInputStream inStream = new FileInputStream(fileName);
		ObjectInputStream objectInStream = new ObjectInputStream(inStream);
		try {
			while (true) {
				collection.add((Route) objectInStream.readObject());
			}
		} catch (EOFException e) {
			objectInStream.close();
		}

	}

}

enum EFind {
	NAME, DAYOFTHEWEEK, STATUSSTATION
}

enum ESort {
	TOTALNUMBEROFSEATS, DAYOFTHEWEEK, FLIGHTNUMBER
}
