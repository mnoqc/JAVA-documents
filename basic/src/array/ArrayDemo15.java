package array;

public class ArrayDemo15 {
	public static void main(String[] args) {
		
		// 배열에 저장된 값의 평균과 가장 가까운 값 찾기
		
		// 학생들의 시험 점수가 저장된 배열이 있다.
		// 시험 점수의 평균을 계산했을 때,
		// 평균 점수와 가장 근접한 점수를 계산하자.
		// 평균점수, 평균점수와 가장 근접한 점수, 점수가 저장된 인덱스를 출력하자.
		
		int[] scores = {80, 60, 70, 85, 100, 75};
		
		/*
		 * 1. 변수를 선언한다.
		 * 		평균점수, 근접점수, 저장위치, 최소갭
		 * 2. 평균점수를 계산한다.
		 * 3. 최소갭, 근접점수, 저장위치를 계사한다.
		 * 4. 계산된 정보를 출력한다.
		 */
		
		// 1. 변수 선언
		double average = 0.0;	// 평균점수
		double minGap = 100.0;	// 최소간격
		int nearestScore = 0;	// 최근접 점수
		int savedIndex = 0;		// 최근접 점수 저장위치
		
		
		// 2. 평균 점수 계산하기
		int total = 0;
		for (int score : scores) {
			total += score;
		}
		average = (double)total/scores.length;
		System.out.println("평균점수: " + average);
		
		// 3. 최소간격, 최근접 점수, 저장위치 계산하기
		for (int i = 0; i < scores.length; i++) {
			int value = scores[i];
			double gap = Math.abs(average - value);
			if (gap < minGap) {
				minGap = gap;
				nearestScore = value;
				savedIndex = i;
			}
			
		}
		
		System.out.println("최소간격: " + minGap);
		System.out.println("최근접 점수: " + nearestScore);
		System.out.println("저장위치: " + savedIndex);
		

	}

}
