package demo10;

/*
 * Person 클래스를 상속받아서 직원 정보를 표현하는 Employee 클래스다. 
 */
public class Employee extends Person{
	
	/*
	 * Employee는 직원의 소속 부서, 급여를 표현하는 멤버 변수가 있다. 
	 */
	private String dept;
	private int salary;
	
	public Employee () {
		// Person 객체의 매개변수 없는 생성자 메소드를 호출한다.
		// 여기서는 Person()이다.
		super();
		System.out.println("Employee() 생성자 실행됨");
	}
	
	/*
	 * Employee는 직원 이름, 나이, 소속 부서, 급여를 전달받아서
	 * 직원 정보를 초기화하는 생성자가 있다.
	 * - 직원 이름, 나이는 Person(부모) 객체의 멤버 변수에 저장하고,
	 * 	 소속 부서, 급여는 Employee 객체의 멤버 변수에 저장한다.
	 * - Employee에서는 부모 객체의 생성자 메소드를 호출하는
	 *   super() 혹은 super(값, 값) 메소드를 실행해서 자신이 전달받은
	 *   직원 이름과 나이를 Person 객체의 생성자 메소드에 전달해서
	 *   Person 객체의 name과 age에 저장시킨다.
	 */
	public Employee(String name, int age, String dept, int salary) {
		// Person 객체의 매개변수 있는 생성자 메소드를 호출한다.
		// 여기서는 Person(String name, int age)이다.
		super(name, age);
		this.dept = dept;
		this.salary = salary;
		System.out.println("Employee(name, age, dept, salary) 생성자 실행됨");
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

}
