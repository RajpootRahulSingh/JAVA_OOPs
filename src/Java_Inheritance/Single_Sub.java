package Java_Inheritance;

public class Single_Sub extends SingleSuper{

	public void Bike()
	{
		System.out.println("The Bike is the Sub class Son Requirment");
	}
	public void home(){
		System.out.println("The Super class Home : "+"2BHK");
	}
	public static void main(String[] args) {
     Single_Sub sb=new Single_Sub();
     sb.home();
     sb.money();
     sb.Farm();
     sb.Bike();
	}

}
