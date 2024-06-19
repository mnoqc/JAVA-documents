package demo14;

public class PhoneApp6 {

	public void test(Phone p) {
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		SmartPhone p2 = new SmartPhone();
		Galaxy p3 = new Galaxy();
		Iphone p4 = new Iphone();
		
		PhoneApp6 app = new PhoneApp6();
		app.test(p1);
		app.test(p2);
		app.test(p3);
		app.test(p4);
	}
}
