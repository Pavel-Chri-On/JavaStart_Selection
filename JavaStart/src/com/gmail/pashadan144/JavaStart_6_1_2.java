package com.gmail.pashadan144;

public class JavaStart_6_1_2 {

	public static void main(String[] args) {

		/*
		 * 2) ���������� ����� ����������� �������� �������� - ����� �����, ������������
		 * ����� � ������. ���������� �� ������������ ������ � ������ ������������� �
		 * ������ �����.
		 */

		int x = 90;
		double y = 435.2345;

		String z = "Maybe... ";
		System.out.println(getConcat(z, x, y));

	}

	static String getConcat(String a, int b, double c) {
		String str = a + (b + c);
		return str;
	}

}
