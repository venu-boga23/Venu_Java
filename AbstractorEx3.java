package Abstract;
abstract class Abss{
	int a = 10;
	abstract void message();// abstract method
	public void show() {
		System.out.println(a);// conctrete method
	}
	Abss(){
		System.out.println("This is abstract constructor");
	}
	Abss(int b){
		System.out.println(b);
	}
}
class Childd extends Abss{
	Childd(){
		super(50);
	}
	public void message() {
		System.out.println("this is extended abstract method");
	}

}
public class AbstractorEx3 {

	public static void main(String[] args) {
		Childd ch = new Childd();
		ch.show();
		ch.message();
	}
}
