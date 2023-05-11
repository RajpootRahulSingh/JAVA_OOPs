package Java_Ganaralization;

public class Gen_Test {

	public static void main(String[] args) {
	   System.out.println("--------The OFFER Of IDEA Company--------");
	   IDEA t1 = new IDEA();
	   t1.IDEA_Offer();
	   t1.AudioCalling();
	   t1.VideoCalling();
	   t1.SMS();
	   System.out.println(" -------The OFFER Of AIRTEL Company-------");
	   AIRTEL t2 = new AIRTEL();
	   t2.AIRTEL_Offer();
	   t2.AudioCalling();
	   t2.VideoCalling();
	   t2.SMS();
	   System.out.println("---------The OFFER Of JIO Company---------");
	   JIO t3 = new JIO();
	   t3.JIO_Offer();
	   t3.AudioCalling();
	   t3.VideoCalling();
	   t3.SMS();
	   
	}

}
