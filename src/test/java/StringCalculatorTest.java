import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
	@org.junit.Test
	public void add_emptyString_returnsEmptyValue() {
		// given
		String emptyString = "";
		int emptyValue = 0;
		StringCalculator stringCalculator = new StringCalculator();
		// when
		int value = stringCalculator.add(emptyString);
		//then
		Assert.assertEquals(emptyValue, value);
	}

	@Test
	public void add_oneNumber_returnsThisNumber() {
		// given
		String stringNumber = "1";
		int number = 1;
		StringCalculator calculator = new StringCalculator();
		// when
		int value = calculator.add(stringNumber);
		//then
		Assert.assertEquals(number, value);
	}

	@Test
	public void add_twoNumbers_returnsSum() {
		// given
		String twoNumbers = "1,2";
		int sum = 3;
		StringCalculator calculator = new StringCalculator();
		// when
		int value = calculator.add(twoNumbers);
		//then
		Assert.assertEquals(sum, value);
	}

	@Test
	public void add_manyNumbers_returnsSum() {
		// given
		String manyNumbers = "1,10,100,1000";
		int sum = 1111;
		StringCalculator calculator = new StringCalculator();
		// when
		int value = calculator.add(manyNumbers);
		//then
		Assert.assertEquals(sum, value);
	}

	@Test
	public void split_commaAndNewLineExistInString_returnsCorrectlySplitArray() {
		// given
		String input = "1\n2,3";
		String[] correctSplit = {"1","2","3"};
		StringCalculator calculator = new StringCalculator();
		// when
		String[] split = calculator.split(input);
		//then
		Assert.assertArrayEquals(correctSplit, split);
	}
}
