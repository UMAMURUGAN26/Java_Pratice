public class MergeSortedArray {

	/*
	 * Merge Two Sorted Arrays Problem: Given two sorted arrays, merge them into a
	 * single sorted array.
	 * 
	 * Example:
	 * 
	 * java Copy int[] arr1 = {1, 3, 5}; int[] arr2 = {2, 4, 6}; // Output: [1, 2,
	 * 3, 4, 5, 6]
	 */
	public static void main(String args[]) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };

		// Merge the arrays
		int[] mergedArray = mergeSortedArrays(arr1, arr2);

		// Print the merged array
		System.out.println("Merged Array: ");
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}

	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] result = new int[n + m]; // Result array to store merged elements

		int i = 0, j = 0, k = 0; // Pointers for arr1, arr2, and result

		// Traverse both arrays and merge
		while (i < n && j < m) {
			if (arr1[i] <= arr2[j]) {
				System.out.println("i " + i);

				result[k++] = arr1[i++];

			} else {
				result[k++] = arr2[j++];
			}
		}

		// If elements are left in arr1
		while (i < n) {
			result[k++] = arr1[i++];
		}

		// If elements are left in arr2
		while (j < m) {
			result[k++] = arr2[j++];
		}

		System.out.println(result.toString());
		return result;
	}
}
