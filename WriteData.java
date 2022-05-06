package byteStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
class DataWrite{
	char c;
	public void writeMethod() throws IOException{
		
     DataInputStream dis =  new DataInputStream(System.in);//Attache dis class to keyboard
     BufferedInputStream bis = new BufferedInputStream(dis);
     
     FileOutputStream fos = new FileOutputStream("E:/JAVA/VenuMadhav.java");//Attach the file to fos class
     BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
     
     System.out.println("Enter the Data");
     while ((c=(char)bis.read())!='$') {
		bos.write(c);
	}
     bis.close();
     bos.close();
	}
}

public class WriteData {

	public static void main(String[] args) throws IOException {
		DataWrite dw = new DataWrite();
		dw.writeMethod();
		
	}
}
