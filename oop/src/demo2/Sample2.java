package demo2;

public class Sample2 {
	
	// 매개변수 타입 또는 개수 다르면 메소드명 중복정의 가능
	// 목표: 비슷한 작업은 일관된 이름으로
	public void plus(int x, int y) {
		System.out.println("정수 + 정수 실행됨");	
	}
	
	public void plus(int x, int y, int z) {
		System.out.println("정수 + 정수 + 정수 실행됨");
		
	}
	
	public void plus(double x, double y) {
		System.out.println("실수 + 실수 실행됨");
		
	}
	
	public void plus(double x, double y, double z) {
		System.out.println("실수 + 실수 + 실수 실행됨");
		
	}

}
