package demo3;

public class StringApp7 {
	
	public static void main(String[] args) {
		/*
		 * String String.valueOf(값)
		 * 지정된 다양한 값을 문자열로 변환해서 반환한다.
		 */
		
		// 10 -> "10"
		String value1 = String.valueOf(10);
		// 3.14 -> "3.14"
		String value2 = String.valueOf(3.14);
		// {'a', 'b', 'c'} -> "abc"
		String value3 = String.valueOf(new char[] {'a', 'b', 'c'});
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
