package demo9;

public class SmartPhone extends Phone {
	private String ip;
	
	// 기본 생성자 메소드
	public SmartPhone() {
		
	}
	
	// 매개변수가 있는 생성자 메소드
	public SmartPhone(String ip) {
		this.ip = ip;
	}

	// Getter 메소드
	public String getIp() {
		return ip;
	}

	// Setter 메소드
	public void setIp(String ip) {
		this.ip = ip;
	}

	public void internet() {
		System.out.println("SmartPhone의 internet() 메소드 실행됨");
	}

}
