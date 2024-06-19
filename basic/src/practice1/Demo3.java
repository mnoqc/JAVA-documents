package practice1;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * 학생의 성적을 계산하고 출력하기
		 * 학생이름, 국어점수, 영어점수, 수학점수를 입력받았다.
		 * 총점과 평균을 계산하고,
		 * 학생이름, 국어점수, 영어점수, 수학점수를 출력한다.
		 * 총점과 평균을 출력한다.
		 * 평균은 실수값이다.
		 */
		
		String name = "홍길동";
		int korScore = 100;
		int engScore = 80;
		int mathScore = 100;
		
		int totalScore = korScore + engScore + mathScore;
		// double averageScore = totalScore/3.0;  <-- 평균: 93.0
		double averageScore = totalScore/3.0; //  <-- 평균: 93.333...
		// double averageScore = (double))totalScore/3;  <-- 평균: 93.333...
		
		System.out.println("학생이름: " + name);
		System.out.println("국어점수: " + korScore);
		System.out.println("영어점수: " + engScore);
		System.out.println("수학점수: " + mathScore);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + averageScore);
		
	}

}
