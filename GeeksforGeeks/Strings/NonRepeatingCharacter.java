package com.testing.modules.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	public static void main(String[] args) {

		String s = "Testing";

		char ch = nonRepeatingChar(s);
		System.out.println(ch);

	}

	private static char nonRepeatingChar(String s) {

		char val = 0;

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		return '$';
	}

}
