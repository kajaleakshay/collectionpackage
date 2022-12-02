package method_nonstatic;

public class sample_8 {

	public static void main(String[] args)
	{
		sample_8 s8= new sample_8();
		s8.m1();
		s8.m8();
		m2();
	}
	public void m1()
	{
		System.out.println("m1 metod");
	}
	public static void m2()
	{
		System.out.println("its the static method m2");
	}
	public void m8()
	{
		System.out.println("its non static method of m8");
	}

}
