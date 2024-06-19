package demo14;

public class PhoneApp3 {

	public static void main(String[] args) {
		
		Phone p1 = new Iphone();
		
		p1.call();
		p1.sms();
		
		System.out.println();
		
		SmartPhone p2 = (SmartPhone)p1;
		p2.internet();
		p2.game();
		p2.music();
		
		System.out.println();
		
		Iphone p3 = (Iphone)p1;
		p3.applePay();
		
		
	}
}
