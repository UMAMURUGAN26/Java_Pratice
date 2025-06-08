package com.testing.modules.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 12, 35, 34 };
		try {
			try {
				int secondLargest = getSecondLargest(arr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int getSecondLargest(int[] arr) {

		int n = arr.length - 1;
		int a[] = Arrays.stream(arr).distinct().sorted().toArray();

		if (a.length < 2) {
			return -1;
		}
		return a[arr.length - 2];
	}

}
