public class ThreeSortedArrays {

	/*
	 * Find Common Elements in Three Sorted Arrays Problem: Given three sorted
	 * arrays, find the common elements between them.
	 * 
	 * Example:
	 * 
	 * java Copy int[] arr1 = {1, 5, 10}; int[] arr2 = {1, 3, 10}; int[] arr3 = {1,
	 * 2, 10}; // Output: 1, 10
	 */
	public static void main(String args[]) {
		int[] arr1 = { 1, 5, 4, 10 };
		int[] arr2 = { 1, 3, 4, 10 };
		int[] arr3 = { 1, 2, 3, 4, 10 };
		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				for (k = 0; k < arr3.length; k++) {

					if ((arr1[i] == arr2[j]) && (arr2[j] == arr3[k])) {

						System.out.println(arr1[i]);
					}
				}
			}
		}

	}
}
