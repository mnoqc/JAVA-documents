package loop;

public class ForDemo1 {
	public static void main(String[] args) {
		
		// 1~10까지 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 1~10 사이의 정수 중에서 짝수만 출력하기
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0)
			System.out.println(i);
		}
	
	System.out.println();
	
	// 1~10의 모든 정수의 합계를 계산해서 출력하기
	int total = 0;
	
//	total += 1;
//	total += 2;
//	total += 3;
//	total += 4;
//	total += 5;
//	total += 6;
//	total += 7;
//	total += 8;
//	total += 9;
//	total += 10;
	
	for (int i =1; i <= 10; i++) {
		total += i;
	}
	
	System.out.println("합계: " + total);
	
	}
	
}
