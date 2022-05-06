package Interface;
interface EmpData{
    String name="Venu";
    
	 public void getMethod(int id);
}
interface CompanyData{
	
	public void getData(String compName);
}

class Data implements EmpData,CompanyData{
	
	int i;
	
	public void getMethod(int id) {
		i=id;
	}
	
	public void getData(String compName) {
		String cName=compName;
		System.out.println("Your id is"+i);
		System.out.println("Your id is"+i);
	}
}
public class InterfaceEx3 {

	public static void main(String[] args) {
		
		
	}
}
