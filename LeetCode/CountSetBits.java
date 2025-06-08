public class CountSetBits {

	public static void main(String args[]) {

		/*
		 * Count Set Bits (Hamming Weight) Problem: Write a function to count the number
		 * of 1s in the binary representation of an integer.
		 * 
		 * Example:
		 * 
		 * java Copy int num = 29; // Binary representation: 11101, Output: 4
		 */

		int num = 29;
		func(num);
		System.out.println(func(num));

	}

	private static int func(int num) {

		if (num == 0) {
			return 0;
		} else {
			return (num & 1) + func(num >> 1);
		}

	}

}
