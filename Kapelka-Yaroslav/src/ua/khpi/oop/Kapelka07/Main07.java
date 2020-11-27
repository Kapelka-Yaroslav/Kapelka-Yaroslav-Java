package ua.khpi.oop.Kapelka07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main07 
{
	public static void main(String[] args) 
	{
		String Name_route1 = "Лозовая-Харьков";
		String Name_route2 = "Харьков-Изюм";
		String Station_name1 = "Лозовая";
		String Station_name2 = "Панютино";
		String Station_name3 = "Харьков";
		String Station_name4 = "Харьков";
		String Station_name5 = "Маяк";
		String Station_name6 = "Изюм";
		String arrival_time1 = "15:20";
		String arrival_time2 = "15:35";	
		String arrival_time3 = "19:13";
		String arrival_time4 = "11:55";
		String arrival_time5 = "14:52";
		String arrival_time6 = "15:41";
		String departure_time1 = "15:24";
		String departure_time2 = "15:36";
		String departure_time3 = "Времени отправления нету, так как это конечная станция.";
		String departure_time4 = "12:00";
		String departure_time5 = "14:53";
		String departure_time6 = "Времени отправления нету, так как это конечная станция.";
		int number_of_free_seats1 = 55;
		int number_of_free_seats2 = 78;
		int number_of_free_seats3 = 63;
		int number_of_free_seats4 = 87;
		int number_of_free_seats5 = 61;
		int number_of_free_seats6 = 75;
		String Status_station1 = "Начальная";
		String Status_station2 = "Промежуточная";		
		String Status_station3 = "Конечная";
		String Status_station4 = "Начальная";
		String Status_station5 = "Промежуточная";
		String Status_station6 = "Конечная";
		GregorianCalendar days_of_the_week1 = new GregorianCalendar(2020, 11, 7);
		days_of_the_week1.set(Calendar.HOUR_OF_DAY, 00);
		days_of_the_week1.set(Calendar.MINUTE, 00);
		days_of_the_week1.set(Calendar.SECOND, 00);
		GregorianCalendar days_of_the_week2 = new GregorianCalendar(2020, 11, 8);
		days_of_the_week2.set(Calendar.HOUR_OF_DAY, 00);
		days_of_the_week2.set(Calendar.MINUTE, 00);
		days_of_the_week2.set(Calendar.SECOND, 00);
		
		StationClass Station_list[] = new StationClass[3];
		Station_list[0] = new StationClass(Station_name1, arrival_time1, departure_time1, number_of_free_seats1, Status_station1);
		Station_list[1] = new StationClass(Station_name2, arrival_time2, departure_time2, number_of_free_seats2, Status_station2);
		Station_list[2] = new StationClass(Station_name3, arrival_time3, departure_time3, number_of_free_seats3, Status_station3);
		StationClass Station_list1[] = new StationClass[3];
		Station_list1[0] = new StationClass(Station_name4, arrival_time4, departure_time4, number_of_free_seats4, Status_station4);
		Station_list1[1] = new StationClass(Station_name5, arrival_time5, departure_time5, number_of_free_seats5, Status_station5);
		Station_list1[2] = new StationClass(Station_name6, arrival_time6, departure_time6, number_of_free_seats6, Status_station6);
		
		RoutesClass Route_list = new RoutesClass();
		Route_list.route[0] = new RouteClass(Name_route1, Station_list, 150, days_of_the_week1, 1);
		Route_list.route[1] = new RouteClass(Name_route2, Station_list1, 200, days_of_the_week2, 2);
		for(RouteClass route : Route_list.route)
		{
				route.outputData();		
				System.out.println();
		}
	}
}
