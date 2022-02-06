package com.gmail.pashadan144;

public class JavaStart_6_2_1 {
	public static void main(String[] args) {

		int[] array = { 1, 4, 9, 16, 25 };
		System.out.println(sequence(array));

	}

	static int sequence(int[] array) {
		int a = array.length, x = 0;
		if (array[a - 1] - array[a - 2] == array[a - 3] - array[a - 4]) {
			return sequence1(array, a, x);
		} else if (array[a - 1] / array[1] == array[a - 2]) {
			return sequence2(array, a, x);
		} else {
			return sequence3(array, a, x);
		}
	}

	static int sequenceError() {
		System.out.println("Something is wrong with the sequence...");
		return 0;

	}

	static int sequence1(int[] array, int a, int x) {
		x = array[a - 1] - array[a - 2];
		for (int i = a - 4; i > 4;) {
			if (!(x == array[a - i - 1] - array[a - i - 2])) {
				return sequenceError();
			}
			i += 2;
		}
		return array[a - 1] + x;
	}

	static int sequence2(int[] array, int a, int x) {
		x = array[1];
		for (int i = 0; i < a;) {
			if (!(array[a - 1 - i] / (x) == array[a - 2 - i])) {
				return sequenceError();
			}
			i += 2;
		}
		return (int) Math.pow(x, a);
	}

	static int sequence3(int[] array, int a, int x) {
		x = array[1];
		for (int i = 2; i < a; i++) {
			x /= 2;
			if (x == 2) {
				x = i;
				break;
			}
		}
		if (Math.pow(3, x) == array[2]) {
			for (int j = 0; j < a; j++) {
				if (!(Math.pow(1 + j, x) == array[0 + j])) {
					return sequenceError();
				}
			}
			return (int) Math.pow(a + 1, x);
		} else {
			return sequenceError();
		}

	}
}
