package demo10;

import java.util.HashSet;


public class SetApp4 {
	
	public static void main(String[] args) {
		/*
		 * 사원 정보를 여러 개 저장하기 
		 */
		
		// 사원정보(Employee 객체)를 여러 개 저장하는 HashSet객체 생성하기
		HashSet<Employee> employees = new HashSet<Employee>();
		
		// 사원정보를 표현하는 Employee 객체를 생성하기
		Employee emp1 = new Employee(100, "홍길동", "영업팀", 300);
		Employee emp2 = new Employee(101, "김유신", "홍보팀", 500);
		Employee emp3 = new Employee(102, "강감찬", "기술팀", 700);
		Employee emp4 = new Employee(102, "강감찬", "기술팀", 700);
		
		// 생성된 Employee 객체를 HashSet객체에 저장하기
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		
		int size = employees.size();
		System.out.println("저장된 객체의 개수: " + size);
		
		for (Employee emp : employees) {
			System.out.print(emp.getNo() + ", ");
			System.out.print(emp.getName() + ", ");
			System.out.print(emp.getDept() + ", ");
			System.out.println(emp.getSalary());
		}
	}

}
