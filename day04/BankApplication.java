package day04;
import java.util.Scanner;
import java.util.ArrayList;
public class BankApplication {
	
	static Account p1;
	ArrayList<Account> arraylist = new ArrayList<Account>();
	
	public void showBankMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.print("선택>");
	}
	
	public void inputBankPerson() {
		Scanner sc = new Scanner(System.in);
		p1 = new Account();
		
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		int bn = sc.nextInt();
		p1.BankNumber = bn;
		System.out.print("계좌주: ");
		String nm = sc.next();
		p1.Bankname = nm;
		System.out.print("초기입금액: ");
		int im = sc.nextInt();
		p1.InMoney = im;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		arraylist.add(p1);
	}
	
	void showBankInfo() {
		for(Account p : arraylist) {
			p.getBankBalance();
		}
	}
	
	public static void main(String[] args) {
		
		Account hanaAccount = new Account();
		hanaAccount.setBalance(10000);
		System.out.println("현재 잔고: " + hanaAccount.getBalance());
		
		hanaAccount.setBalance(-100);
		System.out.println("현재 잔고: " + hanaAccount.getBalance());
		
		hanaAccount.setBalance(2000000);
		System.out.println("현재 잔고: " + hanaAccount.getBalance());
		
		hanaAccount.setBalance(300000);
		System.out.println("현재 잔고: " + hanaAccount.getBalance());
		
		Scanner sc = new Scanner(System.in);
		BankApplication ba = new BankApplication();
		
		while(true) {
			ba.showBankMenu();
			int no = sc.nextInt();
			if(no == 5) {
				System.exit(0);
				System.out.println("시스템 종료");
			}else if(no == 1) {
				ba.inputBankPerson();
			}else if(no == 2) {
				System.out.println("-----------------");
				System.out.println("계좌목록");
				System.out.println("-----------------");
				ba.showBankInfo();
			}else if(no == 3) {
				
			}else if(no == 4) {
				
			}
		}
	}

}
