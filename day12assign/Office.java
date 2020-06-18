package day12assign;

import java.util.Scanner;

 interface CustomerManager{

	 void solveIssues();
     void approveLoan();
     
 public static void customermanagerMethod() {
	 
		System.out.println("This is the customer interface static method");
	}
 }
 
 interface EmployeeManager{
	 
	 void conductMeeting();
	 void setTarget();
	 
	 public static void employeemanagerMethod() {
			System.out.println("This is the employee interface static method");
		}
 }

abstract class Employee{
	
	int id,id1;
	String name,name1,phone,phone1,type;
	float salary;
	
	Scanner scanner;
	{
	scanner = new Scanner(System.in);
	}
	
	abstract void Details();
	abstract void customerDetails();
}
abstract class customer{
	abstract void Details();
}

class Manager extends Employee implements CustomerManager,EmployeeManager {


	@Override
	public void conductMeeting() {
		
		// TODO Auto-generated method stub
	
		System.out.println("There will be a meeting for all employees at 10:00 am");
		
	}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("Target for the month is 500 units");
		System.out.println("---------------------------------------------------------------------");
	
	}

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Please contact regarding any issues");
	
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Your loan has been approved ");
		System.out.println("---------------------------------------------------------------------");
		
	}

	@Override
	void Details() {
		// TODO Auto-generated method stub
		System.out.println("EMPLOYEE DESIGNATION ");
		System.out.println("----------------------------------");
		System.out.println("Enter Employee id ");
		id=scanner.nextInt();
		  scanner.nextLine();
		System.out.println("Enter Employee name ");
		name=scanner.nextLine();
		System.out.println("Enter Employee phone ");
		phone=scanner.nextLine();
		System.out.println("Enter Employee salary ");
		salary=scanner.nextFloat();
		System.out.println("Employee assigned Designation");
         System.out.println("---------------------------------------");
		
		
		
	}

	@Override
	void customerDetails() {
		// TODO Auto-generated method stub
		System.out.println("CUSTOMER DESIGNATION");
		System.out.println("----------------------------------");
		System.out.println("Enter Customer id ");
		id1=scanner.nextInt();
	    scanner.nextLine();
		System.out.println("Enter Customer name ");
		name1=scanner.nextLine();
		System.out.println("Enter Customer phone ");
		phone1=scanner.nextLine();
		System.out.println("Enter Customer type ");
		type=scanner.nextLine();
		System.out.println("Customer assigned Designation.");
System.out.println("---------------------------------------");
	}

}
public class Office{
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		manager.customerDetails();
		CustomerManager customerManager;
		customerManager=manager;
		customerManager.solveIssues();
		customerManager.approveLoan();
		
		EmployeeManager employeeManager;
		employeeManager=manager;
		manager.Details();
		employeeManager.conductMeeting();
		employeeManager.setTarget();
	}
}

