package demo22.sub2;

/*
 * Sub1Sample2의 접근제한이 public으로 지정되어 있어서
 * 다른 패키지에서도 import 구문 추가 후 사용할 수 있다. 
 */
import demo22.sub1.Sub1Sample2;

/*
 * Sub1Sample1의 접근제한이 default로 지정되어 있어서
 * 다른 패키지에서는 접근할 수 없다. 
 */
// import demo22.sub1.Sub1Sample1;

public class Sub2Sample4 {
	
	public static void main(String[] args) {

//		Sub1Sample1 sample1 = new Sub1Sample1();
		

		Sub1Sample2 sample2 = new Sub1Sample2();
	}

}
