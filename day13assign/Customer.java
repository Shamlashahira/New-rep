package day13assign;

import java.util.Scanner;


public class Customer {

	private String name,phone;
	private int id,age;
	private Scanner scanner;
	
	
	Customer(){
		scanner = new Scanner(System.in);
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
void getCustomerDetails() {
		
		System.out.println("Please enter the Customer id");
		id = scanner.nextInt();
		scanner.nextLine();//flush panradhuku to move to next string
		System.out.println("Please enter the Customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the Customer phone");
		phone = scanner.nextLine();
		System.out.println("Please enter the Customer age");
		age = scanner.nextInt();
	}
@Override
	
public String toString() {
	
	return "Customer Id: " +id +"\n "+"Customer Name: "+name+"\n"+"Customer Phone: "+phone +"\n"+"Customer Age "+age;
}
@Override

public boolean equals(Object obj) {
	
	Customer c2 = (Customer)obj;
	Customer c1 = this;
	if(c1.getName().equals(c2.getName()) && c1.getPhone().equals(c2.getPhone()))
		return true;
	else
		return false;
}
	
}
