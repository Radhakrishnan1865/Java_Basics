package anonymous_Inner_Class;

public class Runner {
	public static void main(String[] args) {
		
		
		// Anonymous inner class
		Parent object=new Parent() {
			
			public void Marraige() {
				
				System.out.println("Marraige fixed by me");
			}
		};
		object.Marraige();
		object.College();
		object.scooling();
	}

}
