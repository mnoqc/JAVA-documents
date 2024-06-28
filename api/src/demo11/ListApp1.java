package demo11;

import java.util.ArrayList;

public class ListApp1 {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		// 객체 저장하기
		names.add("홍길동");
		names.add("이순신");
		names.add("김유신");
		names.add("유관순");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		
		System.out.println();
		
		// 저장된 객체 사용하기 - 향상된 for문 사용
		for (String name : names) {
			System.out.println(name); // 내가 저장한 순서대로 저장됨
		}
		
		System.out.println();
		
		// 저장된 객체 사용하기 - 일반 for문 사용
		int size = names.size();
		for (int i = 0; i < size; i++) {
			String value = names.get(i);
			System.out.println(value);
		}
		
	}

}
