public class BugfixingLeaderSorted {
	public static void main(String args[]) {
		int a[] = { 1, 1, 1, 1, 1, 50, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

		System.out.println(leader(a));
	}

	private static int leader(int[] a) {

		int N = a.length;
		int mid = a[N / 2];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == mid) {
				count++;

			}
		}
		if (count > a.length / 2)
			return mid;
		return count;
	}

}
