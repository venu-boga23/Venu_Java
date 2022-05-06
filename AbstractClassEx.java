package Abstract;
abstract class A{
	abstract void method();
	public void Test() {
		System.out.println("This is method of abstract class");
	}
	abstract void sample(int a,int b);
}
class B extends A{
	int x,y,c;
	public void method() {
		System.out.println("This is implemented abstract method");
	}
	public void sample(int a,int b) {
		 System.out.println("a = "+a+" y = "+b);
	 }
	public int add(int x,int y) {
		this.x=x;
		this.y=y;
		 c=x+y;
		 return c;
	 }
}
abstract class C extends B{
	String name = "VENU";
	int id = 457;
	abstract void result();
	public void show() {
		System.out.println("This is abstract class non-abstract method");
	}
}
class E extends C{
	
	public void show2() {
		System.out.println(name);
		System.out.println(id);
	}
	public void result() {
		super.add(50,50);
		System.out.println(c);
		System.out.println(add(50, 5));
	}
}
public class AbstractClassEx {

	public static void main(String[] args) {
	B b = new B();
	E e = new E();
	b.Test();
	b.method();
	e.show();
	e.show2();
	e.result();
 }
}
