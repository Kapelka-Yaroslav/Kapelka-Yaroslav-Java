package ua.khpi.oop.Kapelka10;

import java.io.IOException;
import java.text.ParseException;

public class Main10 
{

	public static void main(String[] args) throws ParseException 
	{

		for (var str : args) 
		{
			if (str.equals("-auto")) 
			{
				try 
				{
					Helper.Auto();
				} catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			}
		}
		try 
		{
			Helper.Menu();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
