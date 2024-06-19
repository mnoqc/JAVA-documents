package array;

public class ArrayDemo6 {
	
	public static void main(String[] args) {
		
		// 배열의 활용
		
		// 학생의 시험점수를 저장하고, 총점과 평균을 계산하기
		// * 학생은 한 번에 여러 과목의 시험을 본다.
		// * 국어: 100, 영어: 80, 수학: 70, 윤리: 100, 국사: 80
		
		// 배열객체를 생성하면 하나의 이름으로 여러 개의 값을 관리할 수 있다.
		int[] scores = {100, 80, 70, 100, 80};
		
		int total = 0;
		// 반복문을 사용해서 배열에 저장된 값들을 반복처리할 수 있다.
//		for (int i = 0; i < scores.length; i++) {
//			total += scores[i];
//		}
		
		for (int value : scores) { // 조회 전용
			total += value;
		}
		
		System.out.println("총점: " + total);
		
		int average = total/scores.length;
		System.out.println("평균: " + average); 
		
	}

}
