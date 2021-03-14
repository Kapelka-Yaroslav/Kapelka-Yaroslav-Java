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
		Route routeData = new Route("Лозовая-Харьков","Лозовая","15:20","15:24",55,"Начальная",150,new GregorianCalendar(2021, 11, 7),1);
		ticketOffice.add(routeData);
		ticketOffice.add( new Route("Харьков-Изюм","Маяк","14:52","14:53",61,"Промежуточная",200,new GregorianCalendar(2021, 11, 8),2));
		ticketOffice.add( new Route("Красноград-Харьков","Харьков","19:34","Времени отправления нету, так как это конечная станция.",78,"Конечная",170,new GregorianCalendar(2021, 1, 20),3));
		ticketOffice.add( new Route("Львов-Мариуполь","Льзов","01:07","01:12",55,"Начальная",230,new GregorianCalendar(2021, 2, 15),4));
		ticketOffice.add( new Route("Ужгород-Киев","Мукачево","17:59","18:05",69,"Промежуточная",200,new GregorianCalendar(2021, 2, 25),5));	
		System.out.println("Происходит поиск элемента в колекции...");
		System.out.println(ticketOffice.find(routeData));
		if (ticketOffice.find(routeData) == true)
		{
			System.out.println("Элемент в коллекции найден.");
		}
		else if (ticketOffice.find(routeData) == false)
		{
			System.out.println("Элемент в коллекции не найден.");
		}
		System.out.println("---------------");
		System.out.println("Вывод коллекции:");
		System.out.println(ticketOffice);
		System.out.println("---------------");
		System.out.println("Происходит удаление элемента из коллекции...");
		ticketOffice.delete(4);
		System.out.println("Элемент успешно удален");
		System.out.println("---------------");
		System.out.println("Вывод коллекции с удаленным элементом:");
		System.out.println(ticketOffice);
		System.out.println("---------------");
		System.out.println("Происходит сериализация и десериализация коллекции...");	
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
		
		System.out.println("Вывод коллекции в виде массива:");
		Route []mass = ticketOffice.toArray(new Route[ticketOffice.getSize()]);
		for(Route p : mass) 
		{
		System.out.println(p);
		}

	}	
}
