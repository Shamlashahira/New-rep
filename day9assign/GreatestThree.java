package day9assign;

import java.util.Scanner;


public class GreatestThree {

	private int num1,num2,num3;
	Scanner scanner;
	
	GreatestThree(){
		scanner = new Scanner(System.in);
		
	}
	
	void getInputFromUser() {
		
	
		System.out.println("Enter value of First number");
		num1 = scanner.nextInt();
		System.out.println("Enter value of Second number");
		num2 = scanner.nextInt();
		System.out.println("Enter value of Third number");
		num3 = scanner.nextInt();
	}
	
	void findGreatestNumber() {
		
		if(num1>num2 && num1>num3) {
			System.out.println("First number is greatest");
		}
		else if(num2>num3) {
			System.out.println("Second number is greatest");
		}
		else if(num3>num1 && num3>num2){
			System.out.println("Third number is greatest");
		}
		else {
			System.out.println("Equal numbers present...Try again");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GreatestThree greatestThree = new GreatestThree();
		greatestThree.getInputFromUser();
		greatestThree.findGreatestNumber();
	}

}
