package demo14;

public class PhoneApp5 {

	/*
	 * Phone타입의 객체 및 Phone의 하위타입 객체를 전달받을 수 있다.
	 * 
	 * - 매개변수로 전달받을 수 있는 객체
	 *      Phone객체, SmartPhone객체, Galaxy객체, Iphone객체
	 */
	public void testPhone1(Phone phone) {
		
	}
	
	/*
	 * SmartPhone타입의 객체 및 SmartPhone의 하위타입 객체를 전달받을 수 있다.
	 * 
	 * - 매개변수로 전달받을 수 있는 객체
	 * 		SmartPhone객체, Galaxy객체, Iphone객체
	 */
	public void testPhone2(SmartPhone phone) {
		
	}
	
	/*
	 * Galaxy타입의 객체 및 Galaxy의 하위타입 객체를 전달받을 수 있다.
	 * 
	 *  - 매개변수로 전달받을 수 있는 객체
	 * 		Galaxy객체
	 */
	public void testPhone3(Galaxy phone) {
		
	}
	
	public static void main(String[] args) {
		PhoneApp5 app = new PhoneApp5();
		
		Phone p1 = new Phone();
		SmartPhone p2 = new SmartPhone();
		Galaxy p3 = new Galaxy();
		Iphone p4 = new Iphone();
		
		// testPhone1(Phone phone) 메소드는
		// Phone, SmartPhone, Galaxy, Iphone객체를 매개변수로 전달받을 수 있다.
		app.testPhone1(p1);
		app.testPhone1(p2);
		app.testPhone1(p3);
		app.testPhone1(p4);

		// testPhone2(SmartPhone phone) 메소드는
		// SmartPhone, Galaxy, Iphone객체를 매개변수로 전달받을 수 있다.
//		app.testPhone2(p1);
		app.testPhone2(p2);
		app.testPhone2(p3);
		app.testPhone2(p4);
		
		// testPhone3(Galaxy phone) 메소드는
		// Galaxy객체를 매개변수로 전달받을 수 있다.
//		app.testPhone3(p1);
//		app.testPhone3(p2);
		app.testPhone3(p3);
//		app.testPhone3(p4);
	}
}
