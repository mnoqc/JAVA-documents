package control;

public class IfDemo4 {
	public static void main(String[] args) {
		/*
		 * 고객 등급과 구매 금액에 따른 포인트 및 배송비, 최종 결제 금액 계산하기
		 * 포인트 지급 조건:
		 * 	등급		포인트
		 *  1		구매금액의 10%
		 *  2		구매금액의 7%
		 *  3		구매금액의 3%
		 *  그 외	구매금액의 0.5%
		 *  
		 *  배송비 계산 조건:
		 *  30000원 미만	2500원
		 *  그 외			0원
		 */
		
		int grade = 1;
		int orderPrice = 100000;
		int point = 0;
		int deliveryPay = 0;
		
		if (grade == 1) {
			point = (int)(orderPrice*0.1);
		} else if (grade == 2) {
			point = (int)(orderPrice*0.07);
		} else if (grade == 3) {
			point = (int)(orderPrice*0.03);
		} else {
			point = (int)(orderPrice*0.005);
		}
		
		// 구매 금액에 따른 배송비 계산하기
		if (orderPrice < 30000) {
			deliveryPay = 2500;
		}
		
		System.out.println("고객등급: " + grade);
		System.out.println("구매금액: " + orderPrice);
		System.out.println("포인트: " + point);
		System.out.println("배송비: " + deliveryPay);
		System.out.println("결제금액: " + (orderPrice + deliveryPay));
	}

}
