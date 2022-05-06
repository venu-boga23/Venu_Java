package Files;
import java.io.File;
import java.io.IOException;
public class CreateNewFile {
public static void main(String[] args) throws IOException{

	// Creating a directory
//	File f = new File("E:/JAVA");
//	f.mkdir();
//	System.out.println("File Created");
	
	// creating a file
	File f2 = new File("E:/JAVA/Venu.doc");
	f2.createNewFile();
	System.out.println("Text file created");
	
//	System.out.println("Is File is exists: "+f2.exists());
//	System.out.println("Is File: "+f2.isFile());
//	System.out.println("Is a Directory: "+f2.isDirectory());
//	System.out.println("Its Name is: "+f2.getName());
//	System.out.println("File size in bytes: "+f2.length());
//	System.out.println("Is Writable: "+f2.canWrite());
//	System.out.println("Is Readable: "+f2.canRead());
//	System.out.println("Is Hidden: "+f2.isHidden());
//	System.out.println("Its Path: "+f2.getPath());
//	System.out.println("Rename: "+f2.renameTo(new File("E:/JAVA/FileReanamed.txt")));
//	System.out.println("Deleted: "+f2.delete());
    }
}
