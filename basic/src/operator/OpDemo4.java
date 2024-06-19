package operator;

public class OpDemo4 {
	
	public static void main(String[] args) {
		// 증감연산자
		// ++ --
		// * 증감연산자의 변수의 값을 1씩 증가 혹은 감소시킨다.
		// * 증감연산자는 단항연산자다.
		// * 증감연산자는 변수에만 사용할 수 있다.
		//		++10;	<== 오류
		// * 증감연산자는 변수 앞에 혹은 변수 뒤에 적을 수 있다.
		//		++a;	a++;
		
		int a =10;
		a++;
		a++;
		++a;
		++a;
		System.out.println(a);
		
		int num1 = 3;
		int num2 = 3;
		
		int x = ++num1;	// num1의 값을 1 증가시킨 후 x에 대입한다.
		int y = num2++;	// num2의 값을 y에 대입한 후 y를 1 증가시킨다.
		
		System.out.println("num1의 값: " + num1);
		System.out.println("num1의 값: " + num2);
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		
	}

}
