package byteStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
class Read{
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	public void readMethod() {
		int c;
		try {
			fis = new FileInputStream("E:/JAVA/VenuMadhav.class");
			bis = new BufferedInputStream(fis);
			System.out.println("Data from the file");
			while ((c=bis.read())!=-1) {
				System.out.print((char)c);
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class ReadData {

	public static void main(String[] args) {
		 Read r = new Read();
		 r.readMethod();
	}
}
