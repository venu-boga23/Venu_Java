package byteStream;
//Deserialization
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerializationEx {
		public static void main(String[] args)throws Exception {
		ObjectInputStream ois=null;
		FileReader fr = null;
		try
		{
			FileInputStream fis=new FileInputStream("E:/JAVA/kalyan.txt");
			ois=new ObjectInputStream(fis);
			Employee e;
			//Reading all objects from the file until readObject() method returns null.
			while((e=(Employee) ois.readObject())!=null)
			{
				e.displayEmpDetails();// displaying object content on the monitor.
			}
		}
		catch(EOFException ee)
		{
			System.out.println("End of file reached");		
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Specified file not available");
			return;
		}
	
		ois.close();
	}
}




