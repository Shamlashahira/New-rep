package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    ArrayList<User> LoginDetails;
    Scanner scanner;
    String Name , Password ;
    Login(){
           scanner = new Scanner(System.in);
           LoginDetails = new ArrayList<User>();
    }
   void userOperation() {
	   
	          int userChoice = 0;
	          String transOpt=null, addChoice=null;
	          
	        
	              System.out.println("Please select a number \r\n" +
	                                  "1) Login");
	                
	          
	                 
	                
	          Scanner input = new Scanner(System.in);
	          String user,pass;
	          System.out.println("Enter your name");
	          	user = input.nextLine();
	          	System.out.println("ENter the password");
	          	pass = input.nextLine();
	          	
	          	if(user.contentEquals(null) && (pass.equals(null))) {
	          		System.out.println("Welcome");
	          		
	          	}else {
	          		System.out.println("Incorrect");
	          	}
                                      
	      
   }
	                                     
	    
	public static void main(String[] args) {
		Login ll= new Login();
	}
}
//Account sObj = new SavingsAccount();
//sObj.takeAccountDetails();