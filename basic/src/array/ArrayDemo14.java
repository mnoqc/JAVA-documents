package array;

import java.util.Arrays;

public class ArrayDemo14 {
	public static void main(String[] args) {
		
		
		// 배열에서 최소값/최대값 찾기
		int[] numbers = {10, 3, 7, 10, 60, 1, 27};
		
		// Arrays.sort(배열) 기능을 이용하기
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		// 최소값
		int min = numbers[0];
		// 최대값
		int max = numbers[numbers.length - 1];
		
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
	}

}
