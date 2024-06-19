package control;

public class IfDemo7 {
	public static void main(String[] args) {
		
		// 학점 계산하기
		// 90점 이상: A, 80점 이상: B, 70점 이상: C, 60점 이상: D, 그 외: F
		int average = 95;
		
		// 추천
		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 80) {
			System.out.println("B");
		} else if (average >= 70) {
			System.out.println("C");
		} else if (average >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		// 추천하지 않음
		if (average >= 90) {
			System.out.println("A");
		}
		if (average < 90 && average >= 80) {
			System.out.println("B");
		}
		if (average < 80 && average >= 70) {
			System.out.println("C");
		}
		if (average < 70 && average >= 60) {
			System.out.println("D");
		}
		if (average < 60) {
			System.out.println("F");
		}
		
		/*
		 * 특정 데이터에 대해서 체크할 조건이 여러 개인 경우
		 * if ~ else if ~ else if 구문을 사용하자.
		 * 
		 * if 구문으로 분리된 조건들은 매번 모든 조건을 체크한다.
		 * 
		 * if ~ else if 구문은 true로 판정되는 조건이 발견되면
		 * 이후의 모든 조건은 무시한다.
		 * 
		 * 코드 실행 성능이 개선된다.
		 */
		
	}

}
