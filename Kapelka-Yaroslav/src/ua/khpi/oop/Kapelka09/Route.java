package ua.khpi.oop.Kapelka09;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Route implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private String name_route;	
	private String station_name;
	private String departure_time;
	private String arrival_time;
	private int number_of_free_seats;
	private String status_station;
	private int total_number_of_seats;
	private GregorianCalendar days_of_the_week;
	private int flight_number;
	public void setNameRoute(String name_route) 
	{
		this.name_route = name_route;
	}
	public String getNameRoute() 
	{
		return name_route;
	}
	public String getStation_name()
	{
		return station_name;
	}
	public void setStation_name(String station_name)
	{
		this.station_name = station_name;
	}
	public String getDeparture_time()
	{
		return departure_time;
	}
	public void setDeparture_time(String departure_time)
	{
		this.departure_time = departure_time;
	}
	public String getArrival_time()
	{
		return arrival_time;
	}
	public void setArrival_time(String arrival_time)
	{
		this.arrival_time = arrival_time;
	}
	public int getNumber_of_free_seats()
	{
		return number_of_free_seats;
	}
	public void setNumber_of_free_seats(int number_of_free_seats)
	{
		this.number_of_free_seats = number_of_free_seats;
	}
	public String getStatus_station()
	{
		return status_station;
	}
	public void setStatus_station(String status_station)
	{
		this.status_station = status_station;
	}
	public void setTotal_number_of_seats(int total_number_of_seats)
	{
		this.total_number_of_seats = total_number_of_seats;
	}
	public int getTotal_number_of_seats() 
	{
		return total_number_of_seats;
	}
	public void setDays_of_the_week(GregorianCalendar days_of_the_week) 
	{
		this.days_of_the_week = days_of_the_week;
	}
	public GregorianCalendar getDays_of_the_week() 
	{
		return days_of_the_week;
	}
	public int getFlight_number()
	{
		return flight_number;
	}
	public void setFlight_number(int flight_number)
	{
		this.flight_number = flight_number;
	}
	
	
	public Route() 
	{
		super();
	}
	public void print() 
	{
		System.out.println("\nИмя маршрута: " + this.getNameRoute()+"\nИмя станции: "+ this.getStation_name() + "\nВремя прибытия на станцию: " + this.getArrival_time()+ "\nВремя отправления со станции: " + this.getDeparture_time()+"\nКоличество пустых мест: "+ this.getNumber_of_free_seats()+"\nСтатус станции: "+ this.getStatus_station()+"\nОбщее количество мест: "+ this.getTotal_number_of_seats()+"\nДень недели: "+ this.getDays_of_the_week().getTime()+"\nНомер рейсу: "+ this.getFlight_number());		
	}
	
	@Override
	public String toString() 
	{
		return new String("\nИмя маршрута: " + this.getNameRoute()+"\nИмя станции: "+ this.getStation_name() + "\nВремя прибытия на станцию: " + this.getArrival_time()+ "\nВремя отправления со станции: " + this.getDeparture_time()+"\nКоличество пустых мест: "+ this.getNumber_of_free_seats()+"\nСтатус станции: "+ this.getStatus_station()+"\nОбщее количество мест: "+ this.getTotal_number_of_seats()+"\nДень недели: "+ this.getDays_of_the_week().getTime()+"\nНомер рейсу: "+ this.getFlight_number());
	}
	Route(String name, int total_number,GregorianCalendar days,int flight)
	{
		this.setNameRoute(name);
		setTotal_number_of_seats(total_number);
		this.setDays_of_the_week(days);
		setFlight_number(flight);
	}
	Route(String name, String name1, String time,String time1, int number, String status, int total_number, GregorianCalendar days,int flight)
	{
		this.setNameRoute(name);
		this.setStation_name(name1);
		this.setArrival_time(time);
		this.setDeparture_time(time1);
		this.setNumber_of_free_seats(number);
		this.setStatus_station(status);
		setTotal_number_of_seats(total_number);
		this.setDays_of_the_week(days);
		setFlight_number(flight);
		
	}                                                                                      
}