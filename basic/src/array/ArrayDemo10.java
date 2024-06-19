package array;

import java.util.Arrays;

public class ArrayDemo10 {
	public static void main(String[] args) {
		
		// 배열에 저장된 값 정렬하기
		// * Arrays.sort(배열) 기능을 이용하면
		//   배열에 저장된 값을 오름차순으로 정렬할 수 있다.
		
		int[] numbers = {10, 3, 76, 29, 5, 1, 20, 62};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String[] names = {"이순신", "김유신", "강감찬", "유관순", "김구"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
	}

}
