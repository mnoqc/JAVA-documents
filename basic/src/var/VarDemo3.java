package var;

public class VarDemo3 {
	public static void main(String[] args) {
		
		/*
		 * 실수가 포함된 연산 
		 * - 실수가 포함된 연산 결과는 실제 연산 결과와 다른 값이 나올 수 있다.
		 * - 실수가 포함된 연산을 할 떄는 실수값에 10, 100, 1000, ...과
		 * 	 같은 값을 곱해서 소숫점부분을 0으로 만든 다음에 계산하고,
		 * 	 곱한 값만큼 나누어서 값을 획득한다.
		 */
		
		double a = 0.1;
		double b = 0.2;
		
		double c = a + b;
		System.out.println(c); // 계산 결과 =/= 0.3
		
		double d = (a*10 + b*10)/10;
		System.out.println(d); // 계산 결과 == 0.3
	}

}
