package MultiThreading;
import java.util.Scanner;

class Demo extends Thread {
	public void run() {
		
		try {
		System.out.println("banking activity starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter acc no");
		int accno = sc.nextInt();
		
		System.out.println("enter password");
		
		int pwd  = sc.nextInt();
		
		
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("collect money");
	}
	
}

class Demo2 extends Thread{
	public void run() {
		try {
			System.out.println("balance printing");
			
			for(int i = 1; i<=5;i++) {
				
				System.out.println(i);
				Thread.sleep(3000);
			}
			
			System.out.println("balance ");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}

class Demo3 extends Thread{
	
	public void run() {
		try {
			System.out.println("print letters");
			for(int i=65;i<=70;i++) {
				System.out.println((char)i);
				Thread.sleep(3000);
			}
			System.out.println("letters printed");
		} catch (Exception e) {
			System.out.println("some problrm occured");

			// TODO: handle exception
		}
		
	}
	
}

public class MTEx {
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d.start();
		
		d2.start();
		d3.start();
	}
}