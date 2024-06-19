package array;

public class ArrayDemo11 {
	public static void main(String[] args) {
		
		// 배열에 저장된 데이터 찾기
		/*
		 * 배열에서 지정된 데이터 찾기
		 * - 배열에서 지정된 데이터를 찾는다는 것은
		 * 	 지정된 값과 동일한 값이 배열의 몇 번째 인덱스에
		 * 	 저장되어 있는지를 알아내는 것이다. 
		 * - 만약, 배열에서 원하는 값을 찾지 못했을 때는 -1을 제공하자.
		 */
		
		int[] numbers = {10, 20, 3, 7, 15};
		
		// 배열에 저장된 값 중에서 3이 몇 번째에 저장되어 있는지 찾기
		// 찾는 값이 저장된 인덱스를 담는 변수를 정의한다.
		// 변수에는 검색 결과로 절대 나올 수 없는 값을 기본값으로 설정한다.
		int foundIndex = -1;
		int findValue = 3;
		
		for (int i = 0; i < numbers.length; i++) {
			int value = numbers[i];
			if (numbers[i] == findValue) {
				foundIndex = i;
				break;
			}
		}
		 
		// foundIndex에 -1이 아닌 값이 저장되어 있으면
		// 배열에서 값을 발견한 것이기 때문에 저장된 인덱스를 출력한다.
		
		if (foundIndex != -1) {
		System.out.println("저장된 배열의 인덱스: " + foundIndex);
		} else {
			System.out.println("배열에서 값을 찾을 수 없습니다.");
		}
		
	}

}
