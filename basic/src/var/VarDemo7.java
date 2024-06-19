package var;

import java.util.Date;

public class VarDemo7 {
	public static void main(String[] args) {
	
		// 문자열
		
		/*
		 * 문자열이란? 
		 * 		- 문자열은 한 글자 이상의 문자로 구성된다.
		 * 		- 문자열은 String 객체로 표현된다.
		 * 		- 문자열 리터럴은 " "로 표시한다.
		 * 			e.g. 'A': 문자 / "A", "ABC", "A B C", "": 문자열
		 * 		- 문자열은 빈문자열, 공백문자, 탭문자 등을 포함할 수 있다
		 * 		- 문자열을 생성하고 참조변수로 참조하기
		 * 			String  x = "홍길동";
		 * 			1. 문자열 "홍길동"을 표현하는 String 객체가 메모리의 힙 영역에 생성된다.
		 * 			2. 참조변수 x가 메모리의 스택 영역에 생성된다.
		 * 			3. 생성된 String 객체의 주소값이 참조변수 x에 대입된다.
		 * 			4. 참조변수 x가 String 객체를 참조한다.
		 * 			5. 참조변수 x를 사용해서 참조하는 String 객체의 공개된 기능을 사용할 수 있다.
		 */
		
		String str = "Hello, world";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.isEmpty());
		
		int number = 10;
		System.out.println(number);
		
		Date now = new Date();
		System.out.println(now.getTime());
		
	}
	
}
