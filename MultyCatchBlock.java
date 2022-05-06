package ExceptionHandling;
class MultyCatch{
	int x = 100;
	int y = 10;
	int z;
	String name = "VENU";
	public void exceptionCatch() {
		try {
			z=x/y;
			System.out.println(z);
			System.out.println(name.charAt(6));
		} catch (ArithmeticException a) {
		  System.out.println(a);
		}catch (StringIndexOutOfBoundsException si) {
			System.out.println(si.getMessage());
		}
	}
}
public class MultyCatchBlock {
	public static void main(String[] args) {
		MultyCatch mc = new MultyCatch();
		mc.exceptionCatch();
	}
}
