package demo10;

import java.util.TreeSet;

public class SetApp5 {
	
	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<Employee>();
		
		Employee emp1 = new Employee(100, "홍길동", "영업팀", 300);
		Employee emp2 = new Employee(101, "김유신", "홍보팀", 500);
		Employee emp3 = new Employee(102, "강감찬", "기술팀", 700);
		Employee emp4 = new Employee(110, "이순신", "기술팀", 800);
		Employee emp5 = new Employee(103, "이성계", "기술팀", 600);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		for (Employee emp : employees) {
			System.out.println(emp.getNo() + ", " + emp.getName());
		}
	
	}

}
