package JavaInterface;

public class Interface_Impli {

	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		s1.Add(100,10);
		s1.Massage();
		System.out.println("");
		s1.Sub(100,10);
		s1.Massage();
		System.out.println("");
		s1.Mul(100, 10);
		s1.Massage();
		System.out.println("");
		s1.Div(100, 10);
		s1.Massage();
		System.out.println("");
		s1.Mod(10, 2);
		s1.Massage();
		
	}

}
