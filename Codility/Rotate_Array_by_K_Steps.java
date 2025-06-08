public class Rotate_Array_by_K_Steps {

	public static void main(String[] args) {

		// Given an array and a number K, rotate the array to the right by K steps.
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int d = 2;
		rotate(arr, d);
		System.out.println("###" + java.util.Arrays.toString(arr));

	}

	private static void rotate(int[] arr, int d) {
		int n = arr.length;
		d %= n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);

	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

	}

}
