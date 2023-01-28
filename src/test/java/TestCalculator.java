import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	// Calculator calculator = new Calculator();

//	@Test
//	public void testAdd() {
//		assertEquals(7, calculator.doSum(3, 2, 2));
//	}

	Calculator calculator = null;

	CalculatorService service = new CalculatorService() {

		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return i+j;
		}
	};

	@Before
	public void setUp() {
		calculator = new Calculator(service);
	}

	@Test
	public void testAdd() {
		assertEquals(10, calculator.perform(2, 3));
	}

}
