package banking;

public class CurrentAccount extends Account {
	//override to perform
		@Override
		boolean transact(Account another,String type,double amount) {
			if(type.equalsIgnoreCase("1"))//withdrawal
			{
				if((another.checkBalance()-amount)>1000.00) {
					another.setBalance(another.checkBalance()-amount);
					System.out.println("Withdrawal successful.\nThe available balance is "+another.checkBalance());
				}
				else{
					System.out.println("Withdrawal not possible. Insufficient Balance");
				}
			}
			else if(type.equalsIgnoreCase("2"))//deposit
			{
				another.setBalance(amount+another.checkBalance());
				System.out.println("Deposit success...!!!\nThe available balance is "+another.checkBalance());

			}else
				System.out.println("Invalid choice");
			
				return true;
				
		}
}
	