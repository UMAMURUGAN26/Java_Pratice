public class ParityDegree {

	// Find the highest power of 2 that divides N.
	public static void main(String[] args) {

		System.out.println(solution(24));

	}

	private static int solution(int i) {

		int count = 0;
		while (i % 2 == 0) {

			i /= 2;
			count++;
		}

		return count;
	}

}
