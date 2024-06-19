package demo19;

public class SampleOuter1 {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public SampleOuter1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	/*
	 * 멤버 내부클래스를 이용하기
	 * - 외부 클래스에서는 멤버 내부 클래스로 객체를 생성하고
	 * 멤버 내부 클래스의 속성과 기능을 사용할 수 있다.
	 */
	
	public void display() {
		// 멤버 내부 클래스로 객체 생성하기
		MemberInner inner = new MemberInner();
		// 멤버 내부 클래스로 메소드 생성하기
		int total = inner.getTotal();
		int average = inner.getAverage();
		
		System.out.println("----성적 정보");
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총합: " + total);
		System.out.println("평균: " + average);
	}
/* 멤버 내부 클래스
* - 멤버 내부 클래스는 외부 클래스의 모든 변수, 모든 메소드를 사용할 수 있다.
* - 멤버 내부 클래스는  private 접근 제한을 적용해서 외부 접근을 차단하는 경우가 많다.
* - 멤버 내부 클래스는 이 내부 클래스를 포함하고 있는 외부 클래스에서
* 	전용으로 사용하기 위해서 작성하기 때문이다.
*/
	class MemberInner {
		
		public int getTotal() {
			// 외부 클래스의 멤버변수를 바로 사용할 수 있다.
			int total = kor + eng + math;
			return total;
		}
		
		public int getAverage() {
			int total = getTotal();
			int average = total/3;
			return average;
			
		}
		
	}
	
}
