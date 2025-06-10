import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidateString {

	/***
	 * 
	 * valid if all characters of the string appear the same number of times. It is
	 * also valid if he can remove just character at index in the string, and the
	 * remaining characters will occur the same number of times. Given a string ,
	 * determine if it is valid. If so, return YES, otherwise return NO.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s = "aabbccddeefghi";

		String result = isValid(s);

		System.out.println("Valid Characters of String " + result);
	}

	public static String isValid(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (Character ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		System.out.println(map);
		HashMap<Integer, Integer> mapfreq = new HashMap<Integer, Integer>();
		for (Integer val : map.values()) {
			mapfreq.put(val, mapfreq.getOrDefault(val, 0) + 1);

		}
		if (mapfreq.size() == 1) {

			return "YES";
		}
		if (mapfreq.size() > 2) {

			return "NO";
		}
		List<Integer> list = new ArrayList<>(mapfreq.keySet());
		int freq1 = list.get(0);
		int freq2 = list.get(1);
		int count1 = mapfreq.get(freq1);
		int count2 = mapfreq.get(freq2);
		if ((freq1 == 1 && count1 == 1) || (freq2 == 1 && count2 == 1)) {
			return "YES";
		}
		if ((Math.abs(freq1 - freq2) == 1) && (count1 == 1 || count2 == 1)) {
			return "YES";
		}
		return "NO";
	}
}
