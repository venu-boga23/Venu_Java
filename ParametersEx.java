package Arguments;
class parameters{
	
	public void add(int a,int b) {
		System.out.println("Addition "+(a+b));
	}
}
public class ParametersEx {

	public static void main(String[] args) {
		parameters para = new parameters();
		para.add(5, 5);
	}
}
