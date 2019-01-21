package Eclipse.Calculator;

import org.junit.Assert;
import org.junit.*;

public class CalculatorTest {

	@Test
	public void test_calculate_add_numbers() {
		double number1 = 0;
		double number2 = 1;

		// expected result

		double expected = 0;

		// actual value
		double actual = calculations.Division(number1, number2);
		Assert.assertEquals(expected, actual, 0.1);
	}
}