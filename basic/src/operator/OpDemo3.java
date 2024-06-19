package operator;

public class OpDemo3 {
	public static void main(String[] args) {
		// 대입 연산자
		// = += -= *= /= %=
		// * 우항의 값을 좌항의 변수에 대입시킨다.
		// * 연산자 중에서 우선순위가 가장 낮은 연산자다.
		
		int num1 = 10;
		
		num1 = num1 + 10;
		System.out.println(num1);

		num1 = num1 + 10;
		System.out.println(num1);
		
		num1 = num1 + 10;
		System.out.println(num1);
		
		num1 += 10; // num1 = num1 +10과 동일한 연산이다.
		num1 += 10;
		num1 += 10;
		System.out.println(num1);
		
		int num2 = 100;
		num2 -= 3;
		num2 -= 3;
		num2 -= 3;
		System.out.println(num2);
		
	}

}
