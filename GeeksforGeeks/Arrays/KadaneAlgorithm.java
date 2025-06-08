package com.testing.modules.arrays;

public class KadaneAlgorithm {

	public static void main(String[] args) {

		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };

		int sum = maxSubarraySum(arr);

		System.out.print(sum);

	}

	private static int maxSubarraySum(int[] arr) {

		int max = arr[0];
		int maxi = arr[0];

		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max + arr[i]);
			maxi = Math.max(maxi, max);
		}

		return maxi;
	}

}

/***
 * //[Expected Approach] Using Kadane's Algorithm - O(n) Time and O(1) Space
 * //The idea of Kadane's algorithm is to traverse over the array from left to
 * right and for each element, find the maximum sum among all subarrays ending
 * at that element. The result will be the maximum of all these values.
 * 
 * //but, the main issue is how to calculate maximum sum among all the subarrays
 * ending at an element in O(N) time?
 * 
 * i arr[i] maxEndingHere maxSoFar 0 2 2 2 1 3 max(3, 2 + 3) = 5 max(2, 5) = 5 2
 * -8 max(-8, 5 - 8) = -3 max(5, -3) = 5 3 7 max(7, -3 + 7) = 7 max(5, 7) = 7 4
 * -1 max(-1, 7 - 1) = 6 max(7, 6) = 7 5 2 max(2, 6 + 2) = 8 max(7, 8) = 8 6 3
 * max(3, 8 + 3) = 11 max(8, 11) = 11
 */