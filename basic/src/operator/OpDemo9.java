package operator;

public class OpDemo9 {
	public static void main(String[] args) {
		// 비트 연산자
		// & | ^ << >> >>>
		// 비트 연산자의 연산 대상은 숫자다.
		
		int num1 = 4;				// 0000 0100
		int num2 = 3;				// 0000 0011
		
		int result1 = num1 & num2;	// 0000 0000, 같은 위치에 모두 1일 때만 1이다.
		int result2 = num1 | num2;	// 0000 0111, 같은 위치에 1이 하나라도 있으면 1이다.
		int result3 = num1 ^ num2;	// 0000 0111, 같은 위치에 값이 서로 다르면 1이다.
		int result4 = num1 >> 2;	// 0000 0001, 오른쪽으로 2칸 이동시킨 값이다. (빈칸은 부호비트와 같은 값으로 채운다.)
		int result5 = num1 << 2;	// 0001 0000, 왼쪽으로 2칸 이동시킨 값이다. (빈칸은 0으로 채운다.)
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		int result6 = num1 >>> 2;
		System.out.println(result6);
	}

}
