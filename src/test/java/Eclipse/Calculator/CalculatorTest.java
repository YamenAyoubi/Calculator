package Eclipse.Calculator;

import org.junit.Assert;
import org.junit.*;

public class CalculatorTest {


	
	@Test
	public void test_calculate_add_numbers() {
		int number1 = 0;
		int number2 = 1;

		// expected result

		int expected = 0;

		// actual value
		int actual = calculations.Division(number1, number2);
		Assert.assertEquals(expected, actual, 0.1);
	}
}

