package demo11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListApp2 {
	
	public static void main(String[] args) {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("홍길동");
		names1.add("김유신");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("신한비");
		// 다른 자료구조에 저장된 객체를 한 번에 저장시키기
		names2.addAll(names1);
		System.out.println(names2); // [신한비, 홍길동, 김유신]
		
		// 리스트의 0번째에 객체 저장하기
		names2.add(0, "유관순");
		System.out.println(names2); // [유관순, 신한비, 홍길동, 김유신]
		
		// 리스트의 1번째 객체를 다른 값으로 교체하기
		names2.set(1, "세종대왕");
		System.out.println(names2); // [유관순, 세종대왕, 홍길동, 김유신]
		
		// 리스트의 2번째 객체를 삭제하기
		names2.remove(2);
		System.out.println(names2); // [유관순, 세종대왕, 김유신]
		
		// 리스트를 복제하기
		// ArrayList는 내부적으로 Object 객체의 clone() 메소드를 사용한다.
		// Object의 clone() 메소드는 반환타입이 Object다.
		// 형변환이 필요하다.
		List<String> clonedList = (List<String>)names2.clone();
		
		// 리스트의 객체를 오름차순으로 정렬하기
		names2.sort(Comparator.naturalOrder());
		System.out.println(names2);
		
		// 리스트의 객체를 내림차순으로 정렬하기
		names2.sort(Comparator.reverseOrder());
		System.out.println(names2);
	}

}
