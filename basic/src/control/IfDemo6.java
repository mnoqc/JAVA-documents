package control;

public class IfDemo6 {
	public static void main(String[] args) {
		
		/* 내포된 if문 
		 * 
		 *  if (조건식1) {
		 *  		수행문1;
		 *  		if (조건식2) {
		 *  		수행문2;
		 *  	} else {
		 *  		수행문3;
		 *  	}
		 *  }
		 *  
		 * if (조건식1) {
		 * 		수행문1;
		 * } else {
		 * 		수행문2;
		 * 		if (조건식2) {
		 * 			수행문3;
		 * 		}
		 * }
		 * 
		 * 내포된 if문은 조건이 다른 조건에 종속되어 있을 때 사용한다.
		 * 
		 */
		
		// 국어, 영어, 수학 점수로 평균을 계산하기
		// 평균이 60점 이상이면 "합격입니다."를 출력한다.
		// 그 외는 "불합격입니다."를 출력한다.
		// 만약 (합격자 중에서) 평균이 95점 이상이면 
		// "장학금 지급 대상입니다."를 출력한다.
		int korScore = 80;
		int engScore = 100;
		int mathScore = 100;
		
		int average = (korScore + engScore + mathScore)/3;
		
		if (average >= 60) {
			System.out.println("합격입니다.");
			if (average >= 95) {
				System.out.println("장학금 지급 대상입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

}
