import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {
	Calculator calculator = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(7, calculator.doSum(3, 2, 2));
	}

}
