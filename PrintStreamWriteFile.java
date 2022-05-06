package byteStream;
import java.io.PrintStream;
//creating File and Writing data into file using printstram class 
public class PrintStreamWriteFile {

	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("E:/JAVA/kalyan.txt");
			ps.print("This text will be written into kalyan.txt file ");
			System.out.println("File created and text has been written into the file");
			ps.close(); 
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
 