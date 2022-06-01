package Strings;
class Box{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	public String toString() {
		
		return "Dimesions are "+width+" by "+height+" by "+depth;
	}
	public void show() {
		
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		Box b = new Box(10,12,14);
		String s = "Box Dimesions: "+b; // concatenate Box object
		System.out.println(b);//convert Box to string
		System.out.println(s);
		
		
	}
}
