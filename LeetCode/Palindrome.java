public class Palindrome {

	/*
	 * Palindrome Check Problem: Given a string, check if it is a palindrome.
	 * 
	 * Example:
	 * 
	 * java Copy String str = "madam"; // Output: true
	 */
	public static void main(String args[]) {
		String str = "MADAM";
		String reverse = "";

		boolean check = checkpalindrome(str);

	}

	private static boolean checkpalindrome(String str) {
		int first = 0;
		int last = str.length() - 1;
		while (last < first) {
			if (str.charAt(first) != str.charAt(first)) {
				return false;
			}
			first++;
			last--;
		}
		return true;
	}

}

