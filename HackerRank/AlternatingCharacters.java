public class AlternatingCharacters {
	

	public static void main(String[] args) {
		String s = "AABAAB";

		// Remove an A at positions 0 and 3 to make s=ABAB in 2 deletions.

		int result = alternateChar(s);

		System.out.println("Number of valid substrings: " + result);
	}

	static int alternateChar(String s) {
		
		int del = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				del++;
			}
		}
		return del;

	}

}
