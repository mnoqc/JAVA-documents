package demo1;

public class StudentApp2 {
	public static void main(String[] args) {
		
	Student s1 = new Student(10, "홍길동");
	Student s2 = new Student(10, "홍길동");
	Student s3 = new Student(20, "김유신");
	Student s4 = s3;
	
	
	/*
	 * Student 클래스의 hashCode()와 equals(Object o)를 재정의하였음
	 * - Student 객체의 no 멤버변수에 대입된 값이 같은 값이면 같은 객체로 판단하도록 재정의하였음
	 * 객체의 동일성 비교와 동등성 비교
	 * * == 연산자는 두 객체의 동일성을 비교한다.
	 * 	 == 연산자는 두 객체의 주소값을 비교한다.
	 * 	 == 연산자는 참조변수가 참조하는 두 객체가 완전히 동일한
	 * 		객체일 때만 true를 반환한다.
	 * * equals(Object obj) 메소드
	 *  + Object의 equals(Object obj)는 두 객체의 동일성을 비교한다.
	 *  + Object의 equals(Object obj)를 재정의해서 
	 * 	  두 객체의 특정 멤버변수에 대입된 값이 같은 값일 때
	 * 	  두 객체를 같은 객체로 판단하도록 할 수 있다.
	 *  + 두 객체에 대한 동등성 비교를 수행하도록 재정의할 수 있다.
	 */
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	
	System.out.println(s1 == s2);
	System.out.println(s1 == s3);
	System.out.println(s3 == s4);
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	
	}

}
