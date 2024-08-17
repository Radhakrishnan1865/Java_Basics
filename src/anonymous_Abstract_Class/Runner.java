package anonymous_Abstract_Class;

public class Runner {

	public static void main(String[] args) {
		
		Parent object=new Parent() {
			
			@Override
			public void Marraige() {
				System.out.println("My life my Rules from inner class");
				
			}
		};
		
		object.Marraige();
		object.College();
		object.scooling();

	}

}
