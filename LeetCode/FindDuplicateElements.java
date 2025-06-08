import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find Duplicate Elements in a Given Integers List in Java Using Stream Functions
public class FindDuplicateElements {

	public static void main(String args[]) {

		List<Integer> nos = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7);

		Map<Integer, Long> listMap = nos.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Integer> duplicate = listMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey()).collect(Collectors.toList());
		System.out.println("duplicate " + duplicate);

	}
}
