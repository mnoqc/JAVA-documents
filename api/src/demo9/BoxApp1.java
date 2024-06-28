package demo9;

public class BoxApp1 {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		box1.save("홍길동");
		String value = box1.get();
		System.out.println(value);

//      기본자료형타입은 제네릭의 타입으로 지정할 수 없다.		
//		Box<int> box2 = new Box<int>();
		
// 		기본자료형타입 대신 Wrapper 클래스 타입으로 지정한다.
		Box<Integer> box2 = new Box<Integer>();
		box2.save(100);			// 자동박싱
		int num = box2.get();	// 자동언박싱
		System.out.println(num);
		
	}
}
