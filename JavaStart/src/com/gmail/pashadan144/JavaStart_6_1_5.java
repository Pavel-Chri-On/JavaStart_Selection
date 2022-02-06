package com.gmail.pashadan144;

public class JavaStart_6_1_5 {
	public static void main(String[] args) {

		
		String str = " Hello world! How are you? ";
		System.out.println(countWords(str));
		
	}

	static int countWords(String text) {
		text = text.trim();
		String[] t = text.split("[ ]");
		return t.length;
	}

}
