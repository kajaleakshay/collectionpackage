package method_nonstatic;

public class sample_11 {

	public static void main(String[] args)
	{
		sample_11 s11= new sample_11();
		s11.m1();
		s11.m8();
	}
	public void m1()
	{
		System.out.println("its non method m1");
	}
	public void m8()
	{
		System.out.println("it is also non static method of m8");
	}

}
