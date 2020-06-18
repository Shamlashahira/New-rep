package day13assign;

import java.util.ArrayList;

import day13.CollectionExample;
import day13.Movie;

public class CollectionAccounts {

	@SuppressWarnings("rawtypes")
	ArrayList myArray;
	
	@SuppressWarnings("rawtypes")
	CollectionAccounts(){
		
		myArray = new ArrayList();
	}
	
	@SuppressWarnings("unchecked")
void addMembers() {
	
	
	myArray.add(new Account(1054,"Sha","9445089607","500.0"));
	myArray.add(new Account(1054,"Sana","8015191534","450.0"));
	myArray.add(new Account(1054,"Shahira","9442396963","1500.0"));
	
	
	}
	
	void printCollection() {
		for(int i=0;i<myArray.size();i++) {
			System.out.println(myArray.get(i));
		}
	}
	
//	void sumCollection() {
//		
//		double sum = 0;
//		for(int i=0;i<myArray.size();i++) {
//			sum = sum +Double.parseDouble(myArray.get(i).toString());
//			System.out.println("the sum till now is"+sum);
//		}
//		System.out.println("the final sum is"+sum);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionAccounts ce = new CollectionAccounts();
		ce.addMembers();
		ce.printCollection();
//		ce.sumCollection();
	}

}
