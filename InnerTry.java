package ExceptionHandling;
class MultyTry{
	public void method() {
		
		try {
			int a = 100,b=0,c;
			c=a/b;
			System.out.println(c);
			try {
				String name ="VENU";
				System.out.println(name.charAt(3));
				try {
					int n[] = new int[3];
					System.out.println(n[5]);
				}catch (ArrayIndexOutOfBoundsException aibe) {
					System.out.println(aibe);
				}
			}
			catch(ArithmeticException am){
				System.out.println(am);
			}
			catch (StringIndexOutOfBoundsException s) {
			     System.out.println(s);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}	
	}
}
public class InnerTry {

	public static void main(String[] args) {
		MultyTry mt = new MultyTry();
		mt.method();
	}
}
