package demo22.sub2;

import demo22.sub1.Sub1Sample2;

public class Sub2Sample6 {
	
	Sub1Sample2 sample2 = new Sub1Sample2();
	
	public void test() {
		/*
		 * 패키지가 서로 다른 경우
		 * public 접근제한인 것만 접근할 수 있다. 
		 */
//		sample2.test1();	// private 접근제한
//		sample2.test2();	// default 접근제한
//		sample2.test3();	// protected 접근제한
		sample2.test4();	// public 접근제한
	}
}
 