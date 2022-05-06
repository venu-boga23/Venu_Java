package Interface;

import java.util.Scanner;
interface Variables{
	
	public void var();
}
class ADDICTION implements Variables{
	int a,b,c;
	ADDICTION(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void var() {
		c=a+b;
		System.out.println("Addiction of "+a+" and "+b+" is "+c+".");
	}
}
 class SUBSTRACTION implements Variables{
	int a,b,c;
	SUBSTRACTION(int a ,int b){
		this.a=a;
		this.b=b;
	}
	public void var() {
		c=a-b;
		System.out.println("Substraction of "+a+" and "+b+" is "+c+".");
	}
}
public class InterfaceEx4 {
	public static void main(String[] args) {
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Multiple Inheritance by using Interface:");
		System.out.println("Enter the Value's of x and y:");
		x=scan.nextInt();
		y=scan.nextInt();
		ADDICTION aa = new ADDICTION(x, y);
		aa.var();
		SUBSTRACTION ss = new SUBSTRACTION(x, y);
		ss.var();
	}
}