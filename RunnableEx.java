package MultiThreading;
class DemoEx implements Runnable{
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread is running..."+Thread.currentThread().getName()+
						" its priority "+Thread.currentThread().getPriority());
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class RunnableEx {

	public static void main(String[] args) {
		DemoEx de = new DemoEx();
		Thread t = new Thread(de);
		t.setName("T1");
		t.start();
		t.setPriority(8);
		DemoEx de2 = new DemoEx();
		Thread t2 = new Thread(de2);
		t2.setName("T2");
		t2.start();
		t.setPriority(Thread.MIN_PRIORITY);
		
	}
}
