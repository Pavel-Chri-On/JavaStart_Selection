package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_3 {

	/*
	 * 3)�������� ��������� ������� �������� � ������� �� ����� ����� ����������,
	 * ���� �� ������ ����������� � ����������.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, r;

		System.out.println("������� ������ ���������� - ");
		r = scan.nextDouble();

		x = 2 * Math.PI * r;

		System.out.println("�����: L =");
		System.out.println(x);

	}
}