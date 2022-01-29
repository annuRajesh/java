package moddule4;
class NewThread2 implements Runnable{
	 String name;
	 Thread t;
	 NewThread2(String name){
		 this.name=name;
		 t=new Thread(this,name);
		 System.out.println("New thread: "+t);
		 
	 }
	 public void run() {
		 try {
			 System.out.println(t.getName());
			 for(int i=5;i>0;i--) {
				 System.out.println(name+" : "+i);
				 Thread.sleep(1000);
				 
			 }
		 }
		 catch(Exception e) {
			 
		 }
		 System.out.println(name+" Exiting");
	 }
}

public class ThreadDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread2 n1=new NewThread2("One");
		NewThread2 n2=new NewThread2("Two");
		NewThread2 n3=new NewThread2("Three");
		n1.t.start();
		n2.t.start();
		n3.t.start();
		System.out.println("Thread 1 is alive: "+n1.t.isAlive());
		System.out.println("Thread 2 is alive: "+n2.t.isAlive());
		System.out.println("Thread 3 is alive: "+n3.t.isAlive());
		try {
			System.out.println("Waiting for threads to finish.");
			n1.t.join();
			n2.t.join();
			n3.t.join(1000);
		}
		catch(Exception e) {
			
		}
		System.out.println("Thread 1 is alive: "+n1.t.isAlive());
		System.out.println("Thread 2 is alive: "+n2.t.isAlive());
		System.out.println("Thread 3 is alive: "+n3.t.isAlive());
		System.out.println("Main thread is exiting");

	}

}
