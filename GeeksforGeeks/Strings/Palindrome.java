package com.testing.modules.strings;

public class Palindrome {

	public static void main(String[] args) {

		String s = "abc";

		int val = minChar(s);

	}

	public static int minChar(String s) {

		int n = s.length();
		int m = n / 2;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(n - m);
			s = ch + s;

		}
		return n;

	}

}
