package program;


import java.util.LinkedHashSet;
import java.util.Set;

public class NewClasss {

	public static void main(String[] args) {
		
		String str="radhakrishnan";
		
	char[]ch=str.toCharArray();
	
	Set<Character> set=new LinkedHashSet<>();
	
	for(char c:ch) {
		
		set.add(c);
	}
	System.out.println("String without duplicates: ");
	for(char result:set) {
		
		System.out.print(result);
	}
	}
}
