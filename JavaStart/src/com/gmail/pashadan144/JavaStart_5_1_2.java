package com.gmail.pashadan144;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStart_5_1_2 {

	public static void main(String[] args) {
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Array size - ");
		x = scan.nextInt();
		
		int[] array = new int[x];
		
		for (int i = 0; i < x; i++) {
			System.out.println("Enter " + (i + 1) + " array element");
			array[i] = scan.nextInt();
		}
		
		System.out.println("Your array - " + Arrays.toString(array));
	}

}