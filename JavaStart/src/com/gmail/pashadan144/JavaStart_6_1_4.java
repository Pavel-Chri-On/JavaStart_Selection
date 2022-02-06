package com.gmail.pashadan144;

public class JavaStart_6_1_4 {
	public static void main(String[] args) {

		/*
		 * 4) Напишите метод который реализует линейный поиск элемента в массиве целых
		 * чисел. Если такой элемент в массиве есть то верните его индекс, если нет то
		 * метод должен возвращать число - «-1»
		 */

		int x = 32;
		int[] array = { 1, 234, 1243, 4, 23, 34235, 32, 21, 99 };
		System.out.println(findElement(array, x));

		int y = 3;
		System.out.println(findElement(array, y));

	}

	static int findElement(int[] arr, int element) {
		int x = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				x = i;
			}
		}
		return x;
	}

}
