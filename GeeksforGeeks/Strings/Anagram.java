package com.testing.modules.strings;

import java.util.HashSet;

public class Anagram {

	public static boolean areAnagrams(String s1, String s2) {
		StringBuilder sb = new StringBuilder();

		if (s1.length() == s2.length()) {

			HashSet<Character> set = new HashSet<>();
			for (int i = 0; i < s1.length(); i++) {
				char s = s1.charAt(i);
				set.add(s);

			}

			for (int i = 0; i < s2.length(); i++) {
				char s = s2.charAt(i);
				if (!set.contains(s)) {
					return false;
				}

			}

		} else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "aab", s2 = "abb";

		boolean b = areAnagrams(s1, s2);
		System.out.println(b);

	}
}