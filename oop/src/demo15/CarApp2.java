package demo15;

public class CarApp2 {
	
	public static void main(String[] args) {
		Genesis car1 = new Genesis();
		car1.drive();
		car1.stop();
		car1.speedUp();
		car1.speedDown();
		car1.autoDrive();
		car1.autoParking();
		
		System.out.println();
		
		Car car2 = new Genesis();
		car2.drive();
		car2.stop();
		car2.speedUp();
		car2.speedDown();
		
		System.out.println();
		
		AutoDrivable car3 = new Genesis();
		car3.autoDrive();
		car3.autoParking();
		
	}

}
