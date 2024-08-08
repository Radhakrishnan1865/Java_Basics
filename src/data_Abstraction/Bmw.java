package data_Abstraction;

public class Bmw extends Car {

public void companyVault() {
		
		System.out.println("Bmw company vault");
	}
	
	public void engineSecret() {
		
		System.out.println("Bmw engine secret");
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method1() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		
		Car car=new Bmw();
		car.companyVault();
		car.engineSecret();
		car.Concrete_Method();
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
