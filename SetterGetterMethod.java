package Arguments;
class Employee{
	int id;
	String name;
	public void setDetails(int id,String name) {// SetterMethod
		this.id=id;
		this.name=name;
	}
	public void getDetails() { // Getter method
		System.out.println("Employee Details");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
}
public class SetterGetterMethod {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setDetails(101, "Ganesh");
	e.getDetails();
}
}
