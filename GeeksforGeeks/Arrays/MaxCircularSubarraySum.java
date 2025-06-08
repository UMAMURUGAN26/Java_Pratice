package com.testing.modules.arrays;

public class MaxCircularSubarraySum {

	public static void main(String[] args) {

		int arr[] = { 8, -8, 9, -9, 10, -11, 12 };
		int val = circularSubarraySum(arr);


	}

	private static int circularSubarraySum(int[] arr) {

		int total = 0;
		for (int num : arr) {
			total += num;
		}

		int min = minCalculation(arr);
		int max = maxCalculation(arr);

		if (max < 0)
			return max;
		int minCircle = total - min;
		int val = Math.max(minCircle, max);

		return val;
	}

	private static int maxCalculation(int[] arr) {

		int maxNow = arr[0];
		int currMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currMax = Math.max(arr[i], currMax + arr[i]);
			maxNow = Math.max(maxNow, currMax);
		}
		return maxNow;
	}

	private static int minCalculation(int[] arr) {

		int currMin = arr[0];
		int minNow = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currMin = Math.min(arr[i], currMin + arr[i]);
			minNow = Math.min(minNow, currMin);

		}
		return minNow;
	}

}
