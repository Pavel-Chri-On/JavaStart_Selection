package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_4 {

	/*
	 * 4) ����������� ���������� ������ �����, ����� ����� ����� ���� ��� ������
	 * ������ �������. ����: a, b, c � ������� ��������������� ������������.
	 * �������� ��������� ������� ������ ���������� ����� ����������� ��� ���.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c;

		System.out.println("������� a = ");
		a = scan.nextInt();

		System.out.println("������� b = ");
		b = scan.nextInt();

		System.out.println("������� c = ");
		c = scan.nextInt();

		if (a + b > c && a + c > b && c + b > a) {
			System.out.println("����� ����������� ����������");
		} else {
			System.out.println("������ ������������ �� ����������");
		}
	}
}