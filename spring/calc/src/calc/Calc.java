package calc;

public class Calc {
	//member varible
	private double number1;
	private double number2;
	private String math; 
	private double total;
	
	//constructers
	public Calc() {
		
	}
	//methods
	public void doMath() {
		if(this.getMath() == "+") {
			this.total = this.getNumber1() + this.getNumber2();
		}
		else if (this.getMath() == "-") {
			this.total = this.getNumber1() - this.getNumber2();
		}
		else if (this.getMath() == "*") {
			this.total = (this.getNumber1() * this.getNumber2());
		}
	}

	//getters and setters
	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
