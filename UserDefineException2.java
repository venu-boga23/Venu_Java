package ExceptionHandling;
class UserException extends Exception{

	 public void exceptionShow() {
		 int balance = 1000,amount=5000;
			try{
				if(amount<=balance) {
					System.out.println("Collect the cash");
				}
				else {
					throw new UserDefineException3("Insufficiant Balance");
				     }
		    	}
			catch(UserDefineException3 ue) {
				System.out.println(ue);
			}
	 }
}
public class UserDefineException2 {

	public static void main(String[] args) {
	UserException ue = new UserException();
	ue.exceptionShow();
   }
}
