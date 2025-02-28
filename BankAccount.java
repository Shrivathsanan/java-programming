import java.util.*;

class BankAccount{
	static long accountNumber;
	static String accountHolder;
	static double balance;
	static int amount;
	
	BankAccount(long accountNumber,String accountHolder){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=0.0;
		
		System.out.println("Account Number "+ accountNumber);
		System.out.println("Account Holder "+accountHolder);
		System.out.println("balance "+balance);
	}
	
	BankAccount(long accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
		
		System.out.println("Account Number "+ accountNumber);
		System.out.println("Account Holder "+accountHolder);
		System.out.println("balance "+balance);
	}
	
	void deposit(int amount) {
		System.out.println("Depoiting " + amount +"...");
		balance = amount + balance;
		System.out.println("New balance: "+ balance);
	}
	void withdraw(int amount) {
		System.out.println("Withdrwing " + amount +"...");
		if(balance>amount) {
			balance = balance- amount;
			System.out.println("New balance: "+ balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	void displayAccountInfo() {
		System.out.println("Account Number "+ accountNumber);
		System.out.println("Account Holder "+accountHolder);
		System.out.println("balance "+balance);
	}
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		accountNumber=c.nextLong();
		System.out.println("Enter the account holder: ");
		accountHolder=c.next();
		System.out.println("Enter the amount: ");
		amount=c.nextInt();
		BankAccount obj = new BankAccount(accountNumber,accountHolder);
		obj.deposit(amount);
		System.out.println("\n Enter the account number: ");
		accountNumber=c.nextLong();
		System.out.println("Enter the account holder: ");
		accountHolder=c.next();
		System.out.println("Enter the account balance: ");
		balance=c.nextDouble();
		System.out.println("Enter the amount: ");
		amount=c.nextInt();
		BankAccount obj1=new BankAccount(accountNumber,accountHolder,balance);
		obj1.withdraw(amount);
	}
}