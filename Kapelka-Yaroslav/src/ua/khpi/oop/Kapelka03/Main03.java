package ua.khpi.oop.Kapelka03;

class util 
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
      static int substringCount(String s, String pattern) 
    {
            int result = 0;
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
    public static void task()
    {
      String data = getString();
      replacement(data);
      int res;
      for(String s : myHashSet)
      {
        res = substringCount(data,s);
        System.out.println("Слово: " + s);
        System.out.println("Повторения: " + res);
      }
    }
  }

  class Main03
  {
    public static void main(String args[])
    {
      util.task();
    }
  }