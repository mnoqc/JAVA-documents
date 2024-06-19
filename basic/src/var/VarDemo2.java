package var;

public class VarDemo2 {
	public static void main(String[] args) {
		
		// 정수형
		/*
		 * 자바의 정수형 타입
		 * 		byte, short, int, long
		 */
		
		byte a = 100;
		short b = 200;
		int c = 2_000_000;
		long d = 1_000_000_000L;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// 실수형
		/*
		 * 자바의 실수형 타입
		 * 		float, double
		 */
	
		float aa = 3.14f;
		double bb = 3.14;
		double cc = 3.;
		double dd = .314;
		double ee = 2.34e-3;
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		
		// 문자형
		/*
		 * 자바의 문자형 타입
		 * 		char
		 */
	
		char c1 = '가';
		char c2 = 'a';
		char c3 = 65;
		char c4 = 66; // 유니코드 10진수
		char c5 = '\uac00'; // 유니코드 16진수
		char c6 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
	}
}
