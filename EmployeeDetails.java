package byteStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
public class EmployeeDetails implements Serializable {

	int id;
	String name;
	float salary;
	public EmployeeDetails(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void displayEmpDetail() {
		System.out.println(id+name+salary);
	}
	public static EmployeeDetails getEmpDetails() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Emp Id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Emp Name");
		String name = br.readLine();
		System.out.println("Enter Emp Salary");
		float salary = Float.parseFloat(br.readLine());
		 EmployeeDetails ed = new EmployeeDetails(id,name,salary);
		 return ed;		
	}
}
