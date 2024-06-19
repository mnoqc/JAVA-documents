package demo2;

public class CalculatorApp {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		Calculator c = new Calculator();
		
		int x = c.plus1(10, 30);
		System.out.println("반환받은 값: " + x);
		
		int y = c.plus1(103005, 324512);
		System.out.println("반환받은 값: " + y);
		
		double result1 = c.divide(100, 23);
		System.out.println("반환받은 값: " + result1);
		
		System.out.println(c.divide(10, 5));
		//System.out.println(s.test1());		// 컴파일 오류
		//System.out.println(s.test2(10));		// 컴파일 오류
		//System.out.println(s.test3(10, 4));	// 컴파일 오류
	}

}
