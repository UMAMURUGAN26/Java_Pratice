public class FrogJump {

	public static void main(String[] args) {

		int X = 10;
		int Y = 85;
		int D = 30;

		// Output the result
		System.out.println(minimumJumps(X, Y, D)); // Output: 3
	}

	private static int minimumJumps(int x, int y, int d) {

		int jumps = (y - x + d - 1) / d;
		return jumps;
	}

}
