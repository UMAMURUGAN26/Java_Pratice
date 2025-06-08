import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_First_Non_Repeated_Character_String {

	public static void main(String args[]) {
		String input = "swiss";

		// Convert int to char, then to String
		Map<String, Long> testing = input.chars().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Optional<String> val = testing.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey())
				.findFirst();
		System.out.println("First Character" + val.get());
	}

}
