package array;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		
		// 배열 객체 생성하기
		// 	배열 객체를 생성하면 배열의 각 요소에는
		// 	해당 자료형의 기본값이 저장되어 있다.
		// 	byte, short, int, long	-> 0
		//  float, double			-> 0.0
		//	char					-> '\u0000' <-- 유니코드 0번째 문자 
		// 	boolean					-> false
		//	그 외					-> null	
		
		/*
		 * 배열 객체 생성하기
		 * 		타입[] 변수명 = new 타입[크기];
		 * 		* 해당 타입의 기본값으로 채워진 배열 객체가 생성된다.
		 * 
		 * 		타입[] 변수명 = {값, 값, 값, 값, ...};
		 * 		* 지정된 값의 갯수만큼의 크기를 가진 배열이 생성된다.
		 * 		* 지정된 값들이 순서대로 채워져 있다.
		 */
		
		// 1. 정수 5개 담는 배열 객체를 생성해서 참조하기
		int[] x = new int[5];
				
		// 2. 문자열 3개 담는 배열 객체 생성해서 참조하기
		double[] y = new double[3];
		
		System.out.println(x);
		System.out.println(y);
		
		// 3. 지정된 값으로 채워진 배열 객체를 생성해서 참조하기
		int[] a = {10, 20, 13, 45, 67};
		String[] b = {"김수영", "최유리", "예빛", "백예린", "이제"};
		
		// 배열의 각 요소에 저장된 값을 출력해보기
		
		// a 변수가 참조하는 배열 객체의 0번째 요소에 저장된 값 출력하기
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println();

		for (int i = 0; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		/*
		 * Enhanced-for : 배열이나 콜렉션에 저장된 값을 
		 * 				  처음부터 끝까지 반복 처리할 수 있게 도와 준다. 
		 * 				- 형식: for (타입 변수명1 : 변수명2) {
		 * 							수행문;
		 * 		 				}
		 * 						변수명2: 배열 객체 참조하고 있는 변수명
		 * 						= 반복 처리할 대상이 되는 배열 객체를 참조하는 변수명
		 * 						타입: 배열 객체의 각 요소에 저장된 값과 일치하는 타입을 적는다.
		 * 						변수명1: 배열 객체에서 하나씩 꺼낸 값이 저장되는 그릇의 이름이다.
		 */
		
		for (int value : a) {
			System.out.println(value);
			
		}
		
		System.out.println();
		
		for (String kk : b) {
			System.out.println(kk);
		}
		

	}

}
