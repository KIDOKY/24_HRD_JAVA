package day04;

public class Account {
	
	public Account() {
		
	}
	
	int BankNumber;
	String Bankname;
	int InMoney;
	
	// balance 필드 은닉화 하기
	private int balance;
	
	// 상수 필드 정의하기
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	// getter, setter 메소드 정의하기
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
	void getBankBalance() {
		System.out.println(this.BankNumber + "\t" + this.Bankname + "\t" + this.InMoney);
	}
	
	
}
