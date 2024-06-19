package var;

public class VarDemo6 {
	public static void main(String[] args) {
		
		// 자바의 Boolean형 타입
		
		/*
		 * Boolean형 타입의 변수: 오직 true, false 2가지 값만 사용
		 * => 프로그램 실행과정에서 오직 2가지 상태만을 가지는 값을 다룰 때 사용
		 * e.g. 합격 여부 다룰 때
		 * 			- 합격한 경우: boolean passed = true;
		 * 			- 불합격한 경우: boolean passed = false;
		 * 		무상 수리 여부
		 *  		- 무상 수리인 경우: boolean isFree = true;
		 * 			- 불가능한 경우: boolean isFree = false;
		 */
		
		boolean isPassed = false;
		boolean isMarried = true;
		boolean isDeleted = false;
		boolean hasElements = true;
		
		System.out.println(isPassed);
		System.out.println(isMarried);
		System.out.println(isDeleted);
		System.out.println(hasElements);

		
	}

}
