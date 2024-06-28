package demo1;

public class StudentApp4 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(10, "홍길동");
		
		Student s2 = s1.copy();
		System.out.println(s2);
	}

}
