package loop;

public class ForDemo10 {
	public static void main(String[] args) {
		
		// 임의의 정수를 입력받아서
		// 해당 정수의 모든 약수를 출력하기
		int num = 100;
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				System.out.println(i);
			}
			
		}

	}

}
