package com.testing.modules.strings;

public class StringsRotationsEachOther {

	public static void main(String[] args) {

		String s1 = "abcd", s2 = "cdab";

		boolean val = areRotations(s1, s2);
		System.out.println(val);

	}

	private static boolean areRotations(String s1, String s2) {

		int n = s1.length();

		for (int i = 0; i < s1.length(); i++) {

			if (s1.equals(s2)) {
				return true;
			}
			char ch = s1.charAt(n - 1);
			s1 = ch + s1.substring(0, n - 1);

		}

		return false;
	}
}
