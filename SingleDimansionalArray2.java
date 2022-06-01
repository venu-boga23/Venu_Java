package Arrays;
import java.util.Scanner;
class SingleArray2{
	String a [] = new String[5];
	Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("Enter 5 Names");
		for(int i=0;i<5;i++) {
			a[i]=sc.next();
		}
	}
	public void readData() {
		System.out.println("My friends Names");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
}
public class SingleDimansionalArray2 {

	public static void main(String[] args) {
		
		SingleArray2 sa2 = new SingleArray2();
		sa2.getData();
		sa2.readData();
	}
}
