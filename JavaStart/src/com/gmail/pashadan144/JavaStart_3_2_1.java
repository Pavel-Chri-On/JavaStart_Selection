package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_1 {

	/*
	 * 1) ���� ���� � ������� � ������ ��������� � �������� 4. ������������ ������ �
	 * ���������� ���������� ����� x � y. �������� ��������� ������� ��������� �����
	 * �� ��� ����� ������ ����� ��� ���.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x, y;
		
		System.out.println("x - ");
		x = scan.nextInt();
		
		System.out.println("y - ");
		y = scan.nextInt();
		
		if (Math.pow(x,2) + Math.pow(y,2) < 16) {
			System.out.println("����� ����� ������ �����");
		} else {
			System.out.println("����� �� ����� ������ �����");

		}
	}
}