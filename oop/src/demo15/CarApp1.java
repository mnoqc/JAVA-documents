package demo15;

public class CarApp1 {
	
	public static void main(String[] args) {
		
		Tico car1 = new Tico();
		car1.drive();
		car1.stop();
		car1.speedUp();
		car1.speedDown();
		
		System.out.println();
		
		Tico car2 = new Tico();
		car2.drive();
		car2.stop();
		car2.speedUp();
		car2.speedDown();
	}

}
