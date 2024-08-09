package bankprogram;

import java.util.Scanner;
import java.util.ArrayList;
public class BankApplication {

	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {	

		
		while (true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				System.exit(0);
				System.out.println("프로그램 종료");
			}
		}

	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String banknum = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		///////////////////////////////////////////////////////
		Account newAccount = new Account(banknum, owner, balance);
		accountArray.add(newAccount);
		//////////////////////////////////////////////////////
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");

		System.out.println("--------------");
		for (Account account:  accountArray) {
			if (account != null) {
				System.out.print(account.getBanknum());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String banknum = scanner.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(banknum);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}


	// 출금하기
	private static void withdraw() {
			System.out.println("--------------");
			System.out.println("출금");
			System.out.println("--------------");
			System.out.print("계좌번호: ");
			String banknum = scanner.nextLine();
			System.out.print("출금액: ");
			int money = Integer.parseInt(scanner.nextLine());
		
			Account account = findAccount(banknum);
			if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 출금이 성공되었습니다.");
			}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (Account acc: accountArray) {
			if (accountArray != null) {
				String dbAno = acc.getBanknum();
				if (dbAno.equals(ano)) {
					account = acc;
					break;
				}
			}
		}
		return account;
	}
}