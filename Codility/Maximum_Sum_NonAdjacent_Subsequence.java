public class Maximum_Sum_NonAdjacent_Subsequence {

	public static void main(String args[]) {
		int arr[] = { 5, 5, 10, 100, 10, 5 };

		sum(arr);
		System.out.println(sum(arr));

	}

	private static int sum(int[] arr) {
		int include = arr[0];
		int exclude = 0;
		for (int i = 1; i < arr.length; i++) {
			int newinclude = exclude + arr[i];
			exclude = Math.max(exclude, include);
			include = newinclude;

		}
		return Math.max(include, exclude);
	}
}