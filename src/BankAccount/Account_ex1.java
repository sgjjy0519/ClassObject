// Getter and Setter 이용, 상수 선언
package BankAccount;

public class Account_ex1 {
	
	public static final int MIN_BALANCE = 0;               // 상수 선언
	public static final int MAX_BALANCE = 1000000;		   // 상수 선언
	
	private int balance;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		// if문이 false가 되야 정상
		if((balance < Account_ex1.MIN_BALANCE) || (balance > Account_ex1.MAX_BALANCE)){
			return;
		}
		this.balance = balance;
	}

	
}
