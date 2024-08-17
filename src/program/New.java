package program;

import java.util.HashSet;
import java.util.Set;

public class New {
	  public static void main(String[] args) {
	       
	       String N= "IndiaAcabesJordan";
	       
	      String A= N.toLowerCase();
	       char[] ch=A.toCharArray();
	       
	       Set<Character> set= new HashSet<Character>();
	       
	       for(char c:ch){
	           
	           set.add(c);
	       }
	       
	       for(char character:set){
	           
	           System.out.print(character);
	       }
	    }
}
