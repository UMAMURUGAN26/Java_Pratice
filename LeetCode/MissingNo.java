public class MissingNo {

	/*
	 * Find the Missing Number Problem: You are given an array of integers from 1 to
	 * N, with one number missing. Find the missing number.
	 * 
	 * Example:
	 * 
	 * java Copy int[] arr = {1, 2, 4, 5, 6}; // Output: 3 *
	 */
	public static void main(String args[]) {
		int a[] = { 1, 3, 4 };
		int max = 4;
		miss(a, max);

	}

	private static void miss(int[] a, int max) {

		int n = a.length + 1;
		int expsum = n * (n + 1) / 2;
		int actsum = 0;
		for (int num : a) {
			actsum += num;
		}

		int miss = expsum - actsum;
		System.out.println("miss" + miss);

	}

}
