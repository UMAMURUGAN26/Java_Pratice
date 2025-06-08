import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String args[]) {

		String str = "abcabcbb";

		int j = 0;
		int maxLen = 0;
		HashSet<Character> sethsmao = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			while (sethsmao.contains(str.charAt(i))) {
				sethsmao.remove(str.charAt(j));
				j++;
			}

			sethsmao.add(str.charAt(i));
			maxLen = Math.max(maxLen, i - j + 1);

		}
		System.out.println(maxLen);

	}

	/*
	 * Find the Longest Substring Without Repeating Characters Problem: Write a
	 * function to find the length of the longest substring without repeating
	 * characters.
	 * 
	 * Example:
	 * 
	 * java Copy String str = "abcabcbb"; // Output: 3 ("abc")
	 */

}
