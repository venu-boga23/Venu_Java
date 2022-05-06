package ExceptionHandling;
import java.io.*;
class ExceptionEx{
	
	public void read() throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any thing");
		String[] s1= new String[3];
		String	s11=br.readLine();
		System.out.println(s11);
	}
}
public class IoException {

	int balance = 1000,amount=2000;

	public static void main(String[] args) throws IOException 
	{
		ExceptionEx ex = new ExceptionEx();
		ex.read();
	}
}
