package byteStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Copy{
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

public class CopyStream {

}
