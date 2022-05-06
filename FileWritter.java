package Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class Write{
	public void writeMethod() throws IOException {
	FileWriter fw = new FileWriter("E:/JAVA/Venu.doc",true); 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(fw);
	System.out.println("Enter the data into the file");
	String s = br.readLine();//read the data from keybord
	for(int i=0;i<s.length();i++) {
     bw.write(s.charAt(i));	// write the data into file	
    
	}
	 br.close();
     bw.close();
     fw.close();
	}
	
}
public class FileWritter {
	public static void main(String[] args) throws IOException {
		Write w = new Write();
		w.writeMethod();
	}
}
