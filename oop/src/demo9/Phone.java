package demo9;

public class Phone {
	private String tel; // 전화번호
	
	// 기본 생성자 메소드
	public Phone() {
		
	}
	
	// 매개변수가 있는 생성자 메소드	
	public Phone(String tel) {
		this.tel = tel;
	}

	// Getter 메소드
	public String getTel() {
		return tel;
	}

	// Setter 메소드
	public void setTel(String tel) {
		this.tel = tel;
	}

	public void call(String to) {
		System.out.println("Phone의 call() 메소드 실행됨");
		System.out.println(tel + "이 " + to + "에게 전화를 건다.");
	}

}
