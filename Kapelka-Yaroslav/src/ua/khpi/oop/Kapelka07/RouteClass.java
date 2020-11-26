package ua.khpi.oop.Kapelka07;

import java.util.GregorianCalendar;


public class RouteClass 
{
	private int total_number_of_seats;
	private GregorianCalendar days_of_the_week;
	private int flight_number;
	StationClass station[] = new StationClass[6];
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
	
	public RouteClass(int total_number,GregorianCalendar days,int flight)
	{
		total_number_of_seats = total_number;
		this.days_of_the_week = days;
		flight_number = flight;
	}
	public void outputData() 
	{
		System.out.println("Общее количество мест: " + total_number_of_seats);
		System.out.println("День недели: " + days_of_the_week.getTime());
		System.out.println("Номер рейса: " + flight_number);
	}
}
