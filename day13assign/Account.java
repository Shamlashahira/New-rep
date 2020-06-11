package day13assign;


public class Account {

	int accNum;
	 String name,balance,phone;
	
	Account(){
		
	}
	Account(int id,String name,String balance,String phone){
		this.accNum = id;
		this.name = name;
		this.balance = balance;
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
	String data = "Id : "+accNum+"\nName : "+name +"\nPhone : "+phone+"\nbalance : "+balance;
	return data;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account other = (Account)obj;
		if(this.accNum == other.accNum)
			return true;
		else
			return false;
	}
	
}
