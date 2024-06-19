package operator;

public class OpDemo2 {
	public static void main(String[] args) {
		
		// 로또번호 뽑아내기
		// 1. 시스템의 현재 유닉스타임값을 조회한다.
		//		long unixTime = System.currentTimeMillis();
		// 		* 유닉스타임값은 long타입의 정수다.
		// 2. 유닉스타임값을 6으로 나눈 나머지를 구한다.
		// 		unixTime%6;
		//		* 계산결과는 0L, 1L, 2L, 3L, 4L, 5L 중 하나다.
		// 3. 계산결과로 획득된 값을 int 타입으로 형변환시킨다.
		//		(int)(unixTime%6)
		//		* (int)0L --> 0
		
		long unixTime = System.currentTimeMillis();
		System.out.println("유닉스시간: " + unixTime);
		
		int diceNumber = (int)(unixTime%6) + 1;
		System.out.println("주사위 숫자: " + diceNumber);
		
		int lottoNumber = (int)(unixTime%45) + 1;
		System.out.println("로또 번호: " + lottoNumber);
	}

}
