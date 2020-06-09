package day10assign;

public class Account {

	 int accNum;
	 String name,type;
	
	Account(){
		
	}
	Account(int id,String name,String type){
		this.accNum = id;
		this.name = name;
		this.type = type;
	}
	
	
	@Override
	public String toString() {
	String data = "Id : "+accNum+"\nName : "+name+"\nType : "+type;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account app1 = new Account(001,"Somu","Savingaccount");
		Account app2= new Account(002,"Ramu","Currentacount");
		System.out.println(app1);
		System.out.println(app2);
			
		if(app1.equals(app2))
			System.out.println("Both have same details");
		else
			System.out.println("Both have different details");
	}
	}


