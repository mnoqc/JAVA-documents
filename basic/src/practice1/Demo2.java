package practice1;

public class Demo2 {
	public static void main(String[] args) {
		
		/*
		 * 정수 2개를 입력받아서 각각의 변수에 저장하고,
		 * 변수에 저장된 값을 서로 교환해서 출력하시오.
		 */
		
		int a = 10;
		int b = 20;
		
		//변수에 저장된 값 서로 교환하는 코드 작성
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a); // 20이 출력
		System.out.println(b); // 10이 출력
	}

}
