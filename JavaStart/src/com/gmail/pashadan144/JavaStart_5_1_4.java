package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_5_1_4 {

	/*
	 * 4) ������� ������ ������ � ���������� � ���������� ��������� ��� �����������
	 * �������� ���������� ������� � 'b' � ���� ������, � ������� ��������� ��
	 * �����.
	 */

	public static void main(String[] args) {
		int x = 0;

		Scanner scan = new Scanner(System.in);

		String text = "";

		System.out.println("������� ������ (��� ��������) - ");
		text = scan.next();

		String[] t = text.toLowerCase().split(""); /* ������� ������� ������ � ������� �������� */

		for (String temp : t) {
			if (temp.indexOf("b") == 0) {
				x += 1;
			}
		}
		System.out.println("���������� ������� 'b' - " + x);
	}

}