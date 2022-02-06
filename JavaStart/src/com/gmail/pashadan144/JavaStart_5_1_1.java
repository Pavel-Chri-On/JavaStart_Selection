package com.gmail.pashadan144;

public class JavaStart_5_1_1 {

	/*
	 * 1) Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных
	 * цифр в нем.
	 */

	public static void main(String[] args) {
		int[] array = new int [] {0,5,2,4,7,1,3,19};
		int x = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 > 0) {
				x += 1;
			}
		}
		System.out.println("Нечетных цифр в массиве - " + x);
	}

}