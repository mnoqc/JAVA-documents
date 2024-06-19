package operator;

public class OpDemo1 {
	
	public static void main(String[] args) {
		// 산술 연산자
		// + - * / % 
		int num1 = 20;
		int num2 = 6;
		int num3 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1*num2 + num3);
		
		// 덧셈연산자
		// 기능: 더하기, 연결하기
		// 덧셈연산자의 좌항 혹은 우항에 문자열 있을 시 연결하기로 동작함
		// 연결하기 연산의 실행결과는 언제나 문자열임
		
		// 숫자 + 숫자				<-- 더하기 기능
		// 숫자 + "문자열"			<-- 연결하기 기능
		// "문자열" + 숫자			<-- 연결하기 기능
		// "문자열1" + "문자열2"	<-- 연결하기 기능
		
		System.out.println(10 + 20);			// "30"
		System.out.println(10 + "안녕");		// "10안녕"
		System.out.println("안녕" + 10 + 30);	// "안녕1030"
		System.out.println(10 + 30 + "안녕");	// "40안녕"
		
		
	}

}
