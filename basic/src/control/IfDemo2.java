package control;

public class IfDemo2 {
	public static void main(String[] args) {
		/*
		 * if (조건식) {
		 * 		조건식이 true로 판정될 때 실행되는 수행문;
		 * 		조건식이 true로 판정될 때 실행되는 수행문;
		 * } else {
		 * 		조건식이 false로 판정될 때 실행되는 수행문;
		 * 		조건식이 false로 판정될 때 실행되는 수행문;
		 * }
		 */
		
		// 국어, 영어, 수학 점수를 입력받아서
		// 평균이 60점 이상이면 "합격입니다"를 출력하고,
		// 그 외는 "불합격입니다"를 출력한다.
		
		int korScore = 70;
		int engScore = 80;
		int mathScore = 80;
		
		int average = (korScore + engScore + mathScore)/3;
		
		if (average >= 60) {
		System.out.println("합격입니다.");
		} else {
		System.out.println("불합격입니다.");
		}
		
		
		
	}

}
