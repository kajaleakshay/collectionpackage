package method_nonstatic;

public class sample_9 {

	public static void main(String[] args)
	{
		sample_9 s9= new sample_9();
		s9.m3();
		s9.m2();
		m1();
		
	}
	public static void m1()
	{
		System.out.println("its method m1 and static method");
	}
	public void m2()
	{
		System.out.println("its non static mehod m2");
	}
	public void m3()
	{
		System.out.println("its method m3");
	}

}
