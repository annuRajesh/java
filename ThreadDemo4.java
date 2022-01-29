package moddule4;
class Hello extends Thread{
	Thread t;
	Hello(){
		t=new Thread(this,"Hello");
	}
	synchronized public void run() {
		System.out.println(t);
		System.out.println("Priority: "+t.getPriority());
		System.out.println("Name: "+t.getName());
		for(int i=0;i<7;i++) {
			System.out.println("Child thread"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Child thread exiting");
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello();
		Thread t2=new Thread(h);
		t2.start();
		System.out.println(t2);
		for(int i=0;i<8;i++) {
			System.out.println("Main thread: "+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Main thread exiting");
		
		System.out.println(h);

	}

}
