package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_4 {

	/*
	 * 4) � ���������� ��������� ������������ �����. ���������, �������� �� ���
	 * �����������. ����������: ����������� ���������� �����, ����� ��� �����,
	 * ������� ����������� �������� ����� ������� � ������ ������. ��������, ���
	 * ����� 143341, 5555, 7117 � �. �.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x, number1, number2, number3, number4;

		System.out.println("������������ ����� - ");
		x = scan.nextInt();

		if (x > 100000 && x < 999999) {

			number1 = x / 1000;
			number2 = x % 1000 / 100;
			number3 = x % 100 / 10;
			number4 = x % 10;

			if (number1 == number4 * 100 + number3 * 10 + number2) {
				System.out.println("��� ���������");
			} else {
				System.out.println("��� �� ���������");
			}

		} else {
			System.out.println("��� �� ������������ �����");
		}
	}
}