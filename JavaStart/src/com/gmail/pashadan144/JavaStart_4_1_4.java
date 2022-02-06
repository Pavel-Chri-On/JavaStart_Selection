package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_4_1_4 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Height - ");
		int x = scan.nextInt();
		
		System.out.println("Width - ");
		int y = scan.nextInt();
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (j==0||i==0||j==y-1||i==x-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
