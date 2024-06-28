package demo22.sub2;

import demo22.sub1.Sub1Sample2;

public class Sub2Sample7 extends Sub1Sample2 {
	
	public void test() {
		/*
		 * Sub2Sample7은 Sub1Sample2의 자식클래스다.
		 * 자식클래스는 부모로부터 속성과 기능을 상속받기 때문에
		 * Sub1Sample2의 속성과 기능을 바로 사용할 수 있다.
		 * 
		 * 단, 접근제한 규칙은 그대로 적용된다.
		 */
//		test1();	// private 접근제한
//		test2();	// default 접근제한
//		test3();	// protected 접근제한
		test4();	// public 접근제한
	}

}
