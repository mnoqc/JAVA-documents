package demo11;

import java.util.Stack;

public class ListApp4 {
	public static void main(String[] args) {
		
		/*
		 * Stack<E>
		 * - 후입선출(LIFO)
		 * - 주요 API 
		 * 		E push()
				스택의 맨 위에 객체를 추가한다.
				E pop()
				스택의 맨 위의 값을 꺼내고, 삭제한다.
				E peek() 
				스택의 맨 위의 값을 반환한다.
		 */
		
		Stack<String> names = new Stack<String>();
		
		names.push("김유신");
		names.push("강감찬");
		names.push("이순신");
		System.out.println(names);
		
		names.pop();
		System.out.println(names);
		names.pop();
		System.out.println(names);
		names.pop();
		System.out.println(names);
	}

}
