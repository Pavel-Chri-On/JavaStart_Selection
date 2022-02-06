package com.gmail.pashadan144;

import java.util.Arrays;

public class JavaStart_6_2_3 {


	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		allPermutation(array);
	}

	static void allPermutation(int[] array) {
		int k = array.length - 1;
		int n = k;

		System.out.println(Arrays.toString(array));
		while (k > 0) {
			leftShift(array, k);
			if (array[k] != k + 1) {
				System.out.println(Arrays.toString(array));
				k = n;
			} else {
				k -= 1;
			}
		}
	}

	static void leftShift(int[] array, int k) {
		int temp = array[0];
		for (int i = 0; i < k; i++) {
			array[i] = array[i + 1];
		}
		array[k] = temp;
	}

}
