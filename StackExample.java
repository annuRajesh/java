//Stack implementation using JAVA   By Annu Rajesh123  14/01/2022
package javapractice;

import java.util.Scanner;

class Stack{
	int c;
	int item;
	int n;
	 int tos=-1;
	private int[] stack=new int[10];
	Scanner sc=new Scanner(System.in);
	
	void push() {
		System.out.println("Enter the element to push: ");
		item=sc.nextInt();
		
		if(tos==9) {
			System.out.println("Overflow");
		}
		else
		{
			tos++;
			stack[tos]=item;
			
		}
	}
	void pop() {
		if(tos<0) {
			System.out.println("Underflow");
			
		}
		else {
			int m;
			m= stack[tos];
			tos--;
			System.out.println("Popped item is: "+m);
		}
	}
	void peek() {
		System.out.println("top element is: "+stack[tos]);
	}
	void display() {
		for(int i=tos;i>=0;i--) {
			System.out.println(stack[i]+"\n");
			if(stack[i]==0) {
				break;
			}
		}
	}
}

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ob=new Stack();
		Scanner m=new Scanner(System.in);
		
		
		do {
			System.out.println("\n1.PUSh\t2.POP\t3.PEEk\t4.DISPLAY");
			System.out.println("------------------------------------");
			System.out.println("Enter the choice: ");
			ob.n=m.nextInt();
			switch(ob.n)
			{
			case 1:ob.push();
			
			break;
			case 2:ob.pop();
			break;
			case 3:ob.peek();
			break;
			case 4:ob.display();
			
					break;
			case 5:
				default:
					break;
			}
			
		
		
		}
		while(ob.n!=5);
	
		
m.close();
	}

}
