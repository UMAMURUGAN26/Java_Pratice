public class Fibonacci {

	/*
	 * Fibonacci Sequence Problem: Write a function that generates the nth Fibonacci
	 * number.
	 * Example:
	 * java Copy int n = 5; // Output: 5
	 ** 
	 */

	public static void main(String args[]) {

		int count = 5;
		for (int i = 0; i < count; i++) {

			System.out.println(series(i));
		}
	}

	private static int series(int i) {
		if (i <= 1) {
			return i;
		} else {
			return (series(i - 2) + series(i - 1));
		}

	}

}
