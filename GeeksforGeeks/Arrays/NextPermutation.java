package com.testing.modules.arrays;

public class NextPermutation {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 1, 7, 5, 0 };
		nextPermutation(arr);
		for (int i : arr) {
			System.out.print(i);
		}

	}

	static void nextPermutation(int[] arr) {

		int n = arr.length;
		int i = n - 2;

		while (i >= 0 && arr[i] >= arr[i + 1]) {
			System.out.println("Hello" + i);
			i--;
		}
		if (i >= 0) {
			int j = n - 1;
			while (arr[j] <= arr[i]) {
				j--;
			}
			swap(arr, i, j);
		}
		reverse(arr, i + 1, n - 1);

		System.out.println(i);
	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}

