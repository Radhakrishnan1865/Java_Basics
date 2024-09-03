package program;

public class Base {

	 int a=0;
	Base(){
		
		a++;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Base b= new Base();
		Base b1= new Base();
		Base b2= new Base();
	}
}
