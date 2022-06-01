package Arrays;
import java.util.Scanner;
/*Diagonal Matrix Array
1 0 0 
0 5 0 
0 0 9 
 */
class DiaMatrixArray{
	int n[][]=new int[3][3];
	int i,j;
	Scanner sc= new Scanner(System.in);
	public void getData() {
		System.out.println("Enter Matrix Elements");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
			n[i][j]=sc.nextInt();
		}
		}
	}
	public void readData() {
		System.out.println("Diagonal Matrix Array");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i==j) {
					System.out.print(n[i][j]+" ");
				}else{
					n[i][j]=0;
					System.out.print(n[i][j]+" ");
				}
			}System.out.println();
		}
	}
}
public class DiagonalMatrixArray {

	public static void main(String[] args) {
		 DiaMatrixArray dma = new  DiaMatrixArray();
		 dma.getData();
		 dma.readData();
	}
}
