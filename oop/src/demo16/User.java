package demo16;

public class User implements Cloneable, Printable{
	
	private String name;
	private int age;
	
	public User() {}
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public User copy() {
		try {
			return (User)clone();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
