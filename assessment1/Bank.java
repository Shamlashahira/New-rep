//3) Create the Bank Class
//It will contain the 
//collection of account
//Collection of transactions
//Methods
//addAccounts
//doTransaction
//printAccounts
//printTransactions

package assessment1;

import java.util.Scanner;

public class Bank implements Comparable<Bank> {
Scanner scanner;
private  String account_number,name,password,phone ;
Double balance;
Bank(){
	scanner= new Scanner(System.in);
}

public String getAccount_number() {
	return account_number;
}

public void setAccount_number(String account_number) {
	this.account_number = account_number;
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

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

Bank(String account_number ,String name ,String password, String phone ,double balance){
	this.account_number=account_number;
	this.name=name;
	this.password=password;
	this.phone=phone;
	this.balance=balance;
}

void takeAccountDetailsFromUser() {
	System.out.println("Enter the Account number");
	account_number=scanner.nextLine();
	System.out.println("Enter Name");
	name=scanner.nextLine();
	System.out.println("Enter password");
	password=scanner.nextLine();
	System.out.println("Enter phone");
	phone=scanner.nextLine();
	System.out.println("Enter Account balance");
	balance=scanner.nextDouble();

}

@Override
public String toString() {
	String data = "Account_number is  : "+account_number.replaceAll("\\d(?=\\d{2})", "*")+
			"\nAccounters name is :"+name+
			"\npassword is "+password.replaceAll("^[a-zA-Z0-9_]$", "***")+
			"\nAccounters phone is :"+phone+
			"\n balance is "+balance;
	return data;
}

/*public boolean equals(Object obj) {
	if(this.toString().contentEquals(obj.toString()))
		return true;
	else
		return false;*/


@Override
public int compareTo(Bank o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());
}

public void populateAccounts(Transaction tObj) {
	// TODO Auto-generated method stub
	
}

	
}