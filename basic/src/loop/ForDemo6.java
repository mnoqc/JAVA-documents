package loop;

public class ForDemo6 {
	public static void main(String[] args) {
		
		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				// continue가 실행되면
				// System.out.println(i) 수행문을 실행하지 않고,
				// 증감식으로 이동해서 다음 번 반복을 수행한다.
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		// 위의 continue를 사용한 코드는 아래와 같이
		// 조건을 다르게 작성해서 같은 실행결과가 나오게 할 수 있다.
		for (int i = 1; i <= 10; i++) {
			if (i != 6) {
				System.out.println(i);
			}
		}
	}

}
