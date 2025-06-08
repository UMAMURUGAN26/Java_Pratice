public class SumofDigitsofaNumber {
	/*
	 * Sum of Digits of a Number Problem: Write a function to find the sum of digits
	 * of a number.
	 * 
	 * Example:
	 * 
	 * java Copy int num = 123; // Output: 6 (1 + 2 + 3)
	 */
	public static void main(String args[]) {
		int num = 123;
		int sum;
		for (sum = 0; num != 0; num = num / 10) {
			sum = sum + num % 10;
		}
		System.out.println(sum);

	}

}
