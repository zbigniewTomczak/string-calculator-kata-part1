/**
 * - magic strings
 * - calculator is responsible for parsing
 */
public class StringCalculator {

	public static final int EMPTY_VALUE = 0;

	public int add(String input) {
		if (input.isEmpty()) {
			return EMPTY_VALUE;
		}
		String[] stringNumbers = split(input);
		return calculateSum(stringNumbers);
	}

	private int calculateSum(String[] stringNumbers) {
		int sum = 0;
		for (String stringNumber : stringNumbers) {
			sum += Integer.parseInt(stringNumber);
		}
		return sum;
	}

	String[] split(String input) {
		return input.split("[,\\n]");
	}
}
