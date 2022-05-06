package byteStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
public class Employee implements Serializable 
{
	int id;
	String name;
	//transient float sal;
	float sal;
	public Employee(int id,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void displayEmpDetails()
	{
		System.out.println(id+"\t"+name+"\t"+sal);
	}
	public static Employee getEmpDetails()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id :");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter name :");
		String name=br.readLine();
		System.out.println("Enter salary :");
		float sal=Float.parseFloat(br.readLine());
		Employee e=new Employee(id,name,sal);
		return e;
	}
}


/*
Note: 
Compulsary Employee class should be serializable other wise we will get
an exception as NotSerializableException: Employee.

transient: It is a keyword/modifier . transient variables can't be participate in
serialization/deserialization.

*/
