package data_Abstraction;

public abstract class Car implements NewProjects,SubClass{

	public abstract void companyVault(); 
	
	public abstract void engineSecret(); 
	
	public void Concrete_Method() {
		
		System.out.println("This is a concrete method in Car Abstract class");
	}
}
