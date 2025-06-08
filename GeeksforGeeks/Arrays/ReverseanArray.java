package com.testing.modules.arrays;

public class ReverseanArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 2, 6, 5 };
		reverseArray(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static void reverseArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
}

