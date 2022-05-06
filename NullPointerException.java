package ExceptionHandling;
class NullPointer{
	int a=10;
	String name="hello";
	public void show() {
		System.out.println(name);
	}
}
public class NullPointerException {
public static void main(String[] args) {
	NullPointer np = new NullPointer();
	np.show();
	try {
	np=null;
	//np.show();
	throw new UserDefineException3("Object Destroyed");
	
	}catch (UserDefineException3 e) {
		
		System.out.println(e);
	}
	
  }
}
