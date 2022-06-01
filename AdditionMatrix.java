package Arrays;
import java.util.Scanner;
class AddMatrix{
	int x[][] = new int [3][3];
	int y[][] = new int [3][3];
	int z[][] = new int [3][3];
	Scanner sc = new Scanner(System.in);
	int i,j,k;
	public void getData() {
		System.out.println("Enter First Matrix Array");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix Array");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				y[i][j]=sc.nextInt();
			}
	}
  }
	public void readData() {
		System.out.println("Addition of Matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				for(k=0;k<3;k++) {
				z[i][j] = x[i][k]+y[k][j];
				}
				System.out.print(z[i][j]+" ");
			}System.out.println();
		}
	}  
}
public class AdditionMatrix {

	public static void main(String[] args) {
		AddMatrix am = new AddMatrix();
		am.getData();
		am.readData();
	}
}

