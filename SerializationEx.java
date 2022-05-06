package byteStream;
//Serialization
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
public class SerializationEx {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos=new FileOutputStream("E:/JAVA/kalyan.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		System.out.println("How many objects to store/write into the file");
		int n=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++)
		{
			Employee e1=Employee.getEmpDetails();
			oos.writeObject(e1); //writing object into file
		}
		oos.close();	//closing the files/streams
		br.close();
	}
}
