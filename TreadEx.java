package MultiThreading;
import java.util.Scanner;

public class TreadEx {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("banking activity starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter acc no");
		int accno = sc.nextInt();
		
		System.out.println("enter password");
		
		int pwd  = sc.nextInt();
		
		Thread.sleep(3000);
		
		System.out.println("collect money");
		System.out.println("balance printing");
		
		for(int i = 1; i<=5;i++) {
			
			System.out.println(i);
			Thread.sleep(5000);
		}	
		System.out.println("balance ");	
	}

}


/*
kedharnath, 12:06
package mt;

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
*/