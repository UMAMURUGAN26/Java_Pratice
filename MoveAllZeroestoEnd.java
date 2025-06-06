public class MoveAllZeroestoEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

		pushZerosToEnd(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void pushZerosToEnd(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {

				arr[temp++] = arr[i];
			}
		}

		while (temp < arr.length) {
			arr[temp++] = 0;
		}
	}
}
