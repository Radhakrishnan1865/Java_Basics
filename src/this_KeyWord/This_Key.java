package this_KeyWord;

import program.Practice;

public class This_Key {

	String str="Radhakrishnan A";
	
	public void method01(String str) {
		
		this.str=str;
		
	}
	public void display() {
		
		System.out.println(this.str);
	}
	
	public static void main(String[] args) {
		
		This_Key tk=new This_Key();
		tk.method01("Arun");
		tk.display();
		
	}
}
