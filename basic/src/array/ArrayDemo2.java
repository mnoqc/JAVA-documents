package array;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		
		// 배열 리터럴로 배열객체 생성하기
		int[] arr1 = {10, 20, 30, 40, 50};
		
		// 배열 리터럴로 배열객체 생성하기
		// 배열객체 생성시 배열의 구체적인 타입을 지정하기
		int[] arr2 = new int[]{10, 20, 30, 40, 50};
		
		// 빈 배열객체 생성하기
		int[] arr3 = new int[5];
		
		// 배열객체를 참조하는 참조변수값을 출력하면
		// 참조변수가 참조하는 객체의 정보가 출력된다.
		// * 참조변수의 값을 출력하면 참조변수가 참조하는 
		// 	 객체가 가지고 있는 .toString() 기능이 제공하는 값이 출력된다.
		// * .toString() 기능은 객체에 대한 간단한 정보를 제공한다.
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		System.out.println(arr1.toString());
		System.out.println(arr2.toString());
		System.out.println(arr3.toString());
		
		// java.util.Arrays 클래스는 배열객체에 대한 유용한 기능을 제공한다.
		// Arrays.toString(배열)은 배열객체에 저장된 값을 하나의 문자열로 제공한다.
		// Arrays.toString(배열) 기능을 사용하면 배열객체에 저장된 값을 간단하게 확인할 수 있다.
		System.out.println(Arrays.toString(arr1)); // "[10, 20, 30, 40, 50]"
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}

}
