package Arrays;
import java.util.Scanner;
/*Lover Triangle Matrix
1 0 0 
4 5 0 
7 8 9 
 */
class LowerTri{
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	int i,j;
	public void getData(){
		System.out.println("Enter matrix elements");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void readData() {
		System.out.println("Lover Triangle Matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i>=j) {
					System.out.print(a[i][j]+" ");
				}else {
					a[i][j]=0;
					System.out.print(a[i][j]+" ");
				}
			}System.out.println();
		}
	}
}
public class LowerTriangle {

	public static void main(String[] args) {
		LowerTri lt = new LowerTri();
		lt.getData();
		lt.readData();
	}
}
