public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(binaryGap(9));

	}

	private static int binaryGap(int i) {
		String binGap = Integer.toBinaryString(i);
		int maxGap = 0;
		int currGap = 0;
		for (char digit : binGap.toCharArray()) {
			if (digit == '1') {
				maxGap = Math.max(maxGap, currGap);
				currGap = 0;
			} else {
				currGap++;
			}

		}
		return maxGap;
	}

}
