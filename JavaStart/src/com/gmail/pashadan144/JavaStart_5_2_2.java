package com.gmail.pashadan144;

import java.util.Arrays;

public class JavaStart_5_2_2 {
	/*
	 * 2)Ќаписать код дл€ зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
	 * массив может быть произвольной длинны. (ѕри выполнении задани€ использовать
	 * дополнительный массив нельз€)
	 */

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int x = 0, y = 0;
		
		System.out.println("ƒо... ");
		System.out.println(Arrays.toString(array));

		for (int j = 0; j < array.length / 2; j++) {
			x = array[j];
			y = array[array.length - 1 - j];

			array[array.length - 1 - j] = x;
			array[j] = y;
		}

		System.out.println("ѕосле... ");
		System.out.println(Arrays.toString(array));

	}

}
