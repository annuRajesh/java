package lab21;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		Scanner sc=new Scanner(System.in);
		try {
			do {
				
			System.out.println("Enter the number 1: ");
			int num1=sc.nextInt();
			System.out.println("Enter the number 2: ");
			int num2=sc.nextInt();
			System.out.println("Result: "+num1/num2);
			System.out.println("End of operation");
			System.out.println("do you want to continue(y/n)");
			 n=sc.next();
			
			}
			 while(n.equalsIgnoreCase("y"));
			
		
			
		}
			catch(ArithmeticException e) {
				System.out.println("You cannot divide a number by 0");
			}
		finally {
			System.out.println("End of Operation");
			
		}
		sc.close();
		
		

	}

}
