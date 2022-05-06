package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class CtrlCctrlV{
	
	int n;
	public void copyMethod() throws IOException {
		FileReader fr = new FileReader("E:/JAVA/kalyan.txt");
		FileWriter fw = new FileWriter("E:/JAVA/vignesh.txt");
		while ((n=fr.read())!=-1) {
			fw.write(n);
		}
		System.out.println("Data Copied");
		fr.close();
		fw.close();
	}
}
public class FileCopy {

	public static void main(String[] args) throws IOException{
		CtrlCctrlV c = new CtrlCctrlV();
		c.copyMethod();
	}
}
