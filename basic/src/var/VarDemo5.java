package var;

public class VarDemo5 {
	public static void main(String[] args) {
		
		/*
		 * 좋은 변수명:
		 * 	변수에 저장된 값 잘 드러내는 이름
		 */
		
		int korScore = 100;
		int engScore = 80;
		int mathScore= 90;
		
		int totalScore = korScore + mathScore + engScore;
		double scoreAverage = totalScore/3;
		
		System.out.println(totalScore);
		System.out.println(scoreAverage);
		
		
	}
}

