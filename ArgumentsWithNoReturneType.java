package Arguments;
class ArgNoReturne{
	public void emp(String name,int id) {
		System.out.println("Name: "+name+"\nId: "+id);
	}
}
public class ArgumentsWithNoReturneType {
	public static void main(String[] args) {
		ArgNoReturne anr =new ArgNoReturne();
		anr.emp("Venu", 457);
		anr.emp("Ganesh", 454);
		anr.emp("Navya", 445);
		anr.emp("Kalyan", 459);
	}
}
