package demo7;

public class Sample1App {
	
	public static void main(String[] args) {
		
		// Sample1에 정의된 정적변수 사용하기
		/*
		 * 1. Sample1.class 파일을 메모리 영역에 로딩한다.
		 * 2. Sample1.class 파일에 정의된 정적변수, 정적메소드를
		 * 	  즉시 사용 가능한 상태로 만든다.
		 * 	  즉, 메모리 영역에 정적변수 y를 생성하고 0으로 초기화한다.
		 * 3. 정적변수 y의 값을 이제 출력한다.
		 */
		// 정적변수의 초기값 출력해보기
		System.out.println(Sample1.y);
		
		// 정적변수의 값 변경하기
		Sample1.y = 100;
		
		// 변경된 정적변수의 값 출력하기
		System.out.println(Sample1.y);
	}

}
