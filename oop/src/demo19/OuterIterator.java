package demo19;

public class OuterIterator {
	
	public static void main(String[] args) {
		
	ArraySampleOuter outer = new ArraySampleOuter();
	outer.add("홍길동");
	outer.add("김유신");
	
	InnerIterator it = outer.iterator();
	
//	System.out.println(it);
//	
//	System.out.println(it.hasNext());	// true
//	System.out.println(it.next());		// 홍길동
//
//	System.out.println(it.hasNext());	// true
//	System.out.println(it.next());		// 김유신
//	
//	System.out.println(it.hasNext());	// false
	
	while (it.hasNext()) {
		String value = it.next();
		System.out.println(value);
	}
	
	}

}
