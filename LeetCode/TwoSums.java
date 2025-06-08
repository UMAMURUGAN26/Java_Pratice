public class TwoSums {
	public static void main(String args[]) {

		/*
		 * Given an array of integers nums and an integer target, return indices of the
		 * two numbers such that they add up to target.
		 * 
		 * You may assume that each input would have exactly one solution, and you may
		 * not use the same element twice. Example 1:
		 * 
		 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
		 * nums[0] + nums[1] == 9, we return [0, 1].
		 */

		int[] ch = { 2, 7, 11, 15 };
		int target = 9;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] + ch[j] == target) {
					System.out.println(i);
					System.out.println(j);
				}

			}
		}

	}

}
