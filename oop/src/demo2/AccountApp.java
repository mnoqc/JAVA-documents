package demo2;

public class AccountApp {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 계좌 개설하기 실행
		account.create("홍길동", 1234, 120000);
		
		// 계좌 정보 출력하기
		account.displayAccountInfo("111-110");
		
		// 입금하기
		account.deposit("111-110", 500000);
		account.displayAccountInfo("111-110");

		// 비밀번호 변경하기
		account.changePassword("111-110", 1234, 4567);
		
		// 출금하기
		int money = account.withdraw("111-110", 4567, 1000);
		System.out.println("출금액: " + money);
		
	}

}
