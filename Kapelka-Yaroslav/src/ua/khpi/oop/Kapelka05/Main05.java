package ua.khpi.oop.Kapelka05;

import java.util.Iterator;

public class Main05 {

	public static void main(String[] args) {
		MyContainer array = new MyContainer("������", "���� ����� �������", "��� 18 ���.");
		Iterator<String> it = array.getIterator();
		String line;
		
		System.out.println("Output array using while():");
		while(it.hasNext())
		{
			line = it.next();
			System.out.println(line);
		}
		
		System.out.println("\n���������� ������ ��������");
		array.add("� ����� ��������� ����� �� ������ �������.");
		System.out.println("\nOutput array using for:");
		it = array.getIterator();
		for(int i = 1;it.hasNext();i++)
		{
			line = it.next();
			System.out.println(i + ". " + line);
		}
		
		System.out.print("\n���������� ������ \"���� ����� �������\": " + array.contains("���� ����� �������"));
		
		System.out.println("\n\n\r\n" + "������ �������� ��� ������ ������ �� ������� �������: " + array.containsAll(new MyContainer("������", "� ����� ��������� ����� �� ������ �������.", "���� ����� �������", "��� 18 ���.", "������� �������� ������ � ������� ����������")));
		
		System.out.println("\n������ �������: " + array.size() + "\n�������� ������ ��������");
		array.remove("� ����� ��������� ����� �� ������ �������.");
		System.out.println("������ ������ ����� �������� ��������: " + array.size() + "\n");

		System.out.println("���������� ���������.");
		array.clear();
	}

}
