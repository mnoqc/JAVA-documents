package control;

public class SwitchDemo1 {
	public static void main(String[] args) {
		/*
		 * switch (변수) {
		 * 		case 값1:
		 * 			수행문;
		 * 			break;
		 * 		case 값2:
		 * 			수행문;
		 * 			break;
		 * 		case 값3:
		 * 			수행문;
		 * 			break;
		 * 		default:
		 * 			수행문;
		 * } 
		 * 
		 * 지정된 변수의 값이 case에 제시된 값과 일치하는 경우
		 * 해당 수행문이 실행된다.
		 * default에 정의된 수행문은 변수의 값과 일치하는 case가
		 * 없을 때 실행된다.
		 * break는 해당 case의 수행문을 실행하고 switch 구문을 탈출하게 한다.
		 * 
		 */
		
		 int num1 = 10;
		 int num2 = 5;
		 
		 String operator = "+";
		 
		 switch (operator) {
		 case "+":
			 System.out.println(num1 + num2);
			 break;
		 case "-":
			 System.out.println(num1 - num2);
			 break;
		 case "*":
			 System.out.println(num1*num2);
			 break;
		 case "/":
			 System.out.println(num1/num2);
			 break;
		 default:
			System.out.println("유효한 연산자가 아닙니다.");
		 }
		
	}

}
