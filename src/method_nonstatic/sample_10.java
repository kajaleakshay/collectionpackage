package method_nonstatic;

public class sample_10 {

	public static void main(String[] args)
	{
		sample_10 s10 = new sample_10();
		s10.m1();
		s10.m4();
		
		
		
		
	}
	
	public void m1()
	{
		System.out.println("its method no m1 which is non static");
	}
	
	public void m4()
	{
		System.out.println("it is also non static method");
	}

}
