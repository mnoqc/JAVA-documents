package demo2;

public class SystemApp1 {

	public static void main(String[] args) throws Exception {
		
		// System.in은 키보드 입력을 읽어오는 객체를 참조한다.
		// System.in.read()는 키보드 입력을 읽어서 정수값으로 반환한다.
		// System.in.read()가 반환하는 값은 입력한 글자에 대한
		// 유니코드 코드값이다.
		// 만약 A를 입력했으면 65, a를 입력했으면 97이 반환된다.
		// 정수값을 char로 형변환하면 해당 문자가 출력된다.
		int value = System.in.read();
		System.out.println((char)value);
	}
}
