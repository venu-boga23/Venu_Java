package Arrays;
import java.util.Scanner;
class SingleArray{
	int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	public void getData() {
		System.out.println("Enter Single array elements");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
	}
	public void readData() {
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+", ");
		}
	}
}
public class SingleDimansionalArray {

	public static void main(String[] args) {
		SingleArray sa = new SingleArray();
		sa.getData();
		sa.readData();
	}
}
