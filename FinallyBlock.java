package ExceptionHandling;
class Finaly{
	int x=100,b=0,c;
	int a [] = new int[3];	
	public void exceptionEx() {
		try {
			System.out.println(a[5]);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				c=x/b;
				System.out.println(c);
			} catch (Exception e2) {
				System.out.println(e2);
			}try {
			String name = "VENU";
			System.out.println(name.charAt(6));
			}
			catch (Exception e3) {
             System.out.println(e3);
			}
			System.out.println("Finally Block");
		}
	}
}
public class FinallyBlock {

	public static void main(String[] args) {
		Finaly f = new Finaly();
		f.exceptionEx();
	}
}
