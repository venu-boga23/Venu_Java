package byteStream;
public class WraperClasses {

	public static void main(String[] args) {
		 int i =100;
		 System.out.println(i);
		 
		 Integer a = new Integer(i);// Autoboxing
		 System.out.println(i);
		 
		 int x = a.intValue();
		 System.out.println(x);// Unboxing
		 
		//second way
			float b=3.4f;
			Float f=Float.valueOf(b);//Auto Boxing
			System.out.println(f);
			float y=f.floatValue();//Un Boxing
			System.out.println(y);
		
		String s = "VENU55";
		String str = new String(s);
		 
		String str2 = str.toString();
		System.out.println(str2);
	}
}
