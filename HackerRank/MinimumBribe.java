import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MinimumBribe {

	public static void main(String[] args) throws IOException {

		List<List<Integer>> testCases = Arrays.asList(Arrays.asList(2, 1, 5, 3, 4), // Test case 1
				Arrays.asList(2, 5, 1, 3, 4) // Test case 2
				);

		for (List<Integer> q : testCases) {
			minimumBribes(q);
		}

	}

	public static void minimumBribes(List<Integer> q) {
		
		int bribes = 0;
		for (int i = 0; i < q.size(); i++) {
			int currentPerson = q.get(i);
			int originalPosition = currentPerson;
			int currentPosition = i + 1;

			if (originalPosition - currentPosition > 2) {
				System.out.println("Too chaotic");
				return;
			}
			for (int j = Math.max(0, currentPerson - 2); j < i; j++) {
				if (q.get(j) > currentPerson) {
					bribes++;
				}
			}
		}
		System.out.println(bribes);
	}

}

/***
 * 
 * Example
 * 
 * 
 * If person bribes person , the queue will look like this: . Only bribe is
 * required. Print 1.
 * 
 * 
 * Person had to bribe people to get to the current position. Print Too chaotic.
 * 
 */
