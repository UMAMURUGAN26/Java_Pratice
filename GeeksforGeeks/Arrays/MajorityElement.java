package com.testing.modules.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };

		List<Integer> ele = findMajority(arr);

	}

	private static List<Integer> findMajority(int[] arr) {

		int n = arr.length;
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int i : arr) {

			count.put(i, count.getOrDefault(i, 0) + 1);
		}

		List<Integer> val = new ArrayList<>();
		for (Map.Entry<Integer, Integer> newVal : count.entrySet()) {
			if (newVal.getValue() > n / 3) {
				val.add(newVal.getKey());

			}
		}

		return val;
	}
}


