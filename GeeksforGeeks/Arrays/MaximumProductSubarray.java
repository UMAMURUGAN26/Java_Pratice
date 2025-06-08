package com.testing.modules.arrays;

public class MaximumProductSubarray {

	public static void main(String[] args) {

		int arr[] = { -2, 6, -3, -10, 0, 2 };
		int sum = maxProduct(arr);

	}

	private static int maxProduct(int[] arr) {

		int maxEnding = arr[0];
		int maxSoFar = arr[0];
		int minEnding = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int num = arr[i];
			if (num < 0) {
				int temp = maxEnding;
				maxEnding = minEnding;
				minEnding = temp;
			}
			maxEnding = Math.max(num, maxEnding * num);
			minEnding = Math.min(num, minEnding * num);

			maxSoFar = Math.max(maxSoFar, maxEnding);

		}

		return maxSoFar;
	}

}
