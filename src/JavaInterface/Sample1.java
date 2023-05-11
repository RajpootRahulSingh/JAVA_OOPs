package JavaInterface;

public class Sample1 implements I1,I2,I3{
public void Add(int x,int y)
{
	int aa=x+y;
	System.out.println("The Addition is :"+aa);
	}
public void Sub(int x, int y)
{
	int aa=x-y;
	System.out.println("The Sub is :"+aa);
	}
public void Mul(int x,int y)
{
	int aa=x*y;
	System.out.println("The Mul is : "+aa);
	}
public void Div(int x,int y)
{
	int aa=x/y;
	System.out.println("The Division is : "+aa);
	}
public void Mod(int x,int y)
{
	int aa=x%y;
	System.out.println("The Moduls is : "+aa);
	}
public void Massage() 
{
	System.out.println("Prosses complate And Result Show");
	
}
}
