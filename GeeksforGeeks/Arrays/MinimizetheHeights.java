package com.testing.modules.arrays;

import java.util.Arrays;

public class MinimizetheHeights {

	public static void main(String[] args) {

		int arr[] = { 1, 8, 10, 6, 4, 6, 9, 1 };
		int k = 7;
		int min = getMinDiff(arr, k);
	}

	private static int getMinDiff(int[] arr, int k) {

		Arrays.sort(arr);

		int diff = arr[arr.length - 1] - arr[0];
		int smallest = arr[0] + k;
		int largest = arr[arr.length - 1] - k;

		for (int i = 0; i < arr.length - 1; i++) {

			int min = Math.min(smallest, arr[i + 1] - k);
			int max = Math.max(largest, arr[i] + k);
			if (min < 0)
				continue;
			diff = Math.min(diff, max - min);

		}

		return diff;
	}

}
//Using Sorting - O(nlogn) Time and O(1) Space