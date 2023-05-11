package Java_ExceptionHandaling;
import java.util.*;
public class Test_1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		Thread.sleep(5000);
		try{
		System.out.println(100/0);   // here is the Error
		}catch(ArithmeticException messge)
		{
			System.out.println("Here is the issue");
		}
		finally
		{
			System.out.println("Print other value");
		}
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		
		
		
	}

}
