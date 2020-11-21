package ua.khpi.oop.Kapelka07;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
public class Main07 
{
	public static void main(String[] args) 
	{
		String[] listOfStation_name1 = {"Лозовая-Харьков", "Харьков-Гавриловка", "Харьков-Изюм"};
		String[] listOfStation_name2 = {"Красноград-Харьков", "Мерефа-Харьков", "Славянск-Харьков"};
		String[] listOfdeparture_time1 = {"15:24", "15:59", "06:40"};
		String[] listOfdeparture_time2 = {"16:44", "06:58", "06:27"};
		String[] listOfarrival_time1 = {"19:13", "20:37", "10:14"};
		String[] listOfarrival_time2 = {"19:34", "7:45", "10:51"};
		String[] listOfstarting_station1 = {"Лозовая", "Харьков", "Харьков"};	
		String[] listOfstarting_station2 = {"Красноград", "Мерефа", "Славянск"};
		String[] listOfterminal_station1 = {"Харьков", "Гавриловка", "Изюм"};		
		String[] listOfterminal_station2 = {"Харьков", "Харьков", "Харьков"};
		String[] listOfintermediate_stations1 = {"Панютино", "Мерефа", "Маяк"};
		String[] listOfintermediate_stations2 = {"Власовка", "Покотиловка", "Гусаровка"};
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
		
		RouteClassList Route_list = new RouteClassList();
		Route_list.route[0] = new RouteClass(listOfStation_name1, listOfdeparture_time1, listOfarrival_time1, listOfstarting_station1, listOfterminal_station1, listOfintermediate_stations1, listOfdeparture_time_of_intermediate_stations1, listOfarrival_time_of_intermediate_stations1, listOfnumber_of_free_seats1, 150, List_days_of_the_week1, 1);
		Route_list.route[1] = new RouteClass(listOfStation_name2, listOfdeparture_time2, listOfarrival_time2, listOfstarting_station2, listOfterminal_station2, listOfintermediate_stations2, listOfdeparture_time_of_intermediate_stations2, listOfarrival_time_of_intermediate_stations2, listOfnumber_of_free_seats2, 200, List_days_of_the_week2, 2);
		for (RouteClass routeclass : Route_list.route) 
		{
			routeclass.outputData();
			System.out.println();
		}
	}
}
