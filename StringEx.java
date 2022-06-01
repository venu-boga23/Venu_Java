package Strings;

public class StringEx {
public static void main(String[] args) {
	 
	String name = "Venu";
	String name1 = "Madhav";

	String name2 = new String("Venumadhav");
	String name3 = new String("VENU");
	System.out.println(name.compareTo(name1));
	System.out.println(name==name1);
	System.out.println(name.hashCode());
	System.out.println(name1.hashCode());
	System.out.println(name1.hashCode());
	System.out.println(name2.hashCode());
	System.out.println(name3.hashCode());
	System.out.println(name==name1);
	System.out.println(name2==name3);
	System.out.println(name.length());//4
	System.out.println(name2.charAt(2));//N
	System.out.println(name1.toUpperCase());//VENU
	System.out.println(name.toLowerCase());//venu
	System.out.println(name.indexOf("N"));//2
    System.out.println(name.indexOf(2));
	System.out.println(name.indent(6));// for spaces
    System.out.println(name+name1.indent(1));// concatente the 2 string with "+" operator
    System.out.println(name.lastIndexOf("U"));
    System.out.println(name.concat(name1));// VENUMadhav
    System.out.println(name.startsWith("n",2));//true
    System.out.println(name.endsWith("r"));//true
    System.out.println(name.replace("N","M"));
    System.out.println(name.substring(2));//madhav
    System.out.println(name2.substring(4,7));   
   }
}
 
