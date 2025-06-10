package HackerCode;

import java.util.Arrays;

public class SockMerchant {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 1, 2, 1, 3, 2 };

		int n = '7';

		int result = sockMerchant(n, ar);
		System.out.println("The number of pairs is " + result);
	}

	private static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int count = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] == ar[i - 1]) {
				i++;
				count++;
			}
		}
		return count;
	}
}

/***
 * 
 * Example n=7 ar=[1,2,1,2,1,3,2]
 * 
 * There is one pair of color 1 and one of color 2. There are three odd socks
 * left, one of each color. The number of pairs is 2.
 * 
 * 
 */
