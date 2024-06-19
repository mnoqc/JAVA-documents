package control;

public class IfDemo3 {
	
	/* if (조건식1) {
	* 		조건식1이 true로 판정되면 실행되는 수행문1
	* } else if (조건식2) {
	*  		조건식2가 true로 판정되면 실행되는 수행문2
	* } else if (조건식3) {
	* 	  	조건식3이 true로 판정되면 실행되는 수행문3
	* } else if (조건식4) {
	* 	  	조건식4가 true로 판정되면 실행되는 수행문4
	* } else {
	* 		조건식1~4  모두 false로 판정되면 실행되는 수행문5
	* }
	* 		조건식1이 true로 판정되면 수행문1만 실행하고,
	* 		나머지는 무시한다.
	*/
	
	// 고객의 등급에 따라서 포인트 지급하기
	// 등급		포인트
	// 1		구매금액의 10%
	// 2		구매금액의 7%
	// 3		구매금액의 3%
	// 그 외	구매금액의 0.5%
	
	public static void main(String[] args) {
		
		int grade = 1;
		int orderPrice = 100000;
		int point = 0;
	
		if (grade == 1) {
			point = (int)(orderPrice*0.1);
		} else if (grade == 2) {
			point = (int)(orderPrice*0.07);	
		} else if (grade == 3) {
			point = (int)(orderPrice*0.03);			
		} else {
			point = (int)(orderPrice*0.005);
		}
		
		System.out.println("고객등급: " + grade);
		System.out.println("구매금액: " + orderPrice);
		System.out.println("포인트: " + point);
	}
	
	
}

