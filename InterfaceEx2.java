package Interface;
import java.util.Scanner;
 interface Cricket{
	 public void teams();
 }
 interface Ipl{ 
	 public void results();
 }
class Winner implements Cricket,Ipl
{
     Scanner sc = new Scanner(System.in);
     String teamNames;
     
	public void teams() {
		
		System.out.println("Enter IPL teams");
		teamNames = sc.next();
		
	}
    public void results() {
		
		System.out.println(teamNames+" Won the match");
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		
		Winner win = new Winner();
		win.teams();
		win.results();
	}
}
