import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RemoveIndex {

	public static void main(String[] args) throws IOException {

		String str1 = "abdgggda";

		String str2 = "abdggda";

		List<Integer> result = getRemovableIndices(str1, str2);

		System.out.println(result);

	}

	public static List<Integer> getRemovableIndices(String str1, String str2) {
		// Write your code here
		List<Integer> val = new ArrayList<>();

		for (int i = 0; i < str1.length(); i++) {
			String str = str1.substring(0, i) + str1.substring(i + 1);
			if (str.equals(str2)) {
				val.add(i);
			}

		}
		if (val.isEmpty()) {
			val.add(-1);
		}
		return val;
	}

}


