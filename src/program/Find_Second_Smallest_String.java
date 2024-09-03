package program;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Find_Second_Smallest_String {

	public static void main(String[] args) {
		
		 String str = "Use this editor to write, compile and run your Java code online in";
	        
	        // Split the string into words
	        String[] words = str.split(" ");
	        
	        // Initialize variables to track the smallest length words
	        int minLength = Integer.MAX_VALUE;
	        List<String> smallestWords = new ArrayList<>();
	        
	        // Loop through the words to find the smallest length and collect those words
	        for (String word : words) {
	            int length = word.length();
	            if (length < minLength) {
	                minLength = length;
	                smallestWords.clear();
	                smallestWords.add(word);
	            } else if (length == minLength) {
	                smallestWords.add(word);
	            }
	        }
	        
	        // Print the second smallest length word if available
	        if (smallestWords.size() > 1) {
	            System.out.println("Second smallest length word: " + smallestWords.get(1));
	        } else if (smallestWords.size() == 1) {
	            System.out.println("Smallest length word: " + smallestWords.get(0));
	        } else {
	            System.out.println("No words found.");
	        }
	}
}
