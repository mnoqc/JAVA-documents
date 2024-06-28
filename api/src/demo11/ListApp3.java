package demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListApp3 {
	
	public static void main(String[] args) {
		/*
		 * List<E> 객체를 만드는 3가지 방법
		 * 
		 * new ArrayList<>()
		 * 	객체 추가, 삭제, 변경이 모두 가능하다.
		 * 
		 * asList(E...e)
		 *  객체 추가, 삭제가 불가능하다.
		 *  단, 변경은 가능하다.
		 * 
		 * List.of(E e, E e, E e)
		 *  객체 추가, 삭제, 변경이 모두 가능하다.
		 */
		
		List<String> list1 = new ArrayList<String>();
		list1.add("홍길동");
		list1.add("김유신");
		
		List<String> list2 = Arrays.asList("홍길동", "김유신");
		list2.add("유관순");		// 추가 불가능
		list2.set(1,  "강감찬");	// 변경 가능
		
		List<String> list4 = new ArrayList<String>(list2);
		list4.add("김유신");
		
		List<String> list3 = List.of("홍길동", "김유신");
		list3.add("유관순");		// 추가 불가능
		list3.set(1,  "강감찬");	// 변경 불가능
		

	}

}
