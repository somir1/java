package calc;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		
		calc.setNumber1(30);
		calc.setNumber2(10);
		calc.setMath("+");
		calc.doMath();
		System.out.println(calc.getTotal());
		
		System.out.println("==================");
		
		calc.setNumber1(300);
		calc.setNumber2(10);
		calc.setMath("-");
		calc.doMath();
		System.out.println(calc.getTotal());
		
		System.out.println("==================");
		
		calc.setNumber1(300);
		calc.setNumber2(10);
		calc.setMath("*");
		calc.doMath();
		System.out.println(calc.getTotal());
	}

}
