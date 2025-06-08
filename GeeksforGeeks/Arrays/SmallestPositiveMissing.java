package com.testing.modules.arrays;

import java.util.HashSet;

public class SmallestPositiveMissing {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int val = missingNumber(arr);

	}

	private static int missingNumber(int[] arr) {
		HashSet set = new HashSet();
		for (int num : arr) {
			if (num > 0)
				set.add(num);
		}
		int i = 1;
		while (true) {
			if (!set.contains(i)) {
				return i;
			}
			i++;
		}
	}
}

