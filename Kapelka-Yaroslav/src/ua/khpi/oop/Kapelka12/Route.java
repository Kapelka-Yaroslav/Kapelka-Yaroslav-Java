package ua.khpi.oop.Kapelka12;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Route implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private String name_route;	
	private String station_name;
	private String departure_time;
	private String arrival_time;
	private String number_of_free_seats;
	private String status_station;
	private String total_number_of_seats;
	private Calendar days_of_the_week;
	private String flight_number;
	public void setNameRoute(String name_route) 
	{
		String pattern = "^\\b[А-Я][а-я]{1,}[-]\\b[А-Я][а-я]{1,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(name_route);
		if(!m.find())
			throw new IllegalArgumentException();;
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
		String pattern = "^\\b[А-Я][а-я]{1,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(station_name);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.station_name = station_name;
	}
	public String getDeparture_time()
	{
		return departure_time;
	}
	public void setDeparture_time(String departure_time)
	{
		String pattern = "^(([0,1][0-9])|(2[0-3])):[0-5][0-9]$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(departure_time);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.departure_time = departure_time;
	}
	public String getArrival_time()
	{
		return arrival_time;
	}
	public void setArrival_time(String arrival_time)
	{
		String pattern = "^(([0,1][0-9])|(2[0-3])):[0-5][0-9]$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(arrival_time);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.arrival_time = arrival_time;
	}
	public String getNumber_of_free_seats()
	{
		return number_of_free_seats;
	}
	public void setNumber_of_free_seats(String number_of_free_seats)
	{
		String pattern = "^[0-9]{2}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(number_of_free_seats);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.number_of_free_seats = number_of_free_seats;
	}
	public String getStatus_station()
	{
		return status_station;
	}
	public void setStatus_station(String status_station)
	{
		String pattern = "^\\b[А-Я][а-я]{1,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(status_station);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.status_station = status_station;
	}
	public void setTotal_number_of_seats(String total_number_of_seats)
	{
		String pattern = "^[0-9]{3}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(total_number_of_seats);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.total_number_of_seats = total_number_of_seats;
	}
	public String getTotal_number_of_seats() 
	{
		return total_number_of_seats;
	}
	public void setDays_of_the_week(String days_of_the_week) throws ParseException
	{
		String pattern = "^[0-9]{2}[.][0-9]{1,2}[.][0-2][0-9]{3}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(days_of_the_week);
		if(!m.find())
			throw new IllegalArgumentException();;
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(sdf.parse(days_of_the_week));
		this.days_of_the_week = cal1;

	}
	public void setDays_of_the_week(Calendar days_of_the_week) 
	{
		this.days_of_the_week = days_of_the_week;
	}
	public Calendar getDays_of_the_week() 
	{
		return days_of_the_week;
	}
	public String getFlight_number()
	{
		return flight_number;
	}
	public void setFlight_number(String flight_number)
	{
		String pattern = "^[0-9]{1}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(flight_number);
		if(!m.find())
			throw new IllegalArgumentException();;
		this.flight_number = flight_number;
	}

	public Route()
	{
		super();
	}

	@Override
	public String toString()
	{
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		return new String("\nИмя маршрута: " + this.getNameRoute()+"\nИмя станции: "+ this.getStation_name() + "\nВремя прибытия на станцию: " + this.getArrival_time()+ "\nВремя отправления со станции: " + this.getDeparture_time()+"\nКоличество пустых мест: "+ this.getNumber_of_free_seats()+"\nСтатус станции: "+ this.getStatus_station()+"\nОбщее количество мест: "+ this.getTotal_number_of_seats()+"\nДень недели: "+ sdf1.format(this.getDays_of_the_week().getTime())+"\nНомер рейсу: "+ this.getFlight_number());
	}

	Route(String name, String total_number,Calendar days,String flight)
	{
		this.setNameRoute(name);
		setTotal_number_of_seats(total_number);
		this.setDays_of_the_week(days);
		setFlight_number(flight);
	}
	Route(String name, String total_number,String days,String flight) throws ParseException
	{
		this.setNameRoute(name);
		setTotal_number_of_seats(total_number);
		this.setDays_of_the_week(days);
		setFlight_number(flight);
	}
	Route(String name, String name1, String time,String time1, String number, String status, String total_number, Calendar days,String flight)
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
	Route(String name, String name1, String time,String time1, String number, String status, String total_number, String days,String flight) throws ParseException
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
