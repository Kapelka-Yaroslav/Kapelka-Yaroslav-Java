package ua.khpi.oop.Kapelka02;

public class Main02 
{
	 static java.util.Random random = new java.util.Random();
	  static int getCountsOfDigits(int n)
	  {
		  int letter = 0;
	       while(n > 0)
	       {
	    	 if(n % 16 >= 10)
	    	 {
	    		letter++; 
	    	 }
	    	 n /= 16;
	        }
	       return letter;
	    }
	  public static void main(String args[])
	    {
	      int temp;
	      System.out.println("| Номер |   Число   |  Количество цифр, отображаемых латинскими буквами |");
	      
	      for (int i = 0; i < 9; i++) 
	      {
	        temp = 1000000000 + random.nextInt(1000000001);
	        System.out.println("|   " + (i + 1) + "   |  " + Integer.toHexString(temp) + " |\t\t\t     " + getCountsOfDigits(temp) + "\t\t\t        |");
	      }
	       temp = 1000000000 + random.nextInt(1000000001);
	       System.out.println("|   " + (10) + "  |  " + Integer.toHexString(temp) + " |\t\t\t     " + getCountsOfDigits(temp) + "\t\t\t        |");
	    }
}
