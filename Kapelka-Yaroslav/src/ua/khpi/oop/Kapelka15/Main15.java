package ua.khpi.oop.Kapelka15;

public class Main15 {
	
	public static void main(String[] args) {

		for (var str : args) {
			if (str.equals("-auto")) {
				Helper.Auto();
				return;
			}
		}
		Helper.Menu();
	}

}