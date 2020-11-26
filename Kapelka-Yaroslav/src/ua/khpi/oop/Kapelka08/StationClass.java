package ua.khpi.oop.Kapelka08;

public class StationClass 
{
	private String station_name;
	private String departure_time;
	private String arrival_time;
	private String starting_station;
	private String terminal_station;
	private String intermediate_stations;
	private String departure_time_of_intermediate_stations;
	private String arrival_time_of_intermediate_stations;
	private int number_of_free_seats;
	
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
	public String getStarting_station()
	{
		return starting_station;
	}
	public void setStarting_station(String starting_station)
	{
		this.starting_station = starting_station;
	}
	public String getTerminal_station()
	{
		return terminal_station;
	}
	public void setTerminal_station(String terminal_station)
	{
		this.terminal_station = terminal_station;
	}
	public String getIntermediate_stations()
	{
		return intermediate_stations;
	}
	public void setIntermediate_stations(String intermediate_stations)
	{
		this.intermediate_stations = intermediate_stations;
	}
	public String getDeparture_time_of_intermediate_stations()
	{
		return departure_time_of_intermediate_stations;
	}
	public void setDeparture_time_of_intermediate_stations(String departure_time_of_intermediate_stations)
	{
		this.departure_time_of_intermediate_stations = departure_time_of_intermediate_stations;
	}
	public String getArrival_time_of_intermediate_stations()
	{
		return arrival_time_of_intermediate_stations;
	}
	public void setArrival_time_of_intermediate_stations(String arrival_time_of_intermediate_stations)
	{
		this.arrival_time_of_intermediate_stations = arrival_time_of_intermediate_stations;
	}
	public int getNumber_of_free_seats()
	{
		return number_of_free_seats;
	}
	public void setNumber_of_free_seats(int number_of_free_seats)
	{
		this.number_of_free_seats = number_of_free_seats;
	}
	public StationClass() {};
	
	public StationClass(String name, String time,String time1,String start,String terminal,String intermediate, String time_of_intermediate, String time1_of_intermediate,int number)
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
	}
	public void outputDataStation()
	{
		System.out.println("Названия станции: " + station_name);
		System.out.println("Время отправления: " + departure_time);
		System.out.println("Время прибытия: " + arrival_time);
		System.out.println("Начальная станция: " + starting_station);
		System.out.println("Конечная станция: " + terminal_station);
		System.out.println("Промежуточная станция: " + intermediate_stations);
		System.out.println("Время отправления для промежуточных станций: " + departure_time_of_intermediate_stations);
		System.out.println("Время прибытия для промежуточных станций: " + arrival_time_of_intermediate_stations);
		System.out.println("Количество пустых мест: " + number_of_free_seats);
	}
}
