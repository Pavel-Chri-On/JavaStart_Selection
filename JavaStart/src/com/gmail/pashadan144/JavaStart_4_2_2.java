package com.gmail.pashadan144;

public class JavaStart_4_2_2 {

	/*
	 * 2) � ������� ������ ������� �� ����� ��� ������� ����� �� 1 �� 100. �������
	 * ����� � ����� ������� �������� ������ ������ �� ������� ��� ���� �� ����.
	 * ������ ������� ����� ��� � 2,3,5,7...
	 */

	public static void main(String[] args) {
		int x = 100, y = 0, a = 0;

		for (int i = 2; i <= x; i++) {
			y = 1;
			for (int j = 3; j < i; j++) {

				if (i % (i - y) == 0) { /* �������� ����� �� ��������*/
					a = 1;
					break;
				}
				y += 1;
			}
			if (a == 0) {
				System.out.println(i);
			}
			a = 0;
		}
	}

}

/*
 * ��� ���� i �� 2 �� 100 (���������, ������� �� ����� i �� �����-���� �� �����
 * �� ���� ���� �������, �� ��� i �� ��������, ���� ��������� ���� �� �������,
 * �� i - ������� �����)
 */