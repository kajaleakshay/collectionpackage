package method_nonstatic;

public class sample_6 {

	public static void main(String[] args) 
	{	m3();
		sample_6 s6 = new sample_6();
		s6.m1();
		s6.m2();
		
	}
	public void m1()
	{
		System.out.println("it is the the man method");
	}
	public void m2()
	{
		System.out.println("its m2 method from m2 ");
	}
	public static void m3()
	{
		System.out.println("its 3 rd method of the non static vois main method");
	}

}
