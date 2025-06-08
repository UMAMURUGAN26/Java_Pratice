package com.testing.modules.arrays;

public class RotateArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int d = 0;
		rotateArr(arr, d);
		for (int i : arr) {
			System.out.print(i);
		}

	}

	static void rotateArr(int arr[], int d) {

		int n = arr.length;
		d = d % n;
		System.out.println(d);
		rotate(arr, 0, d - 1);
		rotate(arr, d, n - 1);
		rotate(arr, 0, n - 1);
	}

	private static void rotate(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

	}
}

