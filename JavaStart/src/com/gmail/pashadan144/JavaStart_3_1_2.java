package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_2 {

	/*
	 * 2) ���� ������������� ���, � ������� 4 ��������. ����� �������� ���������� �
	 * �������. �� ����� ����� 4 ��������. �������� ��������� ������� ������� �����
	 * �������� � ����������, � ������� �� ����� �� ����� �����, ������ ��������
	 * ������������ ��� ��������. ���� ����� �������� ��� � ���� ���� �� �����
	 * �������� �� ���� ������������.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, x;

		System.out.println("����� �������� - ");
		N = scan.nextInt();

		if (N > 0 && N < 145) {
			if (N < 37) {
				System.out.println("������� �1");
			} else if (N < 73) {
				System.out.println("������� �2");
			} else if (N < 109) {
				System.out.println("������� �3");
			} else if (N < 145) {
				System.out.println("������� �4");
			}

			x = N % 36 / 4;

			if (0 < x && x <= 1) {
				System.out.println("���� �1");
			} else if (0 < x && x <= 2) {
				System.out.println("���� �2");
			} else if (0 < x && x <= 3) {
				System.out.println("���� �3");
			} else if (0 < x && x <= 4) {
				System.out.println("���� �4");
			} else if (0 < x && x <= 5) {
				System.out.println("���� �5");
			} else if (0 < x && x <= 6) {
				System.out.println("���� �6");
			} else if (0 < x && x <= 7) {
				System.out.println("���� �7");
			} else if (0 < x && x <= 8) {
				System.out.println("���� �8");
			} else if (x <= 9) {
				System.out.println("���� �9");
			}
		} else {
			System.out.println("����� �������� �� ����������");
		}

	}
}