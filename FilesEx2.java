package Files;
import java.io.File;
import java.io.IOException;
class FileCondition{
	File f2 = new File("E:/JAVA/File.txt");
	
	public void fileCandy() throws IOException {
		f2.createNewFile();
		File f = new File("E:/JAVA/File3.doc");
		f.createNewFile();
		System.out.println("File is created:"+f.exists());

	if (f.exists()) {
		if (f.delete()) {
			System.out.println("File is deleted");
		}else {
			System.out.println("File in deletion");
		}
		
	}else {
		System.out.println("File is not found");
	}
	}
}
public class FilesEx2 {

	public static void main(String[] args) throws IOException {
		FileCondition fc = new FileCondition();
		fc.fileCandy();
	}
}
