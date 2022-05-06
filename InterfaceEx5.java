package Interface;
// declaring a concrete method in interface
interface A{
	int a = 457,b=100;
	public int methodInter();
	// concrete method
	default int concreteMethod() {
		int c;
		c=a+b;
		System.out.println("This concrete method of interface");
		return c;	
	}
	default void concreteMethod2() {}
}
interface B {
	public void methodInter2();
}
class Class1 implements A{
	
	int x = 10,y=20;
	String name = "Marolix";
	public int methodInter() {
		int c;
		c=x+y;
		return c;
	}
	void show() {
//		System.out.println(super.methodInter());
		System.out.println(name);		
	}
}
class Class2 extends Class1 implements A,B{
	
	public void methodInter2() {}
	void show2() {
		System.out.println(super.concreteMethod());	
	}
}
public class InterfaceEx5 {
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.show();
		c2.show2();
        System.out.println(c2.concreteMethod());
		System.out.println(c2.methodInter());
	}
}
