
public class Calculator {

	CalculatorService service;

	public int doSum(int a, int b, int c) {
		return a + b + c;
	}

	public int perform(int i, int j) {
		return service.add(i, j) * i;
	}

	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}

}
