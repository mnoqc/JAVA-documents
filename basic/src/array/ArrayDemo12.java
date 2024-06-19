package array;

import java.util.Arrays;

public class ArrayDemo12 {
	public static void main(String[] args) {
		
		// 배열에서 값 검색하기
		/*
		 * Arrays의 검색 기능
		 * 	Arrays.binarySearch(배열, 값)
		 * 		- 위의 기능은 배열에서 지정된 값이 저장된 위치를 반환한다.
		 * 		- 지정된 값을 찾지 못했을 때는 음수값이 반환된다.
		 * 		- 
		 */
		
		String[] users = {"이순신", "김유신", "강감찬", "유관순", "홍길동"};
		Arrays.sort(users);
		
//		int foundIndex = -1;
//		for (int i = 0; i < users.length; i++) {
//			if (users[i] == "이순신") {
//				foundIndex = i;
//				break;
//			}
//		}
		
		
		// 정렬 후 -> {"강감찬", "김유신", "유관순", "이순신","홍길동"}
		int foundIndex = Arrays.binarySearch(users, "강감찬");
		
		System.out.println("저장된 인덱스: " + foundIndex);
	}

}
