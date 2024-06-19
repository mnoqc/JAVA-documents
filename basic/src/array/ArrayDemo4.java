package array;

public class ArrayDemo4 {
	public static void main(String[] args) {
		
		// 자바의 배열
		// * 같은 타입의 값을 여러 개 저장하는 객체이다.
		// * 배열객체를 생성할 때 반드시 미리 크기를 지정해야 한다.
		//	 배열객체의 크기를 지정하지 않으면 배열객체를 생성할 수 없다.
		//	 한 번 생성한 배열객체의 크기를 변경할 수도 없다.
		// * 배열객체는 인덱스를 이용해서 배열의 각 요소에 접근할 수 있다.
		//	 인덱스는 배열객체 생성시 자동으로 부여되고, 0번부터 시작된다.
		// * 배열객체에는 length라는 프로퍼티(Property, 특성, 성질, 속성, 값)가 있다.
		//	 length 프로퍼티는 배열객체의 크기값을 가진다.
		//	 length 프로퍼티는 배열객체에 저장된 값의 개수와 일치한다.
		//	 반복문에서 반복횟수를 정할 때 사용된다.
		
		int[] arr1 = new int[5];
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		// arr2.length 프로퍼티의 값이 3이다.
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		
		}

	}
}
