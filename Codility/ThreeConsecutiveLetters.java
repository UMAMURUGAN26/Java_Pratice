public class ThreeConsecutiveLetters {
	// Given two integers A and B, return a string which contains A letters "a" and
	// B letters "b"
	// with no three consecutive letters being the same.

	public static void main(String[] args) {

		System.out.println(solution(5, 3)); // "aabaabab" or other valid combinations
		System.out.println(solution(3, 3)); // "ababab" or other valid combinations
		System.out.println(solution(1, 4)); // "bbabb" or other valid combinations

		}

	private static StringBuilder solution(int a, int b) {
		
		StringBuilder build = new StringBuilder();
		while (a > 0 || b > 0) {
			if (a > b) {
				if (a > 1) {
					build.append("aa");
					a -= 2;

				} else {
					build.append("a");
					a--;
				}
				if (b > 0) {
					build.append("b");
					b--;
				}
			} else {
				if (b > 1) {
					build.append("bb");
					b -= 2;
				} else {
					build.append("b");
					b--;
				}
				if (a > 0) {
					build.append("a");
					a--;
				}
			}
		}
		return build;
	}

}

