package com.gmail.pashadan144;

import java.util.Arrays;
import java.util.Random;

public class JavaStart_5_1_3 {

	/*
	 * 3) ������� ������ ��������� ����� (�������� 15 ���������). �������� ������
	 * ������ � ��� ���� ������, ������ 15 ��������� ������ ���� ����� ���������
	 * ������� �������, � ��������� �������� ��������� ��������� ���������
	 * ���������.
	 */

	public static void main(String[] args) {

		int[] array = new int[15], array2 = new int[array.length * 2];
		int y = 0;

		Random random = new Random();

		for (int i = 0; i < array.length; i++) { /* ������ ��������� ����� */
			array[i] = random.nextInt(100);
		}

		for (int i = 0; i < array.length * 2;) {/* ��������� ������� ������� */
			if (i >= array.length) {
				array2[i] = array[y] * 2;
				y += 1;
			} else {
				array2[i] = array[i];
			}
			i += 1;

		}
		System.out.println("��� ��� ������ - " + Arrays.toString(array2));
	}

}