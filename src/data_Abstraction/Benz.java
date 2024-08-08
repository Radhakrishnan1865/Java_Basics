package data_Abstraction;

public class Benz extends Car  {

public void companyVault() {
		
		System.out.println("Benz company vault");
	}
	
	public void engineSecret() {
		
		System.out.println("Benz engine secret");
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Interface method ");
	}

	@Override
	public String method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface method01");
		return null;
	}
	public static void main(String[] args) {
		
		Car car=new Benz(); 
		car.companyVault();
		car.engineSecret();
		car.Concrete_Method();
		car.method();
		car.method1();
		
	}

	@Override
	public int method02() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String Ball() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	
}
