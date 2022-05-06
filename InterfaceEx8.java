package Interface;
interface Test{
	abstract void method1();
	int a =100;
	public static void concreteMethod() {
		System.out.println("This is static method of interface");
	}
}

public class InterfaceEx8 {
    
public static void main(String[] args) {
	Test.concreteMethod();
}
}
