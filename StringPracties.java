package Strings;
import java.util.Scanner;
class bank{
	
	 String username="navya";
	 int password1=123456;
     Scanner input = new Scanner(System.in);
     String userName;
	 int password;
	
    void axis () {
    	System.out.println("enter user name ");
    	 userName=input.next();
    	if( username.contentEquals(userName)) {
    	System.out.println("Enter Password");
    	password=input.nextInt();
    	if(password1==password) {
			System.out.println("login into netbanking");
			System.out.println("Accountnumber:1234567892\nIFSC code:AXIS2010");	
		}
    }
		else {
			System.out.println("incorrect Credentials");
		}
    	System.out.println("wellcome to the AXIS bank NetBanking");	
    }		
}
public class StringPracties {
public static void main(String[] args) {
	bank b=new bank();
	b.axis();
   }
}
