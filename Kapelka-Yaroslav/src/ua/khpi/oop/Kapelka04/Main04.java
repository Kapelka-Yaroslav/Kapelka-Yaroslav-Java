package ua.khpi.oop.Kapelka04;

import java.util.Scanner;

class Main04
{
  public static void main(String args[])
  {
	  for(var str : args) 
	  {
			if(str.equals("-h") || str.equals("-help")) 
		System.out.println("�����: �������� �������\n������ �����. ������ �� �������, ��i���� ���i� ������������ � �����i ����� �����. ��������� ������� � ������i ������i.\n�������� \"-h\" �� \"-help\": �i����������� i��������� ��� ������ ��������, ����������� (i����i������� ��������), ��������� ���� �����i� ������ (�����i� ���� �� ��������i� ���������� �����);\r\n" + 
				"�������� \"-d\" �� \"-debug\": � ������i ������ �������� �i������������ ��������i ���i, �� ���������� ������������ �� �����i��� �������������i ��������: �i���������i �����������, ����i�� �������� ��i����, �������� ���������� ��i���� �� i�.");
			
		if(str.equals("-d") || str.equals("-debug"))
		{
			HelpMenu.debugMod(true);
		}
			
	  }
	  Menu();
  }
  public static void Menu()
  {
	 Scanner sc = new Scanner(System.in);
	 StringBuilder line = null;
	 boolean temp = true;
	 while(temp)
	 {
		 System.out.println("1.������ �����\n2.���������� �������� ������\n3.���������� ���������\n4.��������� ������\n�������� ����� ������,������� ������ ���������: ");
		 switch(sc.nextInt())
		 {
		 case 1:
			 System.out.println("������� �����: ");
			 sc.nextLine();		
			 line = new StringBuilder(sc.nextLine());
			 break;
		 case 2:
			 System.out.println("��� ��������� ������: ");
			 System.out.println(line);
			 break;
		 case 3:
			 HelpMenu.util.task(line.toString(),true);
			 break;
		 case 4:
			 temp = false;
			 break;
		 default:
			 break;
		 }
	 }
	 sc.close();
  }
}
