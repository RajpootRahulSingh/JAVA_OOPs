package Polymorphisum;

public class MethodOverriding extends MethodOverloding {
	void Add()
	{
		System.out.println("The Simple Add methodoverriding in anather class :");
		}
	public static void main(String[] args) {
		MethodOverriding mo=new MethodOverriding();
		mo.Add(10, 20);
		mo.Add(10, 20, 30);
		mo.Add();
	}

}
