import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNoteVerifier {

	public static void main(String[] args) throws IOException {
		
		String magazineLine = "give me one grand today night";
		String noteLine = "give one grand today";

		List<String> magazine = Arrays.asList(magazineLine.split(" "));
		List<String> note = Arrays.asList(noteLine.split(" "));

		checkMagazine(magazine, note);

	}

	public static void checkMagazine(List<String> magazine, List<String> note) {
		
		Map<String, Integer> map = new HashMap<>();

		for (String mag : magazine) {
			map.put(mag, map.getOrDefault(mag, 0) + 1);
		}
		for (String not : note) {
			if (!map.containsKey(not) || map.get(not) == 0) {
				System.out.println("No");
				return;
			}
			map.put(not, map.getOrDefault(not, 0) - 1);

		}
		System.out.println("Yes");
	}

}
