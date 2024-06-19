package demo14;

public class PhoneApp2 {

	public static void main(String[] args) {
		
		Phone phone = new Galaxy();
		
		phone.call(); 	// Galaxy객체에 재정의된 call() 실행됨
		phone.sms();	// SmartPhone객체에 재정의된 sms() 실행됨 
	}
}
