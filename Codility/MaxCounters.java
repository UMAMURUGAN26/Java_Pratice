public class MaxCounters {

	public static void main(String[] args) {

		int N = 5;

		int[] operations = { 3, 4, 4, 6, 1, 4, 4 };

		int[] result = solution(N, operations);
		System.out.println(result.toString());

	}

	private static int[] solution(int n, int[] a) {

		int minValue = 0;

		int maxValue = 0;
		int[] answer = new int[n];

		for (int i = 0; i < a.length; i++) {
			int x = a[i];

			if (x >= 1 && x <= n) {
				answer[x - 1] = Math.max(answer[x - 1] + 1, minValue + 1);
				maxValue = Math.max(answer[x - 1], maxValue);
			} else if (x == n + 1) {
				minValue = maxValue;

			}

		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = Math.max(answer[i], minValue);

		}
		return answer;
	}

}
