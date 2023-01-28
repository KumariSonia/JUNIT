import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCalculator {
	// Calculator calculator = new Calculator();

//	@Test
//	public void testAdd() {
//		assertEquals(7, calculator.doSum(3, 2, 2));
//	}

	Calculator calculator = null;

//	CalculatorService service = new CalculatorService() {
//
//		public int add(int i, int j) {
//			// TODO Auto-generated method stub
//			return i+j;
//		}
//	};

//	CalculatorService service = mock(CalculatorService.class);
//

	@Mock
	CalculatorService service;

	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Before
	public void setUp() {
		calculator = new Calculator(service);
	}

	@Test
	public void testAdd() {
		
		when(service.add(2, 3)).thenReturn(5);		
		assertEquals(10, calculator.perform(2, 3));
		verify(service).add(2, 3);
	}

}
