package day9assign;

import java.util.Scanner;


public class Arithmetic {

		int num1,num2,add,sub,mul;
		int ch;
		double div;
		Scanner scanner;
		
		Arithmetic(){
			scanner = new Scanner(System.in);
			
		}
		
		Arithmetic(int num1,int num2, int add, int sub, int mul, double div){
			scanner = new Scanner(System.in);
			
		}
		
	void getInputFromUser() {
			
			System.out.println("Enter First number");
			num1 = scanner.nextInt();
			System.out.println("Enter Second number");
			num2 = scanner.nextInt();
			
			
		}

	void getArithmaticCalculation() {
		while(true) {
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter 5 for Exit");
	     ch = scanner.nextInt();
		
		switch (ch) {
		case 1:
			add = num1+num2;
			System.out.println(add);
			break;
			
		case 2:
			sub = num1-num2;
			System.out.println(sub);
			break;
		
		case 3:
			mul = num1*num2;
			System.out.println(mul);
			break;
			
		case 4:
			div = num1/num2;
			System.out.println(div);
			break;

		case 5:
			
			System.out.println("Operation over");
			System.exit(0);
			
		
		}
		
		}
			
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmetic arithmeticCalculation = new Arithmetic();
		arithmeticCalculation.getInputFromUser();
		arithmeticCalculation.getArithmaticCalculation();
	}

}
