public class BoyerMooreVotingAlgorithm {
	public static void main(String args[]) {
		int a[] = { 2, 2, 1, 1, 1, 2, 2 };

		int result = majorityElement(a);
		System.out.println(result);
	}

	public static int majorityElement(int[] nums) {

		int count = 0;
		int candidate = 0;
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}

		return candidate;
	}

}
