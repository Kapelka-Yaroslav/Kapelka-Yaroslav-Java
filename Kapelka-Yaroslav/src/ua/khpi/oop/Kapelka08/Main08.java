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
		String[] listOfStation_name1 = {"�������-�������", "�������-����������", "�������-����"};
		String[] listOfStation_name2 = {"����������-�������", "������-�������", "��������-�������"};
		String[] listOfdeparture_time1 = {"15:24", "15:59", "06:40"};
		String[] listOfdeparture_time2 = {"16:44", "06:58", "06:27"};
		String[] listOfarrival_time1 = {"19:13", "20:37", "10:14"};
		String[] listOfarrival_time2 = {"19:34", "7:45", "10:51"};
		String[] listOfstarting_station1 = {"�������", "�������", "�������"};	
		String[] listOfstarting_station2 = {"����������", "������", "��������"};
		String[] listOfterminal_station1 = {"�������", "����������", "����"};		
		String[] listOfterminal_station2 = {"�������", "�������", "�������"};
		String[] listOfintermediate_stations1 = {"��������", "������", "����"};
		String[] listOfintermediate_stations2 = {"��������", "�����������", "���������"};
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
					Route_list.route[i].outputData();
					System.out.println();
				}
				break;
				
			case 2:
				System.out.print("\n������� ����� ��������: ");
				int value = scan.nextInt();
				if(value < 1)
				{
					System.out.println("������. �������� ������ ������.");
					break;
				}				
				String[] list = new String[value];
				System.out.println("������� ������ �������� �������: ");
				scan.nextLine();
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list[i] = scan.nextLine();
				}
				String[] list1 = new String[value];
				System.out.println("������� ������ ������� �����������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list1[i] = scan.nextLine();
				}
				String[] list2 = new String[value];
				System.out.println("������� ������ ������� ��������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list2[i] = scan.nextLine();
				}
				String[] list3 = new String[value];
				System.out.println("������� ������ ��������� �������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list3[i] = scan.nextLine();
				}
				String[] list4 = new String[value];
				System.out.println("������� ������ �������� �������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list4[i] = scan.nextLine();
				}
				String[] list5 = new String[value];
				System.out.println("������� ������ ������������� �������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list5[i] = scan.nextLine();
				}
				String[] list6 = new String[value];
				System.out.println("������� ������ ������� ����������� ��� ������������� �������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list6[i] = scan.nextLine();
				}
				String[] list7 = new String[value];
				System.out.println("������� ������ ������� �������� ��� ������������� �������: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list7[i] = scan.nextLine();
				}
				int[] list8 = new int[value];
				System.out.println("������� ������ ���������� ������ ����: ");
				for (int i = 0; i < value; i++) 
				{
					System.out.print(i+1 + ". ");
					list8[i] = scan.nextInt();
				}
				
				ArrayList<GregorianCalendar> List_days_of_the_week3 = new ArrayList<GregorianCalendar>();
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
				List_days_of_the_week3.add(days_of_the_week7);
				
				GregorianCalendar days_of_the_week8 = new GregorianCalendar();
				System.out.print("������� ���: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.YEAR, value);
				System.out.print("������� �����: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.MONTH, value);
				System.out.print("������� ����: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.DAY_OF_MONTH, value);
				System.out.print("������� ����: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.HOUR_OF_DAY, value);
				System.out.print("������� ������: ");
				value = scan.nextInt();
				days_of_the_week8.set(Calendar.MINUTE, value);
				List_days_of_the_week3.add(days_of_the_week8);
				
				GregorianCalendar days_of_the_week9 = new GregorianCalendar();
				System.out.print("������� ���: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.YEAR, value);
				System.out.print("������� �����: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.MONTH, value);
				System.out.print("������� ����: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.DAY_OF_MONTH, value);
				System.out.print("������� ����: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.HOUR_OF_DAY, value);
				System.out.print("������� ������: ");
				value = scan.nextInt();
				days_of_the_week9.set(Calendar.MINUTE, value);
				List_days_of_the_week3.add(days_of_the_week9);
				
				System.out.print("������� ���������� ����: ");
				scan.nextLine();
				int total = scan.nextInt();
				System.out.print("������� ����� �����: ");
				value = scan.nextInt();
				System.out.println("\n������� ��������.\n");
				
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
