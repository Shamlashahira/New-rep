package myBank;

public class CurrentAccount extends Account{

	
public void AccountType() {
		
		if(balance>=10000) 
			System.out.println("This is CurrentAccount");
			else
				System.out.println("This is savings Account");
		}
	/*void Transaction2() {
		 int n = scanner.nextInt();
        switch(n)
        {
        case 1:
       Float getWithdraw;
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
       	 Float getDeposit;
             deposit = scanner.nextFloat();
             balance = balance + deposit;
             System.out.println("Your Money has been successfully deposited");
       break;
        case 3:
       	 System.exit(0);
        }*/
}

