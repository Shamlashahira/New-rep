//2) Create a Class Transaction with
//transaction_number - int
//fromAccount - Account
//toAccount - Account
//amount - Double
//type - String(Should be either Cash/Transfer)
//status - String
//Methods
//toString()
//transact()- This method will do the transaction. It will take the details for the transaction and do the transaction
//The Amount should be available in the fromAccoun
//from Gayathri Mahadevan to All Participants:
package assessment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaction{
	private int transaction_number;
	Account fromAccount, toAccount;
	double amount;
	String type, status;
	Scanner scanner;
	ArrayList<Account> accountList;
	Transaction(){
		scanner = new Scanner(System.in);
		accountList = new ArrayList<Account>();
	}
	
	
	
	  @Override
	    public String toString()
		{
		  String toAcc = "";
		  if(toAccount != null)
		  {
			  toAcc = "\nTo Account :"+toAccount.getAccount_number().replaceAll("\\d(?=\\d{2})", "*");
		  }
			return "\nTransaction number :"+transaction_number+
					"\nFrom Account :"+fromAccount.getAccount_number().replaceAll("\\d(?=\\d{2})", "*")+
					toAcc+
					"\nType :"+type+
					"\nAmount :"+amount+
					"\nStatus :"+status;
		}
	 void transact(Bank bObj) {
		 
	 String userChoice = "no";
		 do {
		 System.out.println("Enter the transaction number");
		 transaction_number = scanner.nextInt();
		 scanner.nextLine();
		 System.out.println("Enter the type of transfer...Cash/Transfer?");
		 type = scanner.next();
		 System.out.println("Enter the amount ");
		 amount=scanner.nextDouble();
		 scanner.nextLine();
		 System.out.println("Enter the From Account number");
		 String from = scanner.next();
		 Account fromAcc = findAccountByNo(from);		 
		 Account toAcc = null;
		if( checkMinBal(fromAcc, amount)) {
		 if(type.equalsIgnoreCase("cash")) {
			 fromAcc.setBalance(fromAcc.getBalance()-amount);
			 System.out.println("Amount debited successfully from "+from.replaceAll("\\d(?=\\d{2})", "*"));
			 System.out.println("The remaining balance is "+fromAcc.getBalance());
			 
		 }else if(type.equalsIgnoreCase("transfer")) {

			 System.out.println("Enter the To Account");
			 String to = scanner.next();
			 toAcc = findAccountByNo(to);
			 fromAcc.setBalance(fromAcc.getBalance()-amount);
			 toAcc.setBalance(toAcc.getBalance()+amount);
			 System.out.println("Amount debited from "+from.replaceAll("\\d(?=\\d{2})", "*"));
			 System.out.println("The remaining balance is "+fromAcc.getBalance());
			 System.out.println("Amount credited to "+to.replaceAll("\\d(?=\\d{2})", "*"));
			 System.out.println("The remaining balance is "+toAcc.getBalance());
		 }
		 System.out.println("Transaction completed successfully");
		 Transaction transaction = new Transaction();
		 transaction.setFromAccount(fromAcc);
		 transaction.setTransaction_number(transaction_number);
		 transaction.setAmount(amount);
		 transaction.setToAccount(toAccount);
		 transaction.setStatus("complete");
		 transaction.setType(type);
		 
		 bObj.populateAccounts(transaction);
		}
		 System.out.println("Do u want to do another transaction...yes/no??");
			userChoice = scanner.next();
		 }while(userChoice.equalsIgnoreCase("yes"));
	 }
	 public void setTransaction_number(int transaction_number) {
		this.transaction_number = transaction_number;
	}


	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}


	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public ArrayList<Account> getAccountList() {
		return accountList;
	}


	boolean checkMinBal(Account from, double amt){
		 if(from.getBalance()>amt)
			 return true;
		 System.out.println("Insufficient balance!!!");
		 return false;
	 }
	Account findAccountByNo(String no){
		 boolean accExists = false;
		 do {
			 
		 for(Account acc:accountList) {
			 if(acc.getAccount_number().equalsIgnoreCase(no)) {
				 accExists = true; 
				 return acc;
			 }
		 }
		 }while(accExists = false);
		return null;
	} 
	void populateAccounts(Account obj){
		accountList.add(obj);
	}
	 
	 public static void main(String[] args) {
		 	Transaction object = new Transaction();
			Account from = new Account();
			from.takeAccountDetailsFromUser();
			object.transact(null); 
		}

}