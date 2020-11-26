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
		String Station_name1 = "�������-�������";
		String Station_name2 =  "�������-����������";
		String Station_name3 = "�������-����";
		String Station_name4 = "����������-�������";
		String Station_name5 = "������-�������";
		String Station_name6 = "��������-�������";
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
		String starting_station1 = "�������";	
		String starting_station2 = "�������";
		String starting_station3 = "�������";
		String starting_station4 = "����������";
		String starting_station5 = "������";
		String starting_station6 = "��������";
		String terminal_station1 = "�������";		
		String terminal_station2 = "����������";
		String terminal_station3 = "����";
		String terminal_station4 = "�������";
		String terminal_station5 = "�������";
		String terminal_station6 = "�������";
		String intermediate_stations1 = "��������";
		String intermediate_stations2 = "������";
		String intermediate_stations3 =  "����";
		String intermediate_stations4 = "��������";
		String intermediate_stations5 = "�����������";
		String intermediate_stations6 = "���������";
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
			System.out.println("����� ����� �� ������ ��������?");
			System.out.println("1. ������� ������");
			System.out.println("2. �������� �������");
			System.out.println("3. ������� �������");
			System.out.println("4. ������������� ������");
			System.out.println("5. ��������������� ������");
			System.out.println("6. ��������� ���������");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_");
			System.out.print("��� �����: ");
			
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
				System.out.print("\n������� ����� ��������: ");
				int value = scan.nextInt();
				if(value < 1)
				{
					System.out.print("������. �������� ������ ������.");
					break;
				}	
				scan.nextLine();
				System.out.print("������� �������� �������: ");
				String list = scan.nextLine();
				System.out.print("������� ������� �����������: ");
				String list1 = scan.nextLine();
				System.out.print("������� ������� ��������: ");
				String list2 = scan.nextLine();
				System.out.print("������� ��������� �������: ");
				String list3 = scan.nextLine();
				System.out.print("������� �������� �������: ");
				String list4 = scan.nextLine();
				System.out.print("������� ������������� �������: ");
				String list5 = scan.nextLine();
				System.out.print("������� ����� �������� ��� ������������� �������: ");
				String list6 = scan.nextLine();
				System.out.print("������� ����� ����������� ��� ������������� �������: ");
				String list7 = scan.nextLine();
				System.out.print("������� ���������� ������ ����: ");
				int list8 = scan.nextInt();
				
				GregorianCalendar days_of_the_week7 = new GregorianCalendar();
				System.out.print("������� ���: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.YEAR, value);
				System.out.print("������� �����: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.MONTH, value);
				System.out.print("������� ����: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.DAY_OF_MONTH, value);
				System.out.print("������� ����: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.HOUR_OF_DAY, value);
				System.out.print("������� ������: ");
				value = scan.nextInt();
				days_of_the_week7.set(Calendar.MINUTE, value);
				
				System.out.print("������� ����� ���������� ����: ");
				int total = scan.nextInt();
				System.out.print("������� ����� �����: ");;
				value = scan.nextInt();
				System.out.println("\n������� ��������.\n");
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
				
				System.out.print("������� ����� �������� ��� ��������: ");
				int position = scan.nextInt();
				if(position > Route_list.getSize() || position < 1 && position > Station_list.getSize() || position < 1)
				{
					System.out.println("������.������������ �����.");
					break;
				}
				Route_list.deleteElement(position);
				Station_list.deleteElementStation(position);
				System.out.println("\n������� ������.\n");
				
				break;
				
			case 4:
				String address = new File("").getAbsolutePath(); //����� ��������� ����������	
				File folder = new File(address);                 //�������� �����
				File[] arrayFiles = folder.listFiles();          //������ ������ � ������� ����������
				String filename;						         //�������� ����� ��� ������
				String currentDirectory = address;		         //������ ������� ����������
				String highestDir = folder.getName();	         //�������� ����������� ���������� ������� ����������
				
				boolean stop2 = false;  //����� �� ����� ������ ����������
				int index = 0;
				int choise2 = 0;
				
				System.out.print("\n������� ��� XML �����: ");
				scan.nextLine();
				filename = scan.nextLine();
				
				if (filename.indexOf(".xml") == -1) {
					filename += ".xml";
				}
				
				while(!stop2)
				{
					index = 0;
					
					System.out.println("\n������� ����: " + currentDirectory);
					System.out.println("������� ��� ����� XML: " + filename);
					System.out.println("\n����� � �������� � ������� ����:");
					for (index = 0; index < arrayFiles.length; index++) {
						System.out.println(index+1 + ". " + arrayFiles[index].toString().substring(currentDirectory.length()+1));
					}
					
					System.out.println();
					System.out.println("����� ����� �� ������ ��������?");
					System.out.println("1. �������� XML-���� � ������� ����������");
					System.out.println("2. ������� �� ���� ������� ����� �� �����");
					System.out.println("3. ����� � �����");
					System.out.println("4. �������� ��� ����� XML");
					System.out.println("5. ����� �� ������������");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.print("��� �����: ");
					choise2 = scan.nextInt();
					
					switch(choise2)
					{
					case 1:
						stop2 = true;
						break;
						
					case 2:
						if(folder.getName().equals(highestDir))
						{
							System.out.print("\n�� �� ������ ��������� �� ���� ������� ����� �� �����");
							break;
						}
						currentDirectory = currentDirectory.substring(0, currentDirectory.indexOf(folder.getName())-1);
						folder = new File(currentDirectory);
						arrayFiles = folder.listFiles();	//������ ������ � ������� ����������
						
						break;
						
					case 3:
						boolean choise3 = false;
						
						while(!choise3)
						{
							System.out.print("\n�������� ����� ��������: ");
							index = scan.nextInt();
							if(index < 1 || index > arrayFiles.length || !arrayFiles[index-1].isDirectory())
							{
								System.out.println("��� �� �������. ���������� �����.");
							}
							else
							{
								currentDirectory = arrayFiles[index-1].toString();
								System.out.println("����� ������� �������: " + currentDirectory);
								folder = new File(currentDirectory);
								arrayFiles = folder.listFiles();	//������ ������ � ������� ����������
								choise3 = true;
							}
						}
						break;
						
					case 4:
						System.out.print("\n������� ��� XML �����: ");
						scan.nextLine();
						filename = scan.nextLine();
						
						if (filename.indexOf(".xml") == -1) {
							filename += ".xml";
						}
						break;
						
					case 5:
						System.out.println("����� �� ������� ������������");
						break;
						
					default:
						System.out.println("������. ������������ �������. ���������� ��� ���");
						break;					
					
					}
					
				}
				address = currentDirectory;
				System.out.println("\n���� ����� ������� � ������� �������: " + address);
				System.out.println("��� ����� XML: " + filename);
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
				System.out.println("������������ ������ �������.\n");
				
				break;
				
			case 5:
				address = new File("").getAbsolutePath();	//����� ��������� ����������
				folder = new File(address);					//�������� �����
				arrayFiles = folder.listFiles();			//������ ������ � ������� ����������
				currentDirectory = address;					//������ ������� ����������
				highestDir = folder.getName();				//�������� ����������� ���������� ������� ����������
				
				stop2 = false;	//����� �� ����� ������ ����������
				index = 0;
				choise2 = 0;
				
				while(!stop2)
				{
					index = 0;
					
					System.out.println("\n������� ����: " + currentDirectory);
					System.out.println("����� � �������� � ������� ����:");
					for (index = 0; index < arrayFiles.length; index++) {
						System.out.println(index+1 + ". " + arrayFiles[index].toString().substring(currentDirectory.length()+1));
					}
					
					System.out.println();
					System.out.println("����� ����� �� ������ ��������?");
					System.out.println("1. ��������� XML-���� � ������� ��������");
					System.out.println("2. ������� �� ���� ������� ����� �� �����");
					System.out.println("3. ����� � �����");
					System.out.println("4. ����� �� ������������");
					System.out.println("======================================");
					System.out.print("��� �����: ");
					choise2 = scan.nextInt();
					
					switch(choise2)
					{
					case 1:
						System.out.print("\n������� ID �����: ");
						index = scan.nextInt();
						if(arrayFiles[index-1].getName().indexOf(".xml")==-1 || arrayFiles[index-1].isDirectory())
						{
							System.out.println("��� �� ���� .XML.");
							break;
						}
						
						stop2 = true;
						break;
						
					case 2:
						if(folder.getName().equals(highestDir))
						{
							System.out.println("�� �� ������ ��������� �� ���� ������� � �����.");
							break;
						}
						currentDirectory = currentDirectory.substring(0, currentDirectory.indexOf(folder.getName())-1);
						folder = new File(currentDirectory);
						arrayFiles = folder.listFiles();	//������ ������ � ������� ����������
						
						break;
						
					case 3:
						boolean choise3 = false;
						
						while(!choise3)
						{
							System.out.print("\n�������� ����� ��������: ");
							index = scan.nextInt();
							if(index < 1 || index > arrayFiles.length || !arrayFiles[index-1].isDirectory())
							{
								System.out.println("��� �� �������. ���������� �����.");
							}
							else
							{
								currentDirectory = arrayFiles[index-1].toString();
								System.out.println("����� ������� �������: " + currentDirectory);
								folder = new File(currentDirectory);
								arrayFiles = folder.listFiles();	//������ ������ � ������� ����������
								choise3 = true;
							}
						}
						break;
						
					case 4:
						System.out.println("����� �� ������� ������������");
						stop2 = true;
						break;
						
					default:
						System.out.println("������. ������������ �������. ���������� ��� ���");
						break;					
					
					}
					
				}
				address = currentDirectory;
				System.out.println("����� ����� XML: " + address + "\\" + arrayFiles[index-1].getName());
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
				System.out.println("�������������� ������ �������.\n");
				
				break;
				
			case 6:
				System.out.println("\n���������� ���������");
				stop = true;
				break;
				
			default:
				System.out.println("������. ������������ �������. ���������� ��� ���.");
				break;
			}
		}
	}
}
