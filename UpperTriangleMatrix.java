package Arrays;
import java.util.Scanner;
/*
Upper Triangle Matrix
1 2 3 
0 5 6 
0 0 9 
 */
class UpperTri{
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
		System.out.println("Upper Triangle Matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i<=j) {
					System.out.print(a[i][j]+" ");
				}else {
					a[i][j]=0;
					System.out.print(a[i][j]+" ");
				}
			}System.out.println();
		}
	}
}
public class UpperTriangleMatrix {

	public static void main(String[] args) {
		UpperTri ut = new UpperTri();
		ut.getData();
		ut.readData();
	}
}
