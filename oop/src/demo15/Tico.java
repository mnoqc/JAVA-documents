package demo15;

/*
 * Tico 구현클래스는 Car 인터페이스를 구현하는 클래스다.
 * Tico 구현클래스는 Car 인터페이스에 정의된 모든 추상메소드를 구현한다.
 *  
 */
public class Tico implements Car {

	@Override
	public void drive() {
		System.out.println("Tico의 drive() 실행");
		
	}

	@Override
	public void stop() {
		System.out.println("Tico의 stop() 실행");
		
	}

	@Override
	public void speedUp() {
		System.out.println("Tico의 speedUp() 실행");
		
	}

	@Override
	public void speedDown() {
		System.out.println("Tico의 speedDown() 실행");
		
	}
	
	

}
