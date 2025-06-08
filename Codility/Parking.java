public class Parking {
	public static void main(String args[]) {

		// Example cases
		System.out.println(solution("10:00", "13:21")); // Output: 17
		System.out.println(solution("09:42", "11:42")); // Output: 9
	}

	private static int solution(String start, String end) {

		int startMin = convertToMin(start);
		int endMin = convertToMin(end);
		int totalMin = endMin - startMin;
		int totalCost = 2;
		if (totalMin > 0) {
			totalCost += 3;
			totalMin -= 60;
		}
		if (totalMin > 0) {
			totalCost += 4 * (int) Math.ceil(totalMin / 60.0);
		}
		return totalCost;
	}

	private static int convertToMin(String time) {

		String[] parts = time.split(":");
		int hours = Integer.parseInt(parts[0]);
		int mins = Integer.parseInt(parts[1]);

		return hours * 60 + mins;
	}

}
