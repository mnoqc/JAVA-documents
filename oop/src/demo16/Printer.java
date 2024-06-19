package demo16;

public class Printer {
	
	public void print(Object obj) {
		
		if (obj instanceof Printable) {
			System.out.println(obj);
		} else {
			System.out.println("예외 발생");
		}
		
	}
	public static void main(String[] args) {
		Printer p = new Printer();
		User user = new User();
		
		p.print(user);
	}
}
