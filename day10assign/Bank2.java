package day10assign;

import java.util.ArrayList;

public class Bank2 {

	@Override
	 public boolean equals(Object tmp) {
			if(tmp.toString().equals(tmp.toString()))
				return true;
			else
				return false;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Bank1> al= new ArrayList<Bank1>();
        al.add(new Bank1("Sha","555",  102));
        al.add(new Bank1("Sana","444",  101));
     
       for (Bank1 tmp: al){
            System.out.println(tmp);
            if(tmp.equals(tmp))
    			System.out.println("");
    		else
    			System.out.println("");
        }
	}

}
