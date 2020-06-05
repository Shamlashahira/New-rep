package myBank;
import java.util.Scanner;
public class SavingsAccount extends Account{
	
	Scanner s = new Scanner(System.in);
	
	
	boolean CheckAccountType() {
		boolean result = true;
		
		 
			if(balance>=5000&&balance<10000)
				
			{
				result = false;
				
			}
		
		return result;
	}
	void checkAccount() {
		System.out.println("Type of Account");
		
			if(CheckAccountType()==true)
				System.out.println("this is current account");
			else
				System.out.println("this is savings account");
			System.out.println("                         ");
			System.out.println("                         ");
	}			
			
	
	/*void Transaction2() {
		 int n = scanner.nextInt();
		 while(true)
	        {
			 System.out.println("Choose 1 for Withdraw");
			 System.out.println("Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance");
       switch(n)
       {
       case 1:
      
      System.out.println("enter the withraw anount");
       withdraw = scanner.nextFloat();
       if(balance >= withdraw)
       {
           balance = balance - withdraw;
           System.out.println("Please collect your money");
       }
       else {
      	 System.out.println("you dont have sufficient balance");
       }
       break;
       case 2:
      	
      	 System.out.println("enter the deposit amount");
            deposit = scanner.nextFloat();
            balance = balance + deposit;
            System.out.println("Your Money has been successfully depsited");
      break;
       case 3:
      	 System.exit(0);
	
	}
	        }


}*/

}
