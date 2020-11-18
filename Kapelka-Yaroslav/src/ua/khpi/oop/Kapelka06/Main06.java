package ua.khpi.oop.Kapelka06;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.NotSerializableException;
import java.util.Iterator;
import java.util.Scanner;
import ua.khpi.oop.bilyi03.*;
public class Main06 
{
	public static void main(String[] args) 
	{
		MyContainer06 array = new MyContainer06();
		Scanner scan = new Scanner(System.in); 
		int number;
		boolean stop = false;
		String choise;
		String data;
		
		while(stop != true)
		{
			System.out.println("������� ����� ������, ������� ������ ���������");
			System.out.println("1. �������� ������");
			System.out.println("2. ������� ������ �� �����");
			System.out.println("3. ������� �������");
			System.out.println("4. ����� �������");
			System.out.println("5. ������������ �������");
			System.out.println("6. ����������� ������");
			System.out.println("7. �������� �������");
			System.out.println("8. ������������� ������");
			System.out.println("9. ��������������� ������");
			System.out.println("10. ���������� ���������");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.print("��� �����: ");
			choise = scan.nextLine();
			
			switch(choise) 
			{
			case "1":
				System.out.print("������� �������������� �����: ");
				array.add(scan.nextLine());
				System.out.print("\n");
				
				break;
				
			case "2":
				if(array.size() != 0)
				{
					System.out.println("\n������ � �������:");
					for (int i = 0; i < array.size(); i++) 
					{
						System.out.println(i+1 + ". " + array.getLine(i));
					}
					System.out.print("\n");
				}
				else
				{
					System.out.println("\n������ ����.\n");
				}
				
				
				
				break;
				
			case "3":
				if(array.size() != 0)
				{
					System.out.print("\n������� ������ ��� �� �������� �� �������: ");
					array.remove(scan.nextLine());
				}
				else
				{
					System.out.println("\n������ ����.\n");
				}
				
				break;
				
			case "4":
				if(array.size() != 0)
				{
					System.out.print("������� ������ ��� �� ������ � �������: ");
					
					if(array.contains(scan.nextLine()))
					{
						System.out.println("\n������ �������.\n");
					}
					else
					{
						System.out.println("\n������ �� �������.\n");
					}
				}
				else
				{
					System.out.println("\n������ ����.\n");
				}
				
				
				break;
				
			case "5":
				if(array.size() != 0)
				{
					for (int i = 0; i < array.size(); i++) 
					{
						StringBuilder ln = new StringBuilder(array.getLine(i));
						Helper.start(ln);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.println("\n������ ����.\n");
				}
				
				break;
				
			case "6":
				if(array.size() != 0)
				{
					array.sort();
				}
				else
				{
					System.out.println("\n������ ����.\n");
				}
				
				System.out.println("\n������ ������������\n");
				
				break;
				
			case "7":
		        if(array.size() != 0)
		        {
		          System.out.print("\n������� ���������� ����� � ������������ �������: ");
		          number = scan.nextInt();
		          
		          if(number >= 0)
		          {
		            MyContainer06 arrayToCompare = new MyContainer06();
		            System.out.print("\n������� �������������� �����:\n");
		            scan.nextLine();
		            for (int i = 0; i < number; i++) 
		            {
		              System.out.print(i+1 + ". ");
		              arrayToCompare.add(scan.nextLine());
		              //System.out.println( );
		            }
		            if(array.containsAll(arrayToCompare) == true)
		            {
		              System.out.println("������� �����.\n");
		            }
		            else
		            {
		              System.out.println("������� �� �����.\n");
		            }
		          }
		        }
		        else
		        {
		          System.out.println("\n������ ����.\n");
		        }
		        
		        break;
				
			case "8":
				if(array.size() != 0)
				{
					System.out.print("\n������� ��� �����: ");
					data = scan.nextLine();
					if(data.indexOf(".ser") == -1)
						data += ".ser";
					
					try
					{
						FileOutputStream file = new FileOutputStream(data);
						ObjectOutputStream serial = new ObjectOutputStream(file);
						serial.writeObject(array);
						serial.close();
						System.out.println("\n������ �������������.\n");
					}
					catch(Exception ex)
					{
						System.out.println("\n" + ex.getMessage() + "\n");
					}
				}
				else
				{
					System.out.println("\n������ ����.\n");
				}
				
				break;
				
			case "9":
				System.out.print("\n������� ��� �����: ");
				data = scan.nextLine();
				if(data.indexOf(".ser") == -1)
					data += ".ser";
				
				try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(data)))
		        {
					array = (MyContainer06)ois.readObject();
					ois.close();
		        }
		        catch(Exception ex)
				{
		             
		            System.out.println("\n" + ex.getMessage() + "\n");
		        }
				break;
				
			case "10":
				stop = true;
				break;
				
			default:
				System.out.println("������. ������������ �������.\n");
				break;
			}
		}

		System.out.println("\n���������� ���������.");
		array.clear();
		scan.close();
	}
	
}
