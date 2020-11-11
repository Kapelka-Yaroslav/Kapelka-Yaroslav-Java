package ua.khpi.oop.Kapelka01;

class Main01 
{
    public static void main(String args[]) 
    { 
      int d1 = 0x9;
      long d2 = 168659 + (38099 * (long) Math.pow(10,7));
      int d3 = 0b111011;
      int d4 = 020723;
      int d5 = 1 + ((9 - 1) % 26);
      char c = (char) 64+9; 
      long temp;
      int odd = 0;
      int even = 0;
      int bin = 0;
      temp = d1;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;      // уменьшение разряда
      }  
      temp = d1;
    while(temp!=0) 
    {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Первое число - " + d1 + "\n" + "В двоичном представлении:" + Integer.toString(d1, 2) + "\n количество чётных ифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = d2;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = d2;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Второе число - " + d2  + "\n" + "В двоичном представлении:" +  Long.toString(d2, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = d3;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = d3;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Третье число - " + d3 + "\n" + "В двоичном представлении:" +  Integer.toString(d3, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = d4;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = d4;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Четвертое число - " + d4 + "\n" + "В двоичном представлении:" + Integer.toString(d4, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = d5;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = d5;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Пятое число - " + d5 + "\n" + "В двоичном представлении:" + Integer.toString(d5, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      System.out.println("Символ полученный из пятого числа: " + c + "\n");
    }
  }