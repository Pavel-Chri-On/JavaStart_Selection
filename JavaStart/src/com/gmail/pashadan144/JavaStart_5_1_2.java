package com.gmail.pashadan144;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStart_5_1_2 {

	/*
	 * 2) �������� ��� ��� ����������� �������� ������� ����� ����� (������
	 * ��������� � ����������) � ����������� ���������� ������� ��� ��������
	 * �������. �������� ���� ������ �� �����.
	 */

	public static void main(String[] args) {
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ������� - ");
		x = scan.nextInt();
		
		int[] array = new int[x];
		
		for (int i = 0; i < x; i++) {
			System.out.println("������� " + (i + 1) + " ������� �������");
			array[i] = scan.nextInt();
		}
		
		System.out.println("��� ������ - " + Arrays.toString(array));
	}

}