package assessment1;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTransaction {
	Scanner scanner;
	ArrayList<Bank> accounts;
	public CollectionTransaction() {
		scanner=new Scanner(System.in);
		accounts = new ArrayList<Bank>();
	}
	
	void addaccount() {
		Bank bank = new Bank();
		bank.takeAccountDetailsFromUser();
		accounts.add(bank);
		/*bank = new Bank();
		bank.takeAccountDetailsFromUser();
		accounts.add(bank);*/
	}
	
public void addAccounts() {
		

		String choice = "No";
		do {
			addaccount();
			
			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
			
		} while (!choice.toLowerCase().equals("no"));
	}

public void printaccount() {
	for (Bank acc : accounts) {
		System.out.println(acc);
		System.out.println("--------------------");
	}
}

void transact() {
	int userChoice = 0;
	do {
		System.out.println("--------------------");
		System.out.println("1. Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Exit..");
		System.out.println("--------------------");
		userChoice  = scanner.nextInt();
		switch (userChoice ) {
		case 1:
		withdraw(userChoice, userChoice);
						
			break;
		case 2:
			deposit(userChoice, userChoice);			
			break;
		
		case 3:
			System.out.println("Exiting.....");
			break;
		default:
			System.out.println("Invalid option.. Try again");
			break;
		}
		
	} while (userChoice!=3);
}
void deposit(double deposit,double balance) {
	try{
	System.out.println("Enter amount to be deposited");
	
	deposit =scanner.nextDouble();
	
	 balance = balance + deposit;
	 System.out.println("deposit status");
	System.out.println("Your Money has been successfully deposited");
	System.out.println("Deposited amount  is"+balance);
}
catch(Exception e){
	
	System.out.println("Some error occured");
	e.printStackTrace();
}}

void withdraw(double withdraw,float balance) {
	System.out.println("Withdraw status");
	System.out.println("Enter the amount to withdraw");
	withdraw=scanner.nextDouble();
	if((withdraw<balance))
	System.out.println("Please collect your money");
	else
		System.out.println("You do not have sufficient balance");
	
	System.out.println("                                   ");
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTransaction ct = new CollectionTransaction();
		ct.addAccounts();
		ct.printaccount();
		ct.transact();
	}

}
