package array;

import java.util.Arrays;

public class ArrayDemo7 {
	public static void main(String[] args) {
		
		// 배열객체 활용하기
		// 배열객체에 저장된 값을 다른 배열에 복사하기
		
		// * 배열에 저장된 값을 더 큰 배열에 옮겨 담을 때
		// * 배열에 저장된 값을 다양한 방식으로 변경해야 되는데,
		//   원본 배열의 값은 그대로 유지해야 될 때 배열을 복사한다.
		
		int[] src = {10, 20, 30};
		int[] dest = new int[10];
		
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}

}
