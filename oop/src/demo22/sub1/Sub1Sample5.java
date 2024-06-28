package demo22.sub1;

public class Sub1Sample5 {
	
	Sub1Sample2 sample2 = new Sub1Sample2();
	
	public void test() {
		
		/*
		 * private 접근제한: 외부클래스에 절대 접근할 수 없다.
		 * default 접근제한: 같은 패키지 내의 외부 클래스에서 접근 가능하다.
		 * protected 접근제한: 같은 패키지 내의 외부 클래스에서 접근 가능하다.
		 * 
		 */
//		sample2.test1();
		sample2.test2();
		sample2.test3();
		sample2.test4();
	}

}
