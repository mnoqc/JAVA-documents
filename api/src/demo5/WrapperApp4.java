package demo5;

public class WrapperApp4 {
	
	public static void main(String[] args) {
		/*
		 * 자동언박싱 
		 * - 기본자료형 타입의 변수에 Wrapper 객체를 대입하면
		 * 자동으로 Wrapper 객체에 저장된 기본자료형 값이 변수에 대입되는 것이다.
		 * 
		 *  Integer a = new Integer(10) // 박싱
		 */
		
		// 박싱
		Integer a = new Integer(10);
		double b = new Double(3.14);
		
		// 자동언박싱
		int x = a;		// int x = a.intValue();
		double y = b;	// doble y = b.doubleValue();
		
		// 사칙연산에서의 자동언박싱
		Integer num1 = new Integer(1000);
		Integer num2 = new Integer(2000);
		
		/*
		 * 사칙연산에 Wrapper 객체가 참여하면 자동언박싱이 실행된다.
		 * Wrapper 객체에 저장된 기본자료형값을 꺼내서 사칙연산에 사용한다.
		 */
		int num3 = num1 + num2;
		System.out.println(num3);
	}

}
