package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_1 {

	/*
	 * 1) �������� ��������� ������� ��������� 5-� ������� ����� � ���������� �
	 * ������� ����� �� �������� ��� �������. �������� : ����������� ����� 54698
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;

		System.out.println("5-� ������� ����� - ");
		x = scan.nextInt();

		System.out.println(x/10000);
		System.out.println(x%10000/1000);
		System.out.println(x%1000/100);
		System.out.println(x%100/10);
		System.out.println(x%10);

	}
}