package demo14;

public class PhoneApp {

	public static void main(String[] args) {
		
		// SmartPhone객체를 생성해서 Phone타입의 참조변수로 참조한다.
		Phone phone = new SmartPhone();
		
		// 생성한 객체는 SmartPhone객체지만,
		// 참조변수로 참조하는 객체가 Phone객체이기 때문에
		// Phone객체에 정의된 메소드만 실행가능하다.
		phone.call();
		phone.sms();
		
		System.out.println();
		
		// phone 참조하는 객체는 Phone객체지만,
		// 실제로 생성한 객체는 SmartPhone객체다.
		// phone 참조변수로는 실제 생성된 SmartPhone객체의 고유기능을
		// 실행할 수 없어서, SmartPhone 객체를 탐색해서 참조하도록
		// 강제 클래스형변환을 한다.
		SmartPhone smart = (SmartPhone)phone;
		smart.game();
		smart.internet();
		smart.music();
		
		System.out.println();
		
		((SmartPhone)phone).game();
		((SmartPhone)phone).internet();
		((SmartPhone)phone).music();

		
	}
}
