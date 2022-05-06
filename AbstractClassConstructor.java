package Abstract;
abstract class AbsConst {
	AbsConst(){
		System.out.println("This is abstract class constructor");
	}
}
class Abs extends AbsConst{
	
	public void show() {
		System.out.println("This is show method");
	}
}
public class AbstractClassConstructor {

	public static void main(String[] args) {
		 Abs a = new Abs();
		 a.show();
	}
}
