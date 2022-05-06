package MultiThreading;
class Print1 implements Runnable{
	
	public synchronized void run(){
		for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" Printin...");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		}
}
public class Synchronization {

	public static void main(String[] args) {
		 
		Print1 p1 = new Print1();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		Thread t3 = new Thread(p1);
		t1.setName("Document1");
		t2.setName("Document2");
		t3.setName("Document3");
		t1.start();
		t2.start();
		t3.start();	
	}
}
