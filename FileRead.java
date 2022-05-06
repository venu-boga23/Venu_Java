package Files;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
class FileR{
	FileReader fr = null;
	int n;
	public void readMethod() throws IOException{
		
		fr= new FileReader("E:/JAVA/venu.doc");
		BufferedReader br = new BufferedReader(fr);
		System.out.println("Data from file");
		try {
			while((n=br.read())!=-1) {
				System.out.print((char)n);
			}
		}catch (FileNotFoundException fne) {
			System.out.println("File Not Found");
			return;
		}finally {
			fr.close();
		}	
	}
}
public class FileRead {

	public static void main(String[] args) throws IOException {
		FileR r = new FileR();
		r.readMethod();
	}
}
