package array;

public class ArrayDemo13 {
	public static void main(String[] args) {
		
		// 최소값, 최대값 찾기
		
		/*
		 *	배열은 1~100 사이의 정수값을 가진다.
		 *	배열에 저장된 값 중에서 최소값과 최대값을 찾아보자. 
		 *	배열의 0번째 값을 최대값 혹은 최소값으로 가정하고,
		 *	1번째부터 비교해보자.
		 */
		
		int[] numbers = {10, 3, 7, 10, 60, 1, 27};
		
		// 최대값 찾기
		// 배열의 0번째 값을 최대값이라고 가정한다.
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("최대값: " + max);
		
		// 최소값 찾기
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("최소값: " + min);
	}

}
