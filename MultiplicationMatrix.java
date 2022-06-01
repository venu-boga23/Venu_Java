package Arrays;
import java.util.Scanner;
class MultiplicationArray{
	int a[][] = new int [3][3];
	int b[][] = new int [3][3];
	int c[][] = new int [3][3];
	int i,j,k;
	Scanner sc = new Scanner(System.in);
	public void getData() {
		System.out.println("Enter First Elements");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Elements");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				b[i][j]=sc.nextInt();
			}
		}
	}
	public void readData() {
		System.out.println("Multiplication Matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				for(k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
					
				}System.out.print(c[i][j]+" ");
			}System.out.println();
		}
	}
}
public class MultiplicationMatrix {

	public static void main(String[] args) {
		MultiplicationArray ma = new MultiplicationArray();
		ma.getData();
		ma.readData();
	}
}
