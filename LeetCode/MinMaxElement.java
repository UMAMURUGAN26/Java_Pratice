import java.util.Arrays;

public class MinMaxElement {

	/*
	 * Find Largest and Smallest Element in an Array Problem: Find the largest and
	 * smallest element in an array.
	 * 
	 * Example:
	 * 
	 * java Copy int[] arr = {1, 2, 3, 4, 5}; // Output: 5, 1
	 */
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5 };

		Integer min = Arrays.stream(arr).min().getAsInt();
		Integer max = Arrays.stream(arr).max().getAsInt();
		System.out.println(min);
		System.out.println(max);
	}
}
