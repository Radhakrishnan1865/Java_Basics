package anonymous_Inner_Class_Method;

public class Runner {

	public static void main(String[] args) {
		
		Friend fr=new Friend();
		fr.CanManage(new IManageable() {
			
			@Override
			public void Manage() {
				
				System.out.println("Always I can manage that problem");
				
			}
		});

		
	}

}
