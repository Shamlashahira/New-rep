package day10assign;

public class Acc1 {

	String name,number,type;
	 Float balance;
	 Acc1(){
			number = "123776565";
			name = "Sha";
			type = "saving";
			balance = (float) 1750.0;
		}
	 Acc1(String number,String name,String type,float balance){
			this.number = number;
			this.name = name;
			this.type = type;
			this.balance =balance;
	 }

	@Override
	public String toString() {
		String data = "Number is : "+number+
				"\nName is : "+name+
				"\nType is : "+type+
				"\nbalance is "+balance;
		return data;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account account2 = new Account();
			System.out.println(account2);
		}

		
	}
	


