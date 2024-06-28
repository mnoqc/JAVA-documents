package demo3;

public class StringApp5 {
	
	public static void main(String[] args) {
		/*
		 * String substring(int beginIndex)
		 * 이 문자열에서 지정된 시작위치부터 잘라낸 새 문자열을 반환한다.
		 * 
		 * String substring(int beginIndex, int endIndex)
		 * 이 문자열에서 지정된 범위만큼 잘라내 새 문자열을 반환한다.
		 * 
		 * beginIndex는 포함, endIndex는 포함되지 않는다.
		 */
		
		String str = "Provides classes that are fundamental to the design of the Java";
		String value1 = str.substring(9);
		System.out.println(value1);		// classes that are fundamental...
		
		String value2 = str.substring(9, 16);
		System.out.println(value2);		// classes
	}

}
