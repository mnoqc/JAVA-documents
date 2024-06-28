package demo5;

public class WrapperApp5 {
	
	public static void main(String[] args) {
		
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		
		/*
		 * == 연산자와 equals() 메소드 
		 * (동일성 비교) == 연산자의 Wrapper 객체의 주소값을 비교한다. 
		 * (동등성 비교) equals() 메소드는 Wrapper 객체에 저장된 기본자료형값을 비교한다.
		 * 모든 Wrapper 클래스는 Object 의 메소드를 재정의하고 있다.
		 * 	String toString()
		 * 		Wrapper객체에 저장된 기본자료형 값을 문자열로 반환한다.
		 * 	int hashCode()
		 * 		Wrapper객체에 저장된 기본자료형 값이 같으면
		 * 		같은 해시코드값을 반환한다.
		 * 	boolean equals(Object obj)
		 * 		Wrapper객체에 저장된 기본자료형 값이 같으면
		 * 		true 를 반환한다. (동등성 비교하도록 재정의됨)
		 */
		
		System.out.println(x == y);			// false
		System.out.println(x.equals(y));	// true
		
		Integer a = new Integer(10);
		int b = 10;
		
		// Wrapper 객체가 자동언박싱되어서 10 == 10이 비교되었다.
		System.out.println(a == b);			// true
	}

}
