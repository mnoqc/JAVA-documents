package casting;

public class CastDemo2 {
	public static void main(String[] args) {
		
		// 정수와 문자간의 형변환
		int num1 = 'A';
		System.out.println(num1);
		
		int num2 = '가';
		System.out.println(num2);
		
		// 오류 발생
		// "가"는 String 객체로 표현된다.
		// String 객체는 속성과 기능을 모두 포함하는 복잡한 구조이다.
		// 따라서, String 객체를 정수로 변환할 수 없다.
		// int num3 = "가";
		// System.out.println(num3);
		
		char ch1 = 65;
		char ch2 = 1000;
		System.out.println(ch1);
		System.out.println(ch2);
		
	}

}
