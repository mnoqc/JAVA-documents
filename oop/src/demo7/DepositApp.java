package demo7;

public class DepositApp {
	public static void main(String[] args) {
		System.out.println("이율: " + HousingSubscriptionDeposit.INTEREST_RATE);
		// HousingSubscriptionDeposit.INTEREST_RATE = 0.025;
		
		HousingSubscriptionDeposit deposit1
		= new HousingSubscriptionDeposit(10, "홍길동", 1234, 300000);
		HousingSubscriptionDeposit deposit2
		= new HousingSubscriptionDeposit(11, "김유신", 4567, 2500000);
		HousingSubscriptionDeposit deposit3
		= new HousingSubscriptionDeposit(12, "강감찬", 8667, 6700000);
		
		deposit1.displayInfo();
		deposit2.displayInfo();
		deposit3.displayInfo();
		
		
	}

}
