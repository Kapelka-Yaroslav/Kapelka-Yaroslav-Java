package ua.khpi.oop.Kapelka04;

public class HelpMenu 
{
	public static class util 
	{
		static StringBuilder builder = new StringBuilder();
		static java.util.Scanner in = new java.util.Scanner(System.in); 
		static java.util.HashSet<String> myHashSet = new java.util.HashSet<String>();
		static String getString()  
		{
			System.out.println("Введите текст: ");
		    String res = in.nextLine();
		    return res;
		  
		} 
		static void replacement(String text)
		{	
			text += " ";    
			for (int i = 0; i < text.length(); i++) 	    
			{	      
				if (text.charAt(i) != ' ')    
				{ 
					builder.append(text.charAt(i));
				}  
				else 
				{  
					if (!builder.toString().equals(""))
					{
						myHashSet.add(builder.toString());
						builder.setLength(0);
					}
				}
			} 
		}
		
		static int substringCount(String s, String pattern,boolean debug) 
		{        
			int result = 0;
			if(debug)
			{
				System.out.println("Метод substringCount()");
				System.out.println("Значение переменной s: " + s);
				System.out.println("Значение переменной pattern: " + pattern);
				System.out.println("Промежуточное значение переменной result: " + result);
				System.out.println("---------------------------------");
			}
			else
			{
				System.out.println("Нету данных про переменные.");
			}
			s += " ";      
			pattern += " ";       
			for (int i = 0; i < s.length(); i++)      
			{     	
				if(i + pattern.length() <= s.length())	 	
				{ 		
					if (s.substring(i, i + pattern.length()).equals(pattern)) 		
					{    			
						result++;		
						i += pattern.length()-1;	
					}	
				}         
			}     
			return result;  
		}
		public static void task(boolean debug) 
		{ 	
			String data = getString();   
			replacement(data); 
			int res;
			if(debug)
			{
				System.out.println("Метод task()");
				System.out.println("Значение переменной data: " + data);
			}
			else
			{
				System.out.println("Нету данных про переменные.");
			}
			for(String s : myHashSet) 
			{	 
				res = substringCount(data,s,true);	
				System.out.println(" Повторения     Слово  ");
		        System.out.println("     " + res + "           " + s + "    "); 
			}
		} 
		public static void task(String data,boolean debug) 
		{ 	
			replacement(data); 
			int res;
			if(debug)
			{
				System.out.println("Метод task()");
				System.out.println("Значение переменной data: " + data);
				System.out.println("---------------------------------");
			}
			else
			{
				System.out.println("Нету данных про переменные.");
			} 
			for(String s : myHashSet)   
			{	
				res = substringCount(data,s,true);
				System.out.println(" Повторения     Слово  "); 
		        System.out.println("     " + res + "           " + s + "    ");
			}
		}
	}
	private static boolean debug = false;
	public static void debugMod(boolean debugMod) 
	{
		debug = debugMod;
       	System.out.printf("Debug mod ");
       	if (debug) 
       	{
       		System.out.printf("on\n");
       		
       	}
       	else
       	{
       		System.out.printf("off\n");
       	}
	}
}
