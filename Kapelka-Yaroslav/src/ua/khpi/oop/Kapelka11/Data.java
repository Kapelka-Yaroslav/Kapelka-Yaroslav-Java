package ua.khpi.oop.Kapelka11;

public class Data<T> 
{

	public T obj;

	public Data<T> next;

	public Data<T> prev;

	Data() 
	{

	}
	Data(T obj, Data<T> prev, Data<T> next) 
	{
		this.obj = obj;
		this.next = next;
		this.prev = prev;
	}
}
