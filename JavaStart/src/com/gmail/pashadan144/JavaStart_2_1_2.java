package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_2 {

	/*
	 * 2)�������� ��������� ������� �������� � ������� �� ����� ������� ������������
	 * ���� �������� ��� �������.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, a, b, c, p;

		System.out.println("������� �������� ������ ������� � �� - ");
		a = scan.nextDouble();

		System.out.println("������� �������� ������ ������� � �� - ");
		b = scan.nextDouble();

		System.out.println("������� �������� ������� ������� � �� - ");
		c = scan.nextDouble();

		p = (a + b + c) / 2;

		x = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("�����: S =");
		System.out.println(x);

	}
}
