package demo5;

public class WrapperApp3 {
	
	public static void main(String[] args) {
		
		/*
		 * 자동박싱
		 * - 변수의 타입이 Wrapper 클래스 타입이면
		 *   자동으로 기본자료형값을 가지고 있는
		 * 	 Wrapper 객체를 생성하고, 그 객체의 주소값을
		 *	 변수에 대입한다. 
		 */
		
		/*
		 * Integer a =10;
		 * 1. a 변수의 타입이 Integer 타입이다.
		 *	 (기본자료형 타입이 아니다. 오토박싱이 필요한 상황)
		 * 2. 10을 저장하는 Integer 객체를 생성한다.
		 * 3. 생성한 Integer 객체의 주소값을 a 에 대입한다.
		 * 4. a 는 Integer 객체를 참조한다.
		 *  
		 */ 
		Integer a = 10;				// Integer a = new Integer(10);
		Double b = 3.14;			// Double b = new Double(3.14);
		Long c = 1000000000000L;	// Long c = new Long(1000000000000L);
		
		/*
		 * Object x = 10;
		 * 1. x 변수의 타입이 Integer 타입이다.
		 * 	 (Object 는 모든 객체를 담을 수 있는 타입이다.
		 * 	  즉, Integer 객체를 생성하면 문제가 없는 상황이다. 오토박싱 필요)
		 * 2. 10을 저장하는 Integer 객체를 생성한다.
		 * 3. 생성한 Integer 객체의 주소값을 x 에 대입하려고 했더니
		 * 	  클래스형변환이 발생해서 Integer 객체를 생성할 때
		 * 	  함께 생성된 Object 객체의 주소값을 x 에 대입한다.
		 * 4. x 는 Object 객체를 참조한다.
		 */
		Object x = 10;				// Integer x = new Integer(10);
		Object y = 3.14;			// Double y = new Double(3.14);
		Object z = 1000000000000L;	// Long z = new Long(1000000000000L);
		
		// x 가 참조하는 Object 객체의 toString() 메소드를 호출한다.
		// 그러나, Integer 객체에 toString()이 재정의되어 있기 때문에
		// 실제로 실행되는 것은 Integer 객체의 toString() 반환값이 출력된다.
		System.out.println(x);	// "10"
		System.out.println(y);	// "3.14"
		System.out.println(z);	// "1000000000000"
		
	}
	
}
