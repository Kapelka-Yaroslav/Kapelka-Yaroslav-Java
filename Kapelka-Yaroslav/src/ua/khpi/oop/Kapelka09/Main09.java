package ua.khpi.oop.Kapelka09;

import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.GregorianCalendar;
//import java.util.Scanner;

public class Main09 
{
	public static void main(String[] args) 
	{
		MyCollection<Route> ticketOffice = new MyCollection<Route>();
		Route routeData = new Route("�������-�������","�������","15:20","15:24",55,"���������",150,new GregorianCalendar(2021, 11, 7),1);
		ticketOffice.add(routeData);
		ticketOffice.add( new Route("�������-����","����","14:52","14:53",61,"�������������",200,new GregorianCalendar(2021, 11, 8),2));
		ticketOffice.add( new Route("����������-�������","�������","19:34","������� ����������� ����, ��� ��� ��� �������� �������.",78,"��������",170,new GregorianCalendar(2021, 1, 20),3));
		ticketOffice.add( new Route("�����-���������","�����","01:07","01:12",55,"���������",230,new GregorianCalendar(2021, 2, 15),4));
		ticketOffice.add( new Route("�������-����","��������","17:59","18:05",69,"�������������",200,new GregorianCalendar(2021, 2, 25),5));	
		System.out.println("���������� ����� �������� � ��������...");
		System.out.println(ticketOffice.find(routeData));
		if (ticketOffice.find(routeData) == true)
		{
			System.out.println("������� � ��������� ������.");
		}
		else if (ticketOffice.find(routeData) == false)
		{
			System.out.println("������� � ��������� �� ������.");
		}
		System.out.println("---------------");
		System.out.println("����� ���������:");
		System.out.println(ticketOffice);
		System.out.println("---------------");
		System.out.println("���������� �������� �������� �� ���������...");
		ticketOffice.delete(4);
		System.out.println("������� ������� ������");
		System.out.println("---------------");
		System.out.println("����� ��������� � ��������� ���������:");
		System.out.println(ticketOffice);
		System.out.println("---------------");
		System.out.println("���������� ������������ � �������������� ���������...");	
		try 
		{
			ticketOffice.saveXml("SaveXML.xml");

			ticketOffice.clear();
			
			System.out.println(ticketOffice);	
			
			ticketOffice.downloadXml("SaveXML.xml");	
			
			System.out.println(ticketOffice);
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("����� ��������� � ���� �������:");
		Route []mass = ticketOffice.toArray(new Route[ticketOffice.getSize()]);
		for(Route p : mass) 
		{
		System.out.println(p);
		}

	}	
}
