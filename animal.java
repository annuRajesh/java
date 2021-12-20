package lab21;

import java.util.Scanner;

abstract  class Animal{
	protected int leg;
	protected Animal(int leg) {
		this.leg=leg;
	}
	abstract void eat();
	void walk() {
		System.out.println("This animal has "+leg+" legs.");
	}
}
	class Spider extends Animal{
		
		
		protected Spider(int l) {
			super(8);
			// TODO Auto-generated constructor stub
		}

		void eat() {
			System.out.println("SPIDER");
			System.out.println("spider eats insect");
			
		}
	}
	interface Pet{
		 
		
		 String  getName(); 
		void setName(String name);
		void play();
	}
class Cat extends Animal implements Pet{
		Cat(){
			super(4);
		}
		void eat()
		{
			System.out.println("CAT");
			System.out.println("Cat eat fishes");
		}
		String n;
		public String getName() {
			//System.out.println("This cat's name is "+n);
			return n;
			}
		public void setName(String n) {
			//System.out.println("This cat's name is "+n);
			return;
		}
		public void play() {
			System.out.println("Cat plays in water");
			
		}
		 }
	class Fish extends Animal implements Pet{
		Fish(){
			super(0);
		}
		void eat()
		{
			System.out.println("FISH");
			System.out.println("fish eat plants");
		}
		String n;
		public String getName() {
			//System.out.println("This fish's name is "+n);
			return n;
			}
		public void setName(String n) {
			this.n=n;
			
		}
		public void play() {
			System.out.println("fish plays in water");
			
		}
		 
		
		
	}


public class AnimalDemo {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		Fish f=new Fish();
		Cat c=new Cat();
		Spider s=new Spider(8);
		
		f.eat();
		f.walk();
		
		//f.n="Mimu"
		f.getName();
		f.play();
		f.setName("Mimi");
		System.out.println("This fish's name is "+f.n);
		System.out.println("\n\n ");
		c.eat();
		c.n="Kitty";
		c.getName();
		c.walk();
		c.play();
		c.setName("momo");
		System.out.println("This cat's name is "+c.n);
		System.out.println("\n\n");
			
		s.eat();
		s.walk();
		sc.close();
	}

}
