public class CountingValley {

	public static void main(String[] args) {

		int steps = 8;

		String path = "UDDDUDUU";

		int result = countingValleys(steps, path);

		System.out.println(" The number of valleys walked through  is " + result);
	}

	public static int countingValleys(int steps, String path) {
		int level = 0;
		int valley = 0;
		for (char step : path.toCharArray()) {
			if (step == 'U') {
				level++;
				if (level == 0) {
					valley++;
				}
			} else {
				level--;
			}
		}
		return valley;
	}

}