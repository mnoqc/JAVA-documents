package control;

public class IfDemo5 {
	public static void main(String[] args) {
		
		// 구매금액에 따른 배송비 계산하기
		// 30000원 미만은 배송비 2500원을 추가한다.
		
		int orderPrice = 10000;
		int deliveryPay; // 변수 생성할 때 초기값이 저장되지 않았다면
						 // 변수에 값이 저장되지 않는 경우가 존재하면 안 된다.
		
		if (orderPrice < 30000) {
			deliveryPay = 2500;
		} else {
			deliveryPay = 0;
		}
		
		System.out.println("주문금액: " + orderPrice);
		System.out.println("배송비: " + deliveryPay);
		System.out.println("결제금액: " + (orderPrice + deliveryPay));
	}

}
