package array;

import java.util.Arrays;

public class ArrayDemo8 {
	public static void main(String[] args) {
		
		// 원본배열에서 지정된 범위에 속하는 배열을 새로운 배열에 복사하기
		int[] src = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		// 원본배열의 4~9번째 값을 새로운 배열에 복사하기
		// 번호는 1부터 시작하는 것으로 가정한다.
		// 배열의 인덱스는 0부터 시작한다.
		// 따라서, 실제로 복사할 위치는 원본배열의 3~8까지다.
		int begin = 4;
		int end = 9;
		
		// 새 배열을 생성하기
		int[] dest = new int[end - begin + 1];
		
		// 새 배열에 복사하기
		int index = 0;
		for (int i = begin - 1; i < end; i++) {
			dest[index++] = src[i];
			System.out.println(Arrays.toString(dest));
		}
		System.out.println(Arrays.toString(dest));
	}

}
