public class BalancedString {

	/**
	 * We are given a string S of length N consisting only of letters 'A' and/or
	 * 'B'. Our goal is to obtain a string in the format "A...AB...B" (all letters
	 * 'A' occur before all letters 'B') by deleting some letters from S. In
	 * particular, strings consisting only of letters 'A' or only of letters 'B' fit
	 * this format. in java
	 * 
	 */

	public static void main(String[] args) {

		String S = "AABABBAB";
		System.out.println(maximizeABPattern(S));

	}

	private static int maximizeABPattern(String s) {

		int N = s.length();

		int prefix[] = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			prefix[i] = prefix[i - 1] + (s.charAt(i - 1) == 'A' ? 1 : 0);
		}
		int suffix[] = new int[N + 1];
		for (int i = N - 1; i >= 0; i--) {
			suffix[i] = suffix[i + 1] + (s.charAt(i) == 'B' ? 1 : 0);
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, prefix[i] + suffix[i]);
		}

		return max;
	}

}
