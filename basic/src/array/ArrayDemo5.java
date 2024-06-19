package array;

import java.util.Arrays;

public class ArrayDemo5 {
	public static void main(String[] args) {
		
		// 빈 배열객체 생성하기
		// 빈 배열객체를 생성하면, 지정된 크기만큼의 값을 저장하는 저장소가 생성된다.
		// 저장소의 각 칸은 해당 타입의 기본값으로 초기화된다.
		// 배열의 각 요소에 값 저장하기
		//		배열명[인덱스] = 값;
		
		int[] arr1 = new int[5];
		
		arr1[0] = 10;
		System.out.println(Arrays.toString(arr1));
		
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		
		arr1[2] = 80;
		System.out.println(Arrays.toString(arr1));
		
		arr1[3] = 70;
		System.out.println(Arrays.toString(arr1));
		
		arr1[4] = 80;
		System.out.println(Arrays.toString(arr1));
		
		// arr1[5] = 80;
		// System.out.println(Arrays.toString(arr1));
		
		
	}

}
