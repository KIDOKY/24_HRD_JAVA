package bankprogram;

public class Account {
	
	// balance 필드 은닉화 하기
	private int balance ;
	private String banknum;
	private String owner;
	
	// 상수 필드 정의하기
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	public Account(String banknum, String owner, int balance) {
		this.banknum = banknum;
		this.owner = owner;
		this.balance = balance;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getBanknum() {
		return banknum;
	}


	public void setBanknum(String banknum) {
		this.banknum = banknum;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}

	// getter, setter 메소드 정의하기
	
}