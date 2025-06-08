import java.util.HashSet;
import java.util.Optional;

//Find the First Repeated Character in a String Using Stream Functions
public class FindtheFirstRepeatedCharacter {

	public static void main(String args[]) {
		String value = "namenaanm"; // n
		HashSet<Character> set = new HashSet<>();

		Optional<Character> repeated = value.chars().mapToObj(c -> (char) c).filter(c -> set.add(c)).findFirst();

		System.out.println("Testting " + repeated.get());

	}

}
