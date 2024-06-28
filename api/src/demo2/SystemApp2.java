package demo2;

public class SystemApp2 {
	
	public static void main(String[] args) {
		/*
		 * System.out은 표준출력장치와 연결된 PrintStream객체를 참조한다.
		 * PrintStream 객체의 주요 메소드
		 * 	void print(값)
		 * 		전달받은 값을 출력한다.
		 * 		다음 출력은 기존 출력의 오른쪽에 이어서 출력된다.
		 * 
		 * 	void println(값)
		 * 		전달받은 값을 출력하고, 줄바꿈문자를 출력한다.
		 * 		다음 출력은 새로운 행에서 출력된다.
		 * 
		 *  void printf("출력포맷", 값, 값)
		 *  	지정된 값을 출력포맷에 맞게 출력한다.
		 */
		System.out.printf("%d %s %s\n", 100, "김유신", "강감찬");
		System.out.printf("%10d %10s %10s\n", 100, "김유신", "강감찬");
		System.out.printf("%-10d %-10s %-10s\n", 100, "김유신", "강감찬");
		
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("안\\녕\\하\\세\\요");
		System.out.println("\"홍길동\"님, 안녕하세요");
	}
}
