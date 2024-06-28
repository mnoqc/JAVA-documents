package demo9;

import demo9.phone.Phone;
import demo9.phone.SmartPhone;

public class PhoneBoxApp2 {
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new SmartPhone();
		
		Phone[] arr1 = new Phone[10];
		Phone[] arr2 = new SmartPhone[10];
		
		PhoneBox<Phone> box1 = new PhoneBox<Phone>();
//		PhoneBox<Phone> box2 = new PhoneBox<SmartPhone>();	// 컴파일 오류
		PhoneBox<?> box3 = new PhoneBox<SmartPhone>();
		PhoneBox<? extends Phone> box4 = new PhoneBox<SmartPhone>();
		PhoneBox<? super SmartPhone> box5 = new PhoneBox<SmartPhone>();
		
	}

}
