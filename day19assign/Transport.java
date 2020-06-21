package day19assign;

import java.util.ArrayList;
import java.util.Scanner;

public class Transport extends Employee{
Scanner scanner;
ArrayList<Transport> trans;
 Transport(){
	scanner = new Scanner(System.in);
	trans = new ArrayList<Transport>();
}
void ChooseActionForUser() {
	int userChoice = 0;
	do {
		System.out.println("--------------------");
		System.out.println("1.AddDriver");
		System.out.println("2.AddBus");
		System.out.println("3.AddEmployee");
		System.out.println("4.EditDriverDetails");
		System.out.println("5.EditBusDetails");
		System.out.println("6.DeleteDriver");
		System.out.println("7.DeleteBus");
		System.out.println("8.DeleteEmployee");
		System.out.println("9.AssignDriverForBus");
		System.out.println("10.AssignBusForEmployee");
		System.out.println("11.Exit");
		System.out.println("--------------------");
		userChoice  = scanner.nextInt();
		switch (userChoice ) {
		case 1:	
			addDriverAccount();
			break;
		case 2:	
			addBusAccount();
			break;
		case 3:	
			addEmployeeAccounts();
			break;
		case 4:	
			editDriver();
			break;
		case 5:
			editbus();
			break;
		case 6:	
			deletedriverDetails();
			break;
		case 7:	
			deleteBusDetails();
			break;
		case 8:
			deleteEmployeeDetails();
			break;
		case 9:	
			getBusDetails();
			break;
		case 10:
			getEmployeeDetailsfromUser();
			break;	
		case 11:
			System.out.println("exiting.....");
			break;
		default:
			System.out.println("Invalid option.. Try again");
			break;
		}
		
	} while (userChoice!=11);
	
}
public static void main(String[] args) {
	Transport transport = new Transport();
	
	transport.ChooseActionForUser();
	
}

}