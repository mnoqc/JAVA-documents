package demo9;

import demo9.phone.Phone;

/*
 * 제네릭 타입을 제한하기
 * 
 * <T extends 타입>은 T의 타입을 제한하는 것이다.
 * T는 지정된 타입 혹은 해당 타입의 하위만 가능하다.
 * 
 * 타입에는 클래스 혹은 인터페이스를 지정할 수 있다.
 * 타이인 인터페이스로 지정되더라도 <T implements 타입>으로 적지 않는다.
 *  
 * <T extends Phone>으로 지정하면
 * T는 Phone, SmartPhone, FeaturePhone 종류만 가능하다.
 * 
 * PhoneBox를 사용할 때 사용가능한 T가 제한된다.
 * PhoneBox<Phone> box = new PhoneBox<Phone>();		// 가능
 * PhoneBox<SmartPhone> box = new PhoneBox<SmartPhone>();		// 가능
 * PhoneBox<String> box = new PhoneBox<String>();		// 컴파일 오류
 */

public class PhoneBox<T extends Phone> {
	
	private T item;
	
	public void save(T t) {
		this.item = t;
	}
	
	public T get() {
		return item;
	}

}
