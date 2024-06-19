package array;

import java.util.Arrays;

public class ArrayDemo16 {
	public static void main(String[] args) {
		
		// 배열에서 지정된 값을 삭제하기
		// 1. 지정된 값이 저장된 위치를 찾는다.
		// 2. 저장된 위치 다음부터 값을 하나씩 왼쪽으로 복사한다.
		// 3. 맨 마지막 값을 0으로 변경한다.
		int[] numbers = {10, 20, 4, 52, 16, 23};
		
		int deleteValue = 52;
		int foundIndex = -1;
		
		// 1. 지정된 값이 저장된 위치를 찾는다.
		for (int i = 0; i < numbers.length; i++) {
			int value = numbers[i];
			if (value == deleteValue) {
				foundIndex = i;
				break;
			}
		}
		
		// 2. 저장된 위치 다음부터 값을 하나씩 왼쪽으로 복사한다.
		if (foundIndex == -1) {
			System.out.println("배열에서 값을 찾을 수 없습니다.");

			} else {
				for (int i = foundIndex; i < numbers.length -1; i++) {
					numbers[i] = numbers[i+1];
			}
				// 3. 맨 마지막 값을 0으로 변경한다.
				numbers[numbers.length - 1] = 0;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		}

	}

