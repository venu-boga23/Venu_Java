package MultiThreading;
class ThreadDemo extends Thread{
	//run() is abstract method of runnable interface.
	public void run() {
		try {
		for(int i=1;i<5;i++) {
			sleep(1000);
			System.out.println("Thread is running..."+Thread.currentThread().getName());
		}
		}catch (Exception e) {
			
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.setName("T1");
		td.start();
		ThreadDemo td2 = new ThreadDemo();
		td2.setName("T2");
		td2.start();
	}
}
