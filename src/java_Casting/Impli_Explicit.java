package java_Casting;

public class Impli_Explicit{

	public void Implicit()
	{
		long l=2345L;
		double d=l;
		System.out.println("The Implicite Casting : "+d);
	}
	public void Explicit()
	{
		double d=23.45d;
		long l=(long)d;
		int i=(int)d;
		System.out.println("The Explicite Casting is :"+l);
		System.out.println("The Explicite Casting is :"+i);
	}

}
