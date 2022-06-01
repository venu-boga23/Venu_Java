package Strings;

public class LongestNonRepeatingSubString {
	
	
	public static void main(String[] args) {
		int i, rept;String str = "ABCDEFGHABEF";
		
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i))
		         System.out.println(i);
		}
	}
}
