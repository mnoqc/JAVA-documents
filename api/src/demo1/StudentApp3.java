package demo1;

import java.lang.reflect.*;

public class StudentApp3 {
	
	public static void main(String[] args) throws Exception {
		Student s1 = new Student(10, "김유신");
		Student s2 = new Student(20, "홍길동");
		
		// s1이 참조하는 객체의 클래스 정보를 표현하는 객체를 획득해서
		// clazz로 참조한다.
		Class<? extends Student> clazz = s1.getClass();
		
		// 생성된 객체의 클래스 이름을 조회하기
		String name = clazz.getName();
		System.out.println(name);
		
		// 생성된 객체의 필드를 조회하기
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
		System.out.println(field.getType().getName());
		System.out.println(field.getName()); // 멤버변수명 출력
		System.out.println(field.get(s1));	 // 멤버변수에 저장된 값 출력
		}
		
		System.out.println();
		
		// 생성된 객체의 메소드를 조회하기
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getReturnType().getName()); // 반환타입
			System.out.println(method.getName());				  // 메소드명
		}
	}
}
