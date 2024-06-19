package demo7;

public class HousingSubscriptionDeposit {
	
	private int no;
	private String owner;
	private int password;
	private long balance;
	
	// 정적 변수로 상수 정의
	public static final double INTEREST_RATE = 0.015;

	public HousingSubscriptionDeposit(int no, String owner, int password, long balance) {
		super();
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	
	public void displayInfo() {
		long amount = balance + (long)(balance*HousingSubscriptionDeposit.INTEREST_RATE);
		System.out.println("-- 계좌 정보 -----");
		System.out.println("계좌번호: " + no);
		System.out.println("예금주: " + owner);
		System.out.println("비밀번호: " + password);
		System.out.println("예금잔액: " + balance);
		System.out.println("이율: " + HousingSubscriptionDeposit.INTEREST_RATE);
		System.out.println("해지금액: " + amount);
		System.out.println("------------------");
	}
	
}
