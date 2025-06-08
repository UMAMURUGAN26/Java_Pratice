public class Factorial {
	/*
	 * Find Factorial of a Number Problem: Write a function that returns the
	 * factorial of a given number.
	 * 
	 * Example:
	 * 
	 * java Copy int n = 5; // Output: 120
	 */
	public static void main(String args[]) {
		int n = 5;
		int f = 1;
		System.out.println(fact(n));
	}

	private static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

}

