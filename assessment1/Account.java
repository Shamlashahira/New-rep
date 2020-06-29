//1) Create a Account class with 
//Private Members (Getter and setters are must)
//account_number - String
//name - String
//password - String
//phone - String
//balance - Double
//Methods
//toString()
//equals()
//takeAccountDetailsFromUser()
//The class should be sortable(Hint-: Comparable) 
//The class should have default and parameterized constructor
//While printing the account class details the Account number should be partially masked
//example - 1234567890 should be printed as 12XXXXXX90
//Password should be completly masked.
//from Gayathri Mahadevan to All Participants:

package assessment1;

import java.util.Scanner;


public class Account {
	
	private String name,password,phone,account_number;
	private double balance;

	Scanner scanner;
	
	
	Account(){
		scanner = new Scanner(System.in);
	}

	Account(String name,String password,String phone,String account_number,double balance){
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.account_number = account_number;
		this.balance = balance;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAccount_number() {
		return account_number;
	}


	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	void takeAccountDetailsFromUser() {
		System.out.println("Please enter the Account name");
		name = scanner.nextLine();
		System.out.println("Please enter the Account password");
		password = scanner.nextLine();
		System.out.println("Please enter the Account phone");
		phone = scanner.nextLine();
		System.out.println("Please enter the Account number");
		account_number = scanner.nextLine();
		System.out.println("Please enter the Account balance");
		balance = scanner.nextDouble();
	}
	
	void printAccountDetails() {
		
		System.out.println("Account name "+name);
		System.out.println("Password "+password.replaceAll("^[a-zA-Z0-9_]*$", "**********"));
		System.out.println("Phone "+phone);
		System.out.println("Account number "+account_number.replaceFirst("[0-9]", "***"));
		System.out.println("Account balance "+balance);
		System.out.println("------------------------------------");
	}
	
	@Override
	public String toString() {
	String data = "Name : "+name+"\nPassword : "+password.replaceAll("^[a-zA-Z0-9_]*$", "**********")+"\nAccnumber : "+account_number+"\nPhone : "+phone+"\nBalance : "+balance;
	return data;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account other = (Account)obj;
		if(this.account_number == other.account_number)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account account = new Account();
		account.takeAccountDetailsFromUser();
		account.printAccountDetails();
	}
}
