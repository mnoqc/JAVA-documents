package demo10;

import java.util.TreeSet;

public class SetApp2 {
	
	public static void main(String[] args) {
		
		/*
		 * TreeSet<E> 
		 * - Set<E> 인터페이스의 구현 클래스다.
		 * - 중복을 허용하지 않는다.
		 * - 저장된 객체를 오름차순으로 정렬한다.
		 */
		
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("홍길동");
		names.add("이순신");
		names.add("김유신");
		names.add("유관순");
		names.add("강감찬");
		
		// 저장된 객체 사용하기
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		TreeSet<Integer> numbers = new  TreeSet<Integer>();
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(90);
		numbers.add(20);
		numbers.add(40);
		numbers.add(60);

		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
