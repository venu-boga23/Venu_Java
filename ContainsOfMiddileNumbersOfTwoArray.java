package Arrays;
import java.util.Scanner;

public class ContainsOfMiddileNumbersOfTwoArray {
public static void main(String[] args) {
	int n=3;
	int [] a = new int [n];
	int [] b = new int [n];
	int [] c = new int [2];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Array values");
	for (int i = 0; i<n;i++) {
		a[i]= sc.nextInt();
	}
	System.out.println("Enter 2nd Array");
	for (int i = 0; i<n;i++) {
		b[i]= sc.nextInt();
		
	}
	System.out.println("Contain middile elements");

	for(int i=0;i<2;i++) {
		if(i==0) {
			c[i] = a[n/2];
		}else if (i==1) {
			c[i]=b[n/2];
		}
	}for(int i = 0;i<2;i++) {
	System.out.print(c[i]+",");
	}
  }
}
