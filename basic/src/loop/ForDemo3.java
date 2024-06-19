package loop;

public class ForDemo3 {
	public static void main(String[] args) {
		
		// 구구단 출력하기
		// 출력할 단을 입력받아서 구구단 출력하기
		// 예시
		// 3*1 = 3;
		// 3*2 = 6;
		// 3*3 = 9;
		// ...
		// 3*9 = 27;
		
		int dan = 3;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + " = " + (dan*i));
		}
		
	}

}
