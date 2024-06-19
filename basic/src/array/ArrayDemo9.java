package array;

import java.util.Arrays;

public class ArrayDemo9 {
	public static void main(String[] args) {
		
		// 배열 복사하기
		int[] src = {10, 20, 30, 40, 50};
		
		/*
		 * dest1 -> {10, 20, 30, 40, 50}
		 * dest2 -> {10, 20, 30, 40, 50, 0, 0, 0, 0, 0}
		 * dest3 -> {40, 50, 0,	 0,  0,  0, 0, 0, 0, 0}
		 * dest3 -> {0,  0,  0,  0, 40, 50, 0, 0, 0, 0}
		 * 
		 * */
		
		int[] dest1 = new int[src.length];
		int[] dest2 = new int[src.length*2];
		int[] dest3 = new int[src.length*2];
		int[] dest4 = new int[src.length*2];
		
		// 자바가 제공하는 배열 복사기능
		/*
		 * System.arraycopy(src, beginIndex, dest, copyIndex, length) 기능 사용
		 * src : 원본배열
		 * beginIndex : 원본배열의 복사 시작 위치
		 * dest : 대상배열
		 * copyIndex : 원본배열의 복사된 값이 대상배열에 저장될 위치
		 * length : 복사할 원본배열의 값의 개수 
		 */
		
		// 1. 원본 배열을 그대로 새로운 배열에 복사하기
		System.arraycopy(src, 0, dest1, 0, src.length);
		
		// 2. 원본 배열을 더 큰 새로운 배열에 복사하기
		System.arraycopy(src, 0, dest2, 0, src.length);
		
		// 3. 원본 배열의 특정 범위의 값을 새로운 배열에 복사하기
		System.arraycopy(src, 3, dest3, 0, 2);
		
		// 4. 원본 배열의 특정 범위의 값을 새로운 배열의 특정 위치에 복사하기
		System.arraycopy(src, 3, dest4, 4, 2);
		
		System.out.println(Arrays.toString(dest1));
		System.out.println(Arrays.toString(dest2));
		System.out.println(Arrays.toString(dest3));
		System.out.println(Arrays.toString(dest4));
		
	}

}
