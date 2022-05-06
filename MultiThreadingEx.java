package MultiThreading;
class Print extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		try {
			sleep(1000);
			System.out.println(Thread.currentThread().getName()+" Printing...");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
}
class Scanning extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		try {
			sleep(1000);
			System.out.println(Thread.currentThread().getName()+" Scanning...");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
}
class Download extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		try {
			sleep(1000);
			System.out.println(Thread.currentThread().getName()+" Downloading...");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
}
public class MultiThreadingEx {

	public static void main(String[] args) {
		Print p = new Print();
		Scanning sc = new Scanning();
		Download d = new Download();
		p.setName("Document1");
		sc.setName("Document2");
		d.setName("Document3");
		
		p.start();
		sc.start();
		d.start();
	}
}
