package operator;

public class OpDemo5 {
	public static void main(String[] args) {
		// 비교연산자
		// > >= < <= == !=
		// * 비교연산자의 연산결과는 언제나 boolean 타입의 값이다.
		
		boolean result1 = 100 > 10;
		boolean result2 = 100 < 10;
		boolean result3 = 100 == 10;
		boolean result4 = 100 != 10;
		
		/*
		 * 프로그램은 업무 로직을 처리하는 작업이다. 
		 * 업무 로직은 다양한 조건에 대한 검사를 수행하고,
		 * 검사 결과가 true인지, false인지에 따라서 적절한 작업을 수행하는 것이다.
		 * 따라서, 프로그램에서 비교연산자는 특정한 작업을 수행하기 위한 조건에
		 * 맞는지 아닌지를 확인하기 위한 필수 연산이다.
		 */
		
		// 국어, 영어, 수학 점수를 입력받아서 합격 여부를 출력하기
		// 합격 기준: 평균 60점 이상, 과목 과락은 없음
		
		int korScore = 70;
		int engScore = 80;
		int mathScore = 50;
		boolean isPassed;
		
		int average = (korScore + engScore + mathScore)/3;
		isPassed = average >= 60;
		
		System.out.println("합격 여부: " + isPassed);
	}

}
