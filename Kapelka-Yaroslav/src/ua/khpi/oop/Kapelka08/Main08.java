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
		String Name_route1 = "�������-�������";
		String Name_route2 = "�������-����";
		String Station_name1 = "�������";		
		String Station_name2 = "��������";
		String Station_name3 = "�������";
		String Station_name4 = "�������";
		String Station_name5 = "����";
		String Station_name6 = "����";
		String arrival_time1 = "15:20";
		String arrival_time2 = "15:35";
		String arrival_time3 = "19:13";
		String arrival_time4 = "11:55";
		String arrival_time5 = "14:52";
		String arrival_time6 = "15:41";
		String departure_time1 = "15:24";
		String departure_time2 = "15:36";
		String departure_time3 = "������� ����������� ����, ��� ��� ��� �������� �������.";
		String departure_time4 = "12:00";
		String departure_time5 = "14:53";		
		String departure_time6 = "������� ����������� ����, ��� ��� ��� �������� �������.";
		int number_of_free_seats1 = 55;
		int number_of_free_seats2 = 78;
		int number_of_free_seats3 = 63;
		int number_of_free_seats4 = 87;
		int number_of_free_seats5 = 61;
		int number_of_free_seats6 = 75;
		String Status_station1 = "���������";	
		String Status_station2 = "�������������";
		String Status_station3 = "��������";
		String Status_station4 = "���������";	
		String Status_station5 = "�������������";
		String Status_station6 = "��������";
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
				for(RouteClass route : Route_list.route)
				{
						route.outputData();		
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
				System.out.print("������� �������� ��������: ");
				String list = scan.nextLine();
				System.out.print("������� ���������� �������, ������� ����� �������������� � ��������: ");
				int count_stan = scan.nextInt();
				StationClass newStation[] = new StationClass[count_stan];
				for(int i = 0; i < count_stan; i++)
				{
					scan.nextLine();
					System.out.print("������� �������� �������: ");
					String list1 = scan.nextLine();
					System.out.print("������� ����� �������� �� �������: ");
					String list2 = scan.nextLine();
					System.out.print("������� ����� ����������� � �������: ");
					String list3 = scan.nextLine();
					System.out.print("������� ���������� ������ ����: ");
					int list4 = scan.nextInt();
					scan.nextLine();
					System.out.print("������� ������ �������: ");				
					String list5 = scan.nextLine();
					newStation[i] = new StationClass(list1,list2,list3,list4,list5);
				}		
				scan.nextLine();
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
				System.out.print("������� ����� �����: ");
				value = scan.nextInt();
				System.out.println("\n������� ��������.\n");
				
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
				
				System.out.print("������� ����� �������� ��� ��������: ");
				int position = scan.nextInt();
				if(position > Route_list.getSize() || position < 1)
				{
					System.out.println("������.������������ �����.");
					break;
				}
				Route_list.deleteElement(position);
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
