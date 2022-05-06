package ExceptionHandling;

public class UserDefindException extends Exception {

	UserDefindException(String s){
		super(s);
	}
	
	public static void main(String[] args) {
		int balance = 1000,amount=5000;
		try{
			if(amount<=balance) {
				System.out.println("Collect the cash");
			}
			else {
				throw new UserDefindException("Insufficient Balance");
			}
		}catch(UserDefindException u) {
			System.out.println(u);
		}
	}
}
