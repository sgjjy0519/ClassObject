package BankAccount;

public class AccountExample_ex1 {

	public static void main(String[] args) {
		Account_ex1 account = new Account_ex1();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-1000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000); // MAX_BALANCE 가
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
