package conversion;

public class String_To_Integer {

	public static void main(String[] args) {
		
		char c='A';
		
		int con=c;
		
		System.out.println(con);
		
		char ch='5';
		int a=ch-'0';
		System.out.println(a);
		String s="1234";
		
		
		int conversion=Integer.parseInt(s);
		System.out.println(conversion);
		System.out.println(s);
	}
	
}
