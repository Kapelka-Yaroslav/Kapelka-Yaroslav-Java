package ua.khpi.oop.Kapelka07;

import java.util.GregorianCalendar;


public class RouteClass 
{	
	private String name_route;
	private int total_number_of_seats;
	private GregorianCalendar days_of_the_week;
	private int flight_number;
	StationClass[] station = new StationClass[3];
	RouteClass route;
	public StationClass[] getStation()
	{
		return station;
	}
	public void setStation(StationClass[] station)
	{
		this.station = station;
	}
	public String getName_route()
	{
		return name_route;
	}
	public void setName_route(String name_route)
	{
		this.name_route = name_route;
	}
	public int getTotal_number_of_seats()
	{
		return total_number_of_seats;
	}
	public void setTotal_number_of_seats(int total_number_of_seats)
	{
		this.total_number_of_seats = total_number_of_seats;
	}
	
	public GregorianCalendar getDay_of_the_week()
	{
		return days_of_the_week;
	}
	public void setDays_of_the_week(GregorianCalendar days_of_the_week)
	{
		this.days_of_the_week = days_of_the_week;
	}
	public int getFlight_number()
	{
		return flight_number;
	}
	public void setFlight_number(int flight_number)
	{
		this.flight_number = flight_number;
	}
	public RouteClass() {};
	
	public RouteClass(String name,StationClass[] station, int total_number,GregorianCalendar days,int flight)
	{
		this.name_route = name;
		this.station = station;
		total_number_of_seats = total_number;
		this.days_of_the_week = days;
		flight_number = flight;
	}
	public void outputData() 
	{
		System.out.println("Название маршрута: " + name_route);
		System.out.println("Информация о станциях, присутствующих в даном маршруте: ");
		for (int i = 0; i < station.length; i++) 
		{
			System.out.println("Информация о станции номер: " + (i + 1) + ". ");
			station[i].outputDataStation();
		}
		System.out.println("Общее количество мест: " + total_number_of_seats);
		System.out.println("День недели, когда доступен маршрут: " + days_of_the_week.getTime());
		System.out.println("Номер рейса: " + flight_number);
	}
}
