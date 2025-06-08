public class Occurance {

	/*
	 * Count Occurrences of a Character in a String Problem: Given a string, count
	 * the number of occurrences of a specific character.
	 * 
	 * Example:
	 * 
	 * java Copy String str = "hello"; char ch = 'l'; // Output: 2
	 */ public static void main(String args[]) {
		String str = "helllo";
		char ch = 'l';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {
				count++;
			}

		}
		System.out.println(count);
	}

}
