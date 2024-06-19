package var;

public class VarDemo1 {
	public static void main(String[] args) {
		
		// 변수 생성 및 초기화
		
		/* 
		 * 변수의 생성
		 * 		자료형 변수명;
		 * 		int a;
		 * 		double b;
		 * 		char c;
		 * 
		 * 변수의 초기화
		 * 		변수에 값을 대입(저장)하는 것
		 * 
		 * 		변수명 = 값;
		 * 
		 * 		a = 10;
		 * 		b = 3.14;
		 * 		c = '가';
		 * 
		 * 변수에 저장된 값의 이용
		 * 		변수에 저장된 값은 변수명으로 이용한다.
		 * 
		 * 		변수 a에 저장된 값을 출력하기
		 *		System.out.println(a);
		 *
		 * 		변수 a에 저장된 값과 변수 b에 저장된 값을 더하기
		 *		System.out.println(a + b);
		 */ 
		
		// 정수 담는 변수 생성하기
		int a;
		// 변수 a 초기화하기
		a = 10;
		// 변수 a에 저장된 값 출력에 이용하기
		System.out.println(a);
		
		// 실수 담는 변수 생성하기
		double b;
		b = 3.14;
		System.out.println(b);
		
		// 문자 담는 변수 생성하기
		char c;
//		char c = '가'; 변수 다시 생성 후 값 저장하므로 오류 발생
		c = '가';
		System.out.println(c);
		
 	}

}
