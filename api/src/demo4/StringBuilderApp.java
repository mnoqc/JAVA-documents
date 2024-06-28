package demo4;

public class StringBuilderApp {
	public static void main(String[] args) {
		/*
		 * StringBuilder
		 * - 내부 저장소를 가지고 있는 객체다.
		 * - 내부 저장소에 저장된 값을 하나의 문자열로 반환한다.
		 * - 이 객체의 사용 목적은 내부 저장소의 값으로 문자열을 획득하는 것이다.
		 * 
		 *  주요 메소드
		 *  	StringBuilder append(값)
		 *  	- 다양한 값을 매개변수로 전달받을 수 있도록
		 *  	  중복 정의되어 있다.
		 * 		- 전달받은 값을 내부 저장소에 저장시킨다.
		 *  	- 반환타입이 StringBuilder이기 때문에
		 *  	  메소드체이닝을 사용할 수 있다.
		 *  	String toString()
		 *  	- Object의 toString() 메소드를 재정의한 메소드다.
		 *  	- 내부 저장소에 저장된 값을 하나의 문자열로 만들어서 반환한다.
		 */
		
		StringBuilder builder1 = new StringBuilder();
		builder1.append("홍길동");
		builder1.append(",");
		builder1.append(100);
		builder1.append(",");
		builder1.append(90);
		builder1.append(",");
		builder1.append(70);
		
		String text1 = builder1.toString();
		System.out.println(text1);
		
		// 메소드 체이닝을 사용한 경우
		StringBuilder builder2 = new StringBuilder();
		builder2.append("김유신")
				.append(",")
				.append(100)
				.append(",")
				.append(90)
				.append(",")
				.append(70);
		
		String text2 = builder2.toString();
		System.out.println(text2);
		
		// 메소드 체이닝을 사용한 경우
		String text3 = new StringBuilder()
			.append("강감찬")
			.append(",")
			.append(100)
			.append(",")
			.append(90)
			.append(",")
			.append(70)
			.toString();
		
		System.out.println(text3);
		
		}

}
