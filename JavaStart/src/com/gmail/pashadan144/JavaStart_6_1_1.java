package com.gmail.pashadan144;

public class JavaStart_6_1_1 {

	public static void main(String[] args) {

		int[] array = { 1, 234, 1243, 4, 23, 34235, 32, 21, 99 };
		System.out.println(getMax(array));
		
		int[] array1 = { 56, 67, 35, 17, 547, 457, 89, 222 };
		System.out.println(getMax(array1));

	}

	static int getMax(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
