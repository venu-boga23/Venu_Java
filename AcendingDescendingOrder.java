package Arrays;
import java.util.Scanner;
class AceDes{
	int a[] =  new int[5];
	Scanner sc = new Scanner(System.in);
	int i,j,temp;
	public void getData() {
		System.out.println("Enter Array Elements");
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
	}
	public void readData() {
		System.out.println("Descending Order");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(a[i]>a[j]) {
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				}
		}
		for(i=0;i<5;i++) {
	      System.out.println(a[i]);
		}
		System.out.println("Acending Order");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(a[i]<a[j]) {
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}}
		}
		for(i=0;i<5;i++) {
	      System.out.println(a[i]);
		}
	}
}
public class AcendingDescendingOrder {
	public static void main(String[] args) {
		AceDes ad = new AceDes();
		ad.getData();
		ad.readData();
	}
}
