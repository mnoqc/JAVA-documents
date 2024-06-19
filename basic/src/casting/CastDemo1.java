package casting;

public class CastDemo1 {
	public static void main(String[] args) {
		
		// 자동 형변환: 자바가 값의 타입을 자동으로 변환하는 것
		
		// 정수(int) -> 실수(double)
		// 크기 작은 타입에서 큰 타입으로 변환
		// 정밀도 더 높은 타입으로 변환
		double a =10;	// double a = 10; int = 4byte
					 	// double a = 10.0; double = 8byte
		
		// 정수(int) -> 실수(float)
		// 정밀도 더 높은 타입으로 변환
		float b = 10;
		
		System.out.println(a);
		System.out.println(b);
		
		// 수동 형변환: 개발자가 어떤 타입으로 변환할 것인지
		//				의도로써 드러내는 것
		//				(타입)값;		-> 값의 타입이 지정한 타입으로 변환된다.
		//				(타입)변수명;	-> 변수명을 조회한 값이 지정한 타입으로 변환된다.
		
		int c = (int)3.14;
		System.out.println(c);
		
		System.out.println(2.0/10);
		
		int x = 2;
		int y = 10;
		System.out.println((double)x/y);
		
	}

}
