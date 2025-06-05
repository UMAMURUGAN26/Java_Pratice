public class KadaneAlgorithm {

	public static void main(String[] args) {

		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };

		int sum = maxSubarraySum(arr);

		System.out.print(sum);

	}

	private static int maxSubarraySum(int[] arr) {

		int max = arr[0];
		int maxi = arr[0];

		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max + arr[i]);
			maxi = Math.max(maxi, max);
		}

		return maxi;
	}

}
