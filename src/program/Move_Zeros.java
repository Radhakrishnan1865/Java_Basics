package program;

public class Move_Zeros {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		
		//Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
		
		int length=arr.length;
		int nonZeroIndex=0;
		
		for(int i=0; i<length; i++) {
			
			if(arr[i]!=0) {
				
				arr[nonZeroIndex++]=arr[i];
			}
		}
		
		while(nonZeroIndex<length) {
			arr[nonZeroIndex++]=0;
		}
		for(int number: arr) {
			System.out.print(number);
		}
	}
}
