package Arguments;
class Cal{
	int c;
	public int addition(int a,int b) {
		c=a+b;
		return c;
	}
	public void show() {
		System.out.println(c);
	}
}
public class ArgumentsWithReturntype {
	public static void main(String[] args) {
	Cal cl = new Cal();
	cl.addition(50,50);
	cl.show();
    }
}
