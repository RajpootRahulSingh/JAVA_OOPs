package java_Casting;

public class Up_Casting extends Impli_Explicit {

	public void Up(){
		System.out.println("The Up_Casting demo");
	}
	public static void main(String[] args) {
		Up_Casting uc= new Up_Casting();   // Inheritance
		uc.Up();
		uc.Implicit();
		uc.Explicit();
		System.out.println("*************************************************");
		Impli_Explicit c= new Up_Casting();   // Up_Casting perform
		c.Implicit();
		c.Explicit();
	}

}
