import java.util.Arrays;

public class NthFibonacciNumber {

	public static void main(String args[]) {

		int n = 5;
		seriesmemo(n);

		System.out.println(n);

	}

	private static void seriesmemo(int n) {
		int memo[] = new int[n + 1];
		Arrays.fill(memo, -1);

		series_memo(n, memo);

	}

	private static int series_memo(int n, int[] memo) {
		if (n <= 1) {
			return n;
		}
		if (memo[n] != -1) {
			return memo[n];
		}

		memo[n] = series_memo(n - 1, memo) + series_memo(n - 2, memo);

		return memo[n];

	}

}
