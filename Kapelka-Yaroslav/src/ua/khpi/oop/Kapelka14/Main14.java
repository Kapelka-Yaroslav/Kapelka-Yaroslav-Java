package ua.khpi.oop.Kapelka14;

import java.io.IOException;

public class Main14 {
	public static void main(String[] args) {

		for (var str : args) {
			if (str.equals("-auto")) {
				try {
					Helper.Auto();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			}
		}
		try {
			Helper.Menu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}