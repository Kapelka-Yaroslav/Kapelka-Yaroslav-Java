package ua.khpi.oop.Kapelka08;

public class StationClass 
{
	private String station_name;
	private String departure_time;
	private String arrival_time;
	private int number_of_free_seats;
	private String status_station;
	
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
	public StationClass() {};
	
	public StationClass(String name, String time,String time1, int number, String status)
	{
		this.station_name = name;
		this.arrival_time = time;
		this.departure_time = time1;
		this.number_of_free_seats = number;
		this.status_station = status;
	}
	public void outputDataStation()
	{
		System.out.println("Названия станции: " + station_name);
		System.out.println("Время прибытия на станцию: " + arrival_time);
		System.out.println("Время отправления с станции: " + departure_time);
		System.out.println("Количество пустых мест: " + number_of_free_seats);
		System.out.println("Статус станции: " + status_station);
	}
}
