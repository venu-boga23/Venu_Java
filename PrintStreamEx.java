package byteStream;
import java.io.PrintStream;
public class PrintStreamEx {
	public static void main(String[] args) {
		  int x=100;
		  float f=23.64f;
		  //print stream attach to the monitor.
		  PrintStream ps = new PrintStream(System.out);
		  ps.println("This is printl method");
		  ps.print("This is print method()");
		  ps.printf("This is printf method");
		  ps.println(x);
		  ps.print(f);
	}
}
