package demo16;

public class UserApp {
	
	public static void main(String[] args) {
		
		User src = new User("홍길동", 30);
		System.out.println(src);
		
		System.out.println();
		
		// src 참조 변수가 참조하는 객체 복제하기
		User clonedUser = src.copy();
		System.out.println(clonedUser);
		System.out.println(clonedUser.getName());
		System.out.println(clonedUser.getAge());
	}

}
