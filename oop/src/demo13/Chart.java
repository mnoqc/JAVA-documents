package demo13;

/*
 * Chart 클래스는 추상 클래스다.
 * 
 * Chart 클래스는 다양한 차트 구현클래스의 부모 클래스다.
 * 
 * Chart 클래스에는 모든 차트마다 동일하게 구현되는 공통 기능으로 
 * 차트의 제목과 범례를 정의하는 메소드가 미리 구현되어 있다.
 * 
 * 차트를 그리는 방법은 각각의 차트마다 구현 내용이 다르기 때문에, 
 * 이를 구현 클래스에 위임하여 추상화하였다.
 * 
 * 차트를 그리는 방법을 추상 메소드로 추상화함으로써, 
 * 모든 구현 클래스에서 차트를 그리는 방법을 구현할 때는 
 * 반드시 void draw()라는 메소드 형태로만 재정의하도록 만들었다.
 */
public abstract class Chart {
	
	/*
	 * 추상메소드 
	 */
	public abstract void draw();
	
	// 구현메소드
	public void defineTitle() {
		System.out.println("차트의 제목을 정의한다.");
	}
	
	// 구현메소드
	public void defineLegend() {
		System.out.println("차트의 범례를 정의한다.");
	}

}
