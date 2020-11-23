package ua.khpi.oop.Kapelka08;

public class RouteClassList 
{
	private int size = 0;
	RouteClass[] route = new RouteClass[size];
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public void addElement(RouteClass Route)
	{
		RouteClass[] newRoute = new RouteClass[size + 1];
		for (int i = 0; i < size; i++) 
		{
			newRoute[i] = route[i];
		}
		
		newRoute[size] = Route;
		size++;
		route = newRoute;
	}
	
	public void deleteElement(int position)
	{
		if(size != 0)
		{
			RouteClass[] newRoute = new RouteClass[size-1];
			for (int i = 0; i < position-1; i++) 
			{
				newRoute[i] = route[i];
			}
			for (int i = position-1, j = position; j < size; i++, j++) 
			{
				newRoute[i] = route[j];
			}
			
			size--;
			route = newRoute;
		}
		else
		{
			System.out.println("Массив пуст.");
		}
	}
}
