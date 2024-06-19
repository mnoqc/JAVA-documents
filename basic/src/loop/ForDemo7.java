package loop;

public class ForDemo7 {
	public static void main(String[] args) {
		// 중첩된 for문
		/*
		 * for (int i = 1; i <= 2; i++) {
		 * 		수행문1;
		 * 		for (int j = 1; j <= 3; j++) {
		 * 			수행문2;
		 * 		}
		 * }
		 * 수행문1: 2번 실행된다.
		 * 수행문2: 6번 실행된다.
		 * 중첩된 for문의 수행문2는 
		 * (바깥쪽 for문의 반복 횟수 X 안쪽 for문의 반복 횟수)만큼 실행된다.
		 */
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("수행문1: i=" + i);
			for (int j = 1; j <= 3; j++) {
				System.out.println("수행문2: i="+ i + ", j=" + j);
			}
		}
		
	}

}
