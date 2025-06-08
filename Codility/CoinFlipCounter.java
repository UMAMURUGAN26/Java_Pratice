import java.util.Random;

public class CoinFlipCounter {

	public static void main(String[] args) {

		int N = 10; // Number of coin flips
		countHeadsAndTails(N);

	}

	private static void countHeadsAndTails(int n) {

		int head = 0;
		int tail = 0;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {

			int flip = rand.nextInt(2);
			if (flip == 0)
				head++;
			else
				tail++;

		}

		System.out.println("Total heads: " + head);
		System.out.println("Total tails: " + tail);

	}

}
