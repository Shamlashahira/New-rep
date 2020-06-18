package myBank;

import java.util.Scanner;

public class Account {

	public String name,type;
	private String number;
	double balance,withdraw,deposit;
	Scanner scanner;
	
	Account(){
		
		scanner = new Scanner(System.in);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void printAccountData() {
		System.out.println("Account name "+name);
		System.out.println("Account number "+number);
		System.out.println("Account balance "+balance);
		System.out.println("Account type "+type);
	}
	public void getAccountDataFromUser() {
		System.out.println("Please enter the Account number ");
		number = scanner.nextLine();
		System.out.println("Please enter the Accounter Name ");
		name = scanner.nextLine();
		System.out.println("Please enter the Account balance ");
		balance = scanner.nextFloat();
		scanner.nextLine();
		/*System.out.println("Please enter the Account type ");
		type = scanner.nextLine();*/
	}
	
//	void transact(amount,action)
//	{
//		
//	}
}
