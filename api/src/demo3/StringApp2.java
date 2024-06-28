package demo3;

public class StringApp2 {
	
	public static void main(String[] args) {
		/*
		 * boolean equals(Object obj)
		 * - 문자열의 동등성을 비교하는 메소드다.
		 * - String 객체가 서로 달라도 문자열의 내용이 일치하면
		 * 	 true를 반환한다.\
		 * - Object의 equals(Object obj)를 재정의한 것이다.
		 * 
		 * boolean equalsIgnoreCase(String anotherString)
		 * - 문자열의 동등성을 비교하는 메소드다.
		 * - 단, 대소문자가 구분하지 않고 비교한다.
		 * 	 a와 A를 같은 글자로 취급한다.
		 */
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// 동일성 비교
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		// 동등성 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
		// !! 문자열의 비교는 언제나 반드시 무조건 equals() 메소드를 사용하자 !!
		
		// 문자열 리터럴 방식은 String 객체를 String Contant Pool에 생성한다.
		// 문자열 리터럴 방식은 동일한 문자열이 이미 존재하면 새로 String 객체를 생성하지 않고
		// 기존 String 객체를 참조한다.
		
		System.out.println();
		
		String str5 = "HELLO";
		String str6 = "hello";
		
		System.out.println(str5.equals(str6));				// false
		System.out.println(str5.equalsIgnoreCase(str6));	// true
		
	}

}
