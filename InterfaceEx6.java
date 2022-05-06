package Interface;
/*interface Bank{
	public int cal();
}*/
class Addition {
	int a,b,c;
	/*public int cal(){
		c=a+b;
		return c;
	}*/
	void read(int a,int b) {
		a=a;
		b=b;
		System.out.println("hello"+(a+b));
	}
}
/*class Multiplication extends Addition implements Bank{
	public int cal() {
		super.cal();
		//this.read(10,20);
		c=a*b;
		return c;
	}
}*/
public class InterfaceEx6 {
	public static void main(String[] args) {
		
		Addition mul = new Addition();
		mul.read(3,2);
	}
}
