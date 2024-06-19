package operator;

public class OpDemo6 {
	public static void main(String[] args) {
		// 논리연산자
		// && || !
		// 논리 연산자는 2개 이상의 검사조건을 결합해서 결과를 판정할 때 사용되는 연산자다.
		// &&
		//		논리곱연산자
		//		모든 검사 조건이 true일 때만 true로 판정한다.
		// ||
		//		논리합연산자
		//		제시된 검사 조건 중 하나라도 true가 있으면 true로 판정
		
		/*
		 * 국어, 영어, 수학 시험 과목의 과락 여부를 판정하기
		 * 과목에 상관없이 한 과목이라도 40점 미만을 받으면 과락이다.
		 */
		
		int korScore = 60;
		int engScore = 30;
		int mathScore = 45;
		boolean fail = korScore < 40 || engScore < 40 || mathScore < 40;
		
		System.out.println("과락 여부: " + fail);
		
		/*
		 * 무상 수리 여부를 판정하기
		 * 사용 기간이 3년 미만이고, 운행 거리가 5만km 이하일 때만 무상으로 수리한다.
		 */
		
		int usedYear = 2;
		int drivingDistance = 35000;
		boolean isFree = usedYear < 3 && drivingDistance <= 50000;
		System.out.println("무상 수리 여부: " + isFree);
		
		/*
		 * 시험 합격 여부 판정하기 
		 * 데이터베이스, 운영체제, 알고리즘 시험에 대한 합격 여부를 판정하기
		 * 한 과목이라도 40점 미만이면 과락으로 불합격 판정한다.
		 * 평균 점수가 60점 미만이어도 불합격으로 판정한다.
		 */
		
		int db = 40;
		int os = 70;
		int al = 100;
		
		boolean 과락여부 = db < 40 || os < 40 || al < 40;
		
		int average = (db + os + al)/3;
		boolean 평균점수미달여부 = average < 60;
		
		boolean 불합격여부 = 과락여부 || 평균점수미달여부;
		System.out.println("합격 여부: " + !불합격여부);
		
		
	}

}
