package ua.khpi.oop.Kapelka08;
import java.util.GregorianCalendar;

public class RouteClass 
{
	private int size = 0;
	private int total_number_of_seats;
	private GregorianCalendar days_of_the_week;
	private int flight_number;
	StationClass station[] = new StationClass[size];
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
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
	public void addElementStation(StationClass Route)
	{
		StationClass[] newStation = new StationClass[size + 1];
		for (int i = 0; i < size; i++) 
		{
			newStation[i] = station[i];
		}
		
		newStation[size] = Route;
		size++;
		station = newStation;
	}
	
	public void deleteElementStation(int position)
	{
		if(size != 0)
		{
			StationClass[] newStation = new StationClass[size-1];
			for (int i = 0; i < position-1; i++) 
			{
				newStation[i] = station[i];
			}
			for (int i = position-1, j = position; j < size; i++, j++) 
			{
				newStation[i] = station[j];
			}
			
			size--;
			station = newStation;
		}
		else
		{
			System.out.println("Массив пуст.");
		}
	}
}
