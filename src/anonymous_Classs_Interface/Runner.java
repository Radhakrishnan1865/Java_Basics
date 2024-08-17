package anonymous_Classs_Interface;

public class Runner {

	public static void main(String[] args) {
		
		IParent object=new IParent() {
			
			@Override
			public void Marraige() {
				
				System.out.println("My life my rules from inner class");
				
			}
		};

		object.Marraige();
		
	}

}
