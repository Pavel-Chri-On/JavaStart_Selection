package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_3 {

	/*
	 * 3) ���������� ���������� ���� � ����, ������� ������ ������������. �
	 * ���������� ���� - 366 ����, ����� ��� � ������� 365. ���������� ���
	 * ������������ �� ���������� �������: ��� ����������, ���� �� ������� �� ������
	 * ��� �������, �� ���� �� ������� �� 100 ��� �������, ��� �� ���������� ���.
	 * ������, ���� �� ������� ��� ������� �� 400, ��� ���������� ���.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;

		System.out.println("������� ��� - ");
		year = scan.nextInt();
		
		if ((year % 4) == 0 && (year % 100) > 0) {
			System.out.println("���������� ���, 366 ����");
		} else if ((year % 400) == 0) {
			System.out.println("���������� ���, 366 ����");
		} else {
			System.out.println("�� ���������� ���, 365 ����");
		}

	}
}