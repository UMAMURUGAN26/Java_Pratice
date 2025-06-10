import java.io.IOException;

public class MinimumSwaps {
	public static void main(String[] args) throws IOException {

		int[] arr = {7, 1, 3, 2, 4, 5, 6};

		int res = minimumSwaps(arr);
		System.out.println(res);

	}

	static int minimumSwaps(int[] arr) {
		int swap = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i + 1) {
				int value = arr[i] - 1;
				int temp = arr[i];
				arr[i] = arr[value];
				arr[value] = temp;
				swap++;
			}
		}
		return swap;

}
}

	
	
	