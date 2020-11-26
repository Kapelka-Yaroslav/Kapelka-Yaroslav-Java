package ua.khpi.oop.Kapelka07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main07 
{
	public static void main(String[] args) 
	{
		
		String Station_name1 = "Лозовая-Харьков";
		String Station_name2 =  "Харьков-Гавриловка";
		String Station_name3 = "Харьков-Изюм";
		String Station_name4 = "Красноград-Харьков";
		String Station_name5 = "Мерефа-Харьков";
		String Station_name6 = "Славянск-Харьков";
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
		String starting_station1 = "Лозовая";	
		String starting_station2 = "Харьков";
		String starting_station3 = "Харьков";
		String starting_station4 = "Красноград";
		String starting_station5 = "Мерефа";
		String starting_station6 = "Славянск";
		String terminal_station1 = "Харьков";		
		String terminal_station2 = "Гавриловка";
		String terminal_station3 = "Изюм";
		String terminal_station4 = "Харьков";
		String terminal_station5 = "Харьков";
		String terminal_station6 = "Харьков";
		String intermediate_stations1 = "Панютино";
		String intermediate_stations2 = "Мерефа";
		String intermediate_stations3 =  "Маяк";
		String intermediate_stations4 = "Власовка";
		String intermediate_stations5 = "Покотиловка";
		String intermediate_stations6 = "Гусаровка";
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
		
		RoutesClass Route_list = new RoutesClass();
		Route_list.route[0] = new RouteClass(150, days_of_the_week1, 1);
		Route_list.route[1] = new RouteClass(200, days_of_the_week2, 2);
		Route_list.route[2] = new RouteClass(250, days_of_the_week3, 3);
		Route_list.route[3] = new RouteClass(300, days_of_the_week4, 4);
		Route_list.route[4] = new RouteClass(270, days_of_the_week5, 5);
		Route_list.route[5] = new RouteClass(120, days_of_the_week6, 6);
		RouteClass Station_list = new RouteClass();
		Station_list.station[0] = new StationClass(Station_name1, departure_time1, arrival_time1, starting_station1, terminal_station1, intermediate_stations1, departure_time_of_intermediate_stations1, arrival_time_of_intermediate_stations1, number_of_free_seats1);
		Station_list.station[1] = new StationClass(Station_name2, departure_time2, arrival_time2, starting_station2, terminal_station2, intermediate_stations2, departure_time_of_intermediate_stations2, arrival_time_of_intermediate_stations2, number_of_free_seats2);
		Station_list.station[2] = new StationClass(Station_name3, departure_time3, arrival_time3, starting_station3, terminal_station3, intermediate_stations3, departure_time_of_intermediate_stations3, arrival_time_of_intermediate_stations3, number_of_free_seats3);
		Station_list.station[3] = new StationClass(Station_name4, departure_time4, arrival_time4, starting_station4, terminal_station4, intermediate_stations4, departure_time_of_intermediate_stations4, arrival_time_of_intermediate_stations4, number_of_free_seats4);
		Station_list.station[4] = new StationClass(Station_name5, departure_time5, arrival_time5, starting_station5, terminal_station5, intermediate_stations5, departure_time_of_intermediate_stations5, arrival_time_of_intermediate_stations5, number_of_free_seats5);
		Station_list.station[5] = new StationClass(Station_name6, departure_time6, arrival_time6, starting_station6, terminal_station6, intermediate_stations6, departure_time_of_intermediate_stations6, arrival_time_of_intermediate_stations6, number_of_free_seats6);
		for(int  i = 0; i < 6; i++)
		{
				Station_list.station[i].outputDataStation();
				Route_list.route[i].outputData();		
				System.out.println();
		}
	}
}
