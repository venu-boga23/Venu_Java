package Interface;
interface inter {
	
	public void message();
}

class Inter2 implements inter{
	
     public void message() {
		
		System.out.println("This is implemented method from interface");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		
		Inter2 i2 = new Inter2();
		i2.message();	
	}
}
