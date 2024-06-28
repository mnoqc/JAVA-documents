package demo9;

/*
 * Box는 제네릭 클래스다.
 * 
 * Box 멤버변수의 타입은 구체적인 타입이 아니다.
 * Box save() 메소드의 매개변수 타입은 구체적인 타입이 아니다.
 * Box get() 메소드의 매개변수 타입은 구체적인 타입이 아니다.
 */
public class Box<T> {
	private T t;
	
	public void save(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
