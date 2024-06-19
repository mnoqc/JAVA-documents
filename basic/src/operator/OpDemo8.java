package operator;

public class OpDemo8 {
	public static void main(String[] args) {
		
		// 삼항연산자(조건연산자)
		//		조건식 ? 값1 : 값2;
		//		- 조건식이 true로 판정되면 최종 결과는 값1이다.
		//		- 조건식이 false로 판정되면 최종 결과는 값2다.
		//		- 값1과 값2는 같은 타입이어야 한다.
		//		- 아래와 같이 형변환 가능하다면 값1과 값2는 타입이 달라도 된다.
		//				double x = 조건식 ? 10 : 3.14;	// 정상
		//				double x = 1;
		//				double x = 0.5;
		
		// 				int y = 조건식 ? 10 : 3.14; 	// 컴파일 오류 발생	
		//				int y = 1;
		//				int y = 0.5;	// 형변환 시 데이터 손실 발생
		
		//	배송비 유료/무료 안내하기
		//	주문 금액이 3만원 이상이면 배송비 무료, 미만은 배송비 유료
		
		int orderPrice = 15000;
		
		String message = orderPrice >= 30000 ? "배송비 무료" : "배송비 부담";
		int delivery = orderPrice >= 30000 ? 0 : 2500;
		
		System.out.println("주문 금액: " + 15000);
		System.out.println("배송비: " + delivery);
		System.out.println("결제 금액: " + (orderPrice + delivery));

		
	}

}
