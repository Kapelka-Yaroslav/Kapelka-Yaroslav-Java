package ua.khpi.oop.Kapelka07;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class RouteClass 
{
	private String[] station_name;
	private String[] departure_time;
	private String[] arrival_time;
	private String[] starting_station;
	private String[] terminal_station;
	private String[] intermediate_stations;
	private String[] departure_time_of_intermediate_stations;
	private String[] arrival_time_of_intermediate_stations;
	private int[] number_of_free_seats;
	private int total_number_of_seats;
	private ArrayList<GregorianCalendar> days_of_the_week;
	private int flight_number;
	
	public String[] getStation_name()
	{
		return station_name;
	}
	public void setStation_name(String[] station_name)
	{
		this.station_name = station_name;
	}
	public String[] getDeparture_time()
	{
		return departure_time;
	}
	public void setDeparture_time(String[] departure_time)
	{
		this.departure_time = departure_time;
	}
	public String[] getArrival_time()
	{
		return arrival_time;
	}
	public void setArrival_time(String[] arrival_time)
	{
		this.arrival_time = arrival_time;
	}
	public String[] getStarting_station()
	{
		return starting_station;
	}
	public void setStarting_station(String[] starting_station)
	{
		this.starting_station = starting_station;
	}
	public String[] getTerminal_station()
	{
		return terminal_station;
	}
	public void setTerminal_station(String[] terminal_station)
	{
		this.terminal_station = terminal_station;
	}
	public String[] getIntermediate_stations()
	{
		return intermediate_stations;
	}
	public void setIntermediate_stations(String[] intermediate_stations)
	{
		this.intermediate_stations = intermediate_stations;
	}
	public String[] getDeparture_time_of_intermediate_stations()
	{
		return departure_time_of_intermediate_stations;
	}
	public void setDeparture_time_of_intermediate_stations(String[] departure_time_of_intermediate_stations)
	{
		this.departure_time_of_intermediate_stations = departure_time_of_intermediate_stations;
	}
	public String[] getArrival_time_of_intermediate_stations()
	{
		return arrival_time_of_intermediate_stations;
	}
	public void setArrival_time_of_intermediate_stations(String[] arrival_time_of_intermediate_stations)
	{
		this.arrival_time_of_intermediate_stations = arrival_time_of_intermediate_stations;
	}
	public int[] getNumber_of_free_seats()
	{
		return number_of_free_seats;
	}
	public void setNumber_of_free_seats(int[] number_of_free_seats)
	{
		this.number_of_free_seats = number_of_free_seats;
	}
	public int getTotal_number_of_seats()
	{
		return total_number_of_seats;
	}
	public void setTotal_number_of_seats(int total_number_of_seats)
	{
		this.total_number_of_seats = total_number_of_seats;
	}
	
	public ArrayList<GregorianCalendar> getDay_of_the_week()
	{
		return days_of_the_week;
	}
	public void setDays_of_the_week(ArrayList<GregorianCalendar> days_of_the_week)
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
	
	public RouteClass(String[] name, String[] time,String[] time1,String[] start,String[] terminal,String[] intermediate, String[] time_of_intermediate, String[] time1_of_intermediate,int[] number,int total_number,ArrayList<GregorianCalendar> days,int flight)
	{
		this.station_name = name;
		this.departure_time = time;
		this.arrival_time = time1;
		this.starting_station = start;
		this.terminal_station = terminal;
		this.intermediate_stations = intermediate;
		this.departure_time_of_intermediate_stations = time_of_intermediate;
		this.arrival_time_of_intermediate_stations = time1_of_intermediate;
		this.number_of_free_seats = number;
		total_number_of_seats = total_number;
		this.days_of_the_week = days;
		flight_number = flight;
	}
	
	public void outputData()
	{
		System.out.println("Список названий станций: ");
		for (int i = 0; i < station_name.length; i++) 
		{
			System.out.println(i+1 + ". " + station_name[i]);
		}
		System.out.println("Список времени отправления: ");
		for (int i = 0; i < departure_time.length; i++) 
		{
			System.out.println(i+1 + ". " + departure_time[i]);
		}
		System.out.println("Список времени прибытия: ");
		for (int i = 0; i < arrival_time.length; i++) 
		{
			System.out.println(i+1 + ". " + arrival_time[i]);
		}
		System.out.println("Список времени отправления для промежуточных станций: ");
		for (int i = 0; i < departure_time_of_intermediate_stations.length; i++) 
		{
			System.out.println(i+1 + ". " + departure_time_of_intermediate_stations[i]);
		}
		System.out.println("Список времени прибытия для промежуточных станций: ");
		for (int i = 0; i < arrival_time_of_intermediate_stations.length; i++) 
		{
			System.out.println(i+1 + ". " + arrival_time_of_intermediate_stations[i]);
		}
		System.out.println("Список количества пустых мест: ");
		for (int i = 0; i < number_of_free_seats.length; i++) 
		{
			System.out.println(i+1 + ". " + number_of_free_seats[i]);
		}
		System.out.println("Список начальных станций: ");
		for (int i = 0; i < starting_station.length; i++) 
		{
			System.out.println(i+1 + ". " + starting_station[i]);
		}
		System.out.println("Список конечных станций: ");
		for (int i = 0; i < terminal_station.length; i++) 
		{
			System.out.println(i+1 + ". " + terminal_station[i]);
		}
		System.out.println("Список промежуточных станций: ");
		for (int i = 0; i < intermediate_stations.length; i++) 
		{
			System.out.println(i+1 + ". " + intermediate_stations[i]);
		}
		System.out.println("Общее количество мест: " + total_number_of_seats);
		System.out.println("Список дней недели: ");
		for (GregorianCalendar date : days_of_the_week)
		{
			System.out.println(date.getTime());
		}
		System.out.println("Номер рейса: " + flight_number);
	}
}
