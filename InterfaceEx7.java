package Interface;
interface InterDemo{
	public static final int a =10;
	public void method();
}
abstract class Venu implements InterDemo{
	
	abstract void methodTest1(); 
	public void methodTest() {
		int b=20;
		System.out.println(b);
		b++;
		System.out.println(b);
		System.out.println("Implemented interface");	
		
	}
}
class Ganesh extends Venu{
	 void methodTest1() {
		 System.out.println("This abstract method of abstract class");
	 }
	public void methodTest() {
		super.methodTest();
		System.out.println("This is extended abstract class ");
	}
	public void method() {
		System.out.println("This is inherited abstract method of interface ");
	}
}
 class Kalyan implements InterDemo{
	public void method() {
		System.out.println("This implemented interface in class Kalyan");
	}
}
public class InterfaceEx7 {

public static void main(String[] args) {
	
	Ganesh g = new Ganesh();
	g.method();
	g.methodTest();
	g.methodTest1();
	System.out.println(InterDemo.a);
    
	InterDemo ind;
	ind=new Kalyan();
	ind.method();
   }
}
