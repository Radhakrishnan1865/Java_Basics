package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Remove_Second_Highest_Value_InArray {

	public static void main(String[] args) {
		
	
	int[]array= {10,20,30,50,70,40,90,80};
	
	
	Integer[] arr=Arrays.stream(array)
			.boxed()
			.toArray(Integer[]::new);
	 ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
	 
	 Collections.sort(arrayList,Collections.reverseOrder());
	 
	 if(arrayList.size()<2) {
		 System.out.println("No elements Find");
	 }
	 Integer highestValue=arrayList.get(0);
	 Integer secondHighestValue=null;
	 for(Integer values:arrayList) {
		 
		 if(!values.equals(highestValue)) {
			 secondHighestValue=values;
			 break;
		 }
	 }
	 if(secondHighestValue==null) {
		 System.out.println("There is no second element in array");
		 
	 }
	 
	 Iterator<Map.Entry<String,Integer>> iterator=
	 System.out.println(arrayList);
	
	}	
	
}
