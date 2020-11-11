package ua.khpi.oop.Kapelka05;

import java.util.Iterator;

public class Main05 {

	public static void main(String[] args) {
		MyContainer array = new MyContainer("Привет", "Меня зовут Ярослав", "Мне 18 лет.");
		Iterator<String> it = array.getIterator();
		String line;
		
		System.out.println("Output array using while():");
		while(it.hasNext())
		{
			line = it.next();
			System.out.println(line);
		}
		
		System.out.println("\nДобавление нового элемента");
		array.add("Я люблю проводить время на свежем воздухе.");
		System.out.println("\nOutput array using for:");
		it = array.getIterator();
		for(int i = 1;it.hasNext();i++)
		{
			line = it.next();
			System.out.println(i + ". " + line);
		}
		
		System.out.print("\nНахождение строки \"Меня зовут Ярослав\": " + array.contains("Меня зовут Ярослав"));
		
		System.out.println("\n\n\r\n" + "Массив содержит все строки данных из другого массива: " + array.containsAll(new MyContainer("Привет", "Я люблю проводить время на свежем воздухе.", "Меня зовут Ярослав", "Мне 18 лет.", "Сегрдня отличная погода и хорошее настроение")));
		
		System.out.println("\nРазмер массива: " + array.size() + "\nУдаление одного элемента");
		array.remove("Я люблю проводить время на свежем воздухе.");
		System.out.println("Размер масива после удаления элемента: " + array.size() + "\n");

		System.out.println("Завершение программы.");
		array.clear();
	}

}
