package Abstract;
interface Inn{
	int x = 100;
	public void message2();
}
interface In2{
	public void message3();
}
class Sub implements Inn,In2{
	int y =200;
	public void message2() {
		System.out.println("this is implemented interface abstract method");
		System.out.println(x);
   //  	x++;	
		y++;
		System.out.println(y);
	}
	public void message3() {
		System.out.println("This is implemented 2nd interface astract method");
	}
}
public class InterfaceEx8 {
public static void main(String[] args) {
	Sub s = new Sub();
	s.message2();
    }
}
