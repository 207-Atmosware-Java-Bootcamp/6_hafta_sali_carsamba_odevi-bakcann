package com.examples;

import java.util.Random;

public class RandomHomeWork {
	
	public static void main(String[] args) {
		
		String[] students = { "Ali Furkan Erguven", "Alim Yogurtcu", "Arda Kozan", "Beytullah Zor",
				"Burak Can Gultekin", "Dogus Saglam", "Emre Yildiz", "Furkan Gurcay", "Huseyin Baris Aktas",
				"Ibrahim Bayramli", "Kadir İrpik", "Kubilay Alp Agacan", "Mehmet Mustafa Ozcelik",
				"Mustafa Kemal Celik", "Omer Faruk Caliskan", "Seyda Ozdemir", "Tolga Gureli", "Tuba Argin",
				"Yigit Ozen" };
		
		String[] result = new String[3];
		
		Random random = new Random();
		int number = 0;
		
		for (int i = 0; i < 3; i++) {
			number = random.nextInt(students.length - 1);
			
			result[i] = students[number];
			System.out.println(result[i]);
		}
	}
	
}
