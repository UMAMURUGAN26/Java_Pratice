public class Equilibrium {

	public static void main(String[] args) {

		int[] A = { 3, 1, 2, 4, 3 };

		System.out.println(solution(A));
	}

	private static int solution(int[] a) {

		int totalSum = 0;
		for (int i : a) {
			totalSum += i;
		}

		int leftSum = 0;
		int rightSum = 0;
		int currentDiff = 0;
		int miniDiff = Integer.MAX_VALUE;

		for (int j = 0; j < a.length - 1; j++) {
			leftSum += a[j];
			rightSum = totalSum - leftSum;
			currentDiff = Math.abs(leftSum - rightSum);
			miniDiff = Math.min(miniDiff, currentDiff);

		}
		return miniDiff;

	}

}