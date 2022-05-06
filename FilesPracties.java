package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Pra{
public void writeMethod() throws IOException {
	FileWriter fw = new FileWriter("E:/JAVA/venu.txt",true);
	BufferedWriter bw = new BufferedWriter(fw);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the data into file");
	String s = br.readLine();
	for(int i=0;i<s.length();i++) {
		bw.write(s.charAt(i));
	}
	br.close();
	bw.close();
	fw.close();
	}
}
public class FilesPracties {

	public static void main(String[] args) throws IOException {
		Pra p = new Pra();
		p.writeMethod();
	}
}
