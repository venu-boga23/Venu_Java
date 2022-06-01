package Arrays;
import java.util.Scanner;
class RevArray{
	
	int n[]=new int[5];
	Scanner sc = new Scanner(System.in);
	public void getData() {
		System.out.println("Enter array Elements");
		for(int i=0;i<5;i++) {
			n[i]=sc.nextInt();
		}
	}
	public void readData() {
		System.out.println("Reverse Elements");
		for(int i=4;i>=0;i--) {
			System.out.print(n[i]+", ");
		}
	}
}
public class ReverseArray {

	public static void main(String[] args) {
		RevArray ra = new RevArray();
		ra.getData();
		ra.readData();
	}
}
