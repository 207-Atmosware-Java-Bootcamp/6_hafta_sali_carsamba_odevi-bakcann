package com.examples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// NOT: birden fazla metotla yapalım

// kullanıcıdan alınan sayı kadar dizi elemanı olsun rastgele 1-10 arasındaki bu
// sayıları bir diziye atayalım
// sonra bu diziyi başka bir diziye clone edelim.
// clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
// (Arrays.sort())
// en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
// bu sayıların toplamını ?
// bu sayıların ortalaması ?

// bu dizideki elemanlardan tek sayılardan kaç tane ve tek sayı toplamları (tek
// sayı dizisi)
// bu dizideki elemanlardan çift sayılardan kaç tane ve çift sayı toplamları
// (çift sayı dizisi)
// dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
// dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
// dizideki tekrar eden sayıları bir dizide göstrerelim ?
// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
// dizi elemanları)

public class _31_Diziler_x2_AllInOne {
	
	public static void main(String[] args) {
		int getData = getData();
		int[] array = returnArray(getData);
		int[] clonoArray = array.clone();
		// arraySort(clonoArray);
		// numberMaxMin(clonoArray);
		// numberSumAndAverage(clonoArray);
		// evenOdd(clonoArray);
		// maxControl(numberMaxMin(clonoArray));
		// searchArray(arraySort(clonoArray));
		againNumberArray(arraySort(clonoArray));
		
	}
	
	public static int getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eleman sayısınız giriniz");
		int numberCount = scanner.nextInt();
		scanner.close();
		return numberCount;
		
	}
	
	public static int[] returnArray(int numberCount) {
		int[] array = new int[numberCount];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
			System.out.print(array[i] + " ");
		}
		
		return array;
	}
	
	public static int[] arraySort(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	public static int numberMaxMin(int[] array) {
		System.out.println("\n" + array[0]);
		System.out.println(array[array.length - 1]);
		return array[array.length - 1];
	}
	
	public static void numberSumAndAverage(int[] array) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println("\nSayılarım Topmalı : " + sum + "\nSayıların Ortalaması : " + avg);
	}
	
	public static void evenOdd(int[] array) {
		int evenSum = 0, evenCount = 0, oddSum = 0, oddCount = 0;
		int[] evenArray = new int[array.length];
		int[] oddArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
				evenSum += array[i];
				evenArray[evenCount - 1] = array[i];
			} else {
				oddCount++;
				oddSum += array[i];
				oddArray[oddCount - 1] = array[i];
			}
		}
		System.out.println("\nTek sayı adet : " + oddCount + " Tek sayılar toplamı : " + oddSum);
		System.out.println(" Tek sayı dizisi : ");
		for (int temp : oddArray) {
			if (temp == 0) {
				continue;
			} else {
				System.out.print(temp + " ");
			}
			
		}
		System.out.println("\nÇift sayı adet : " + evenCount + " Çift sayılar toplamı : " + evenSum);
		System.out.println(" Çift sayı dizisi : ");
		for (int temp : evenArray) {
			if (temp == 0) {
				continue;
			} else {
				System.out.print(temp + " ");
			}
			
		}
		
	}
	
	public static void maxControl(int max) {
		if (max > 25) {
			System.out.println(max + " sayısı 25'den büyüktür.");
		} else
			System.out.println(max + " sayısı 25'den küçüktür.");
	}
	
	public static void searchArray(int[] array) {
		
		System.out.println("\n" + Arrays.binarySearch(array, 5));
	}
	
	public static void againNumberArray(int[] array) {
		int[] arrAgain = new int[array.length];
		int[] arrRemoveAgain = new int[array.length];
		int arrAgainCount = 0;
		int arrRemoveAgainCount = 0;
		System.out.println();
		for (int temp : array) {
			System.out.print(temp + " ");
		}
		for (int i = 0; i < array.length - 1; i++) {
			
			if (array[i] == array[i + 1]) {
				if (controlAgain(arrAgain, array[i + 1]) == 0) {
					arrAgain[arrAgainCount] = array[i];
					arrAgainCount++;
				}
				
			} else {
				if (controlRemoveAgain(array, array[i]) == 0) {
					arrRemoveAgain[arrRemoveAgainCount] = array[i];
					arrRemoveAgainCount++;
					if (i == array.length - 2) {
						arrRemoveAgain[arrRemoveAgainCount] = array[i + 1];
					}
					
				}
			}
			
		}
		System.out.println();
		for (int temp : arrAgain) {
			System.out.print(temp + " ");
		}
		System.out.println();
		for (int temp : arrRemoveAgain) {
			System.out.print(temp + " ");
		}
	}
	
	public static int controlAgain(int[] dizi, int number) {
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == number) {
				return 1;
			}
		}
		return 0;
	}
	
	public static int controlRemoveAgain(int[] dizi, int number) {
		int control = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == number) {
				return 0;
			}
		}
		return 1;
	}
	
}
