package Arrays;
import java.util.Scanner;
/*Transpose Matrix
1 4 7 
2 5 8 
3 6 9 
*/
class TransMatrix{
	int x[][] = new int [3][3];
	int y[][] = new int [3][3];
	Scanner sc = new Scanner(System.in);
	int i,j;
	public void getData() {
		System.out.println("Enter Matrix Array");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				x[i][j]=sc.nextInt();
		}
	}
  }
	public void readData() {
		System.out.println("Transpose Matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				y[i][j]=x[j][i];
				System.out.print(y[i][j]+" ");
			}System.out.println();
		}
	}
}
public class TransposeMatrix {

	public static void main(String[] args) {
		TransMatrix tm = new TransMatrix();
		tm.getData();
		tm.readData();
	}
}
