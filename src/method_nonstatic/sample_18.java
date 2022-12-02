package method_nonstatic;

public class sample_18 {

	public static void main(String[] args)
	{
		sample_17 s17 = new sample_17();
		s17.m2();			// its for non static method
		
		
		sample_17.m1();	            //	its for static method
	}

}
