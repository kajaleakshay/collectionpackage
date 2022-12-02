package method_nonstatic;

public class sample14 {

	public static void main(String[] args) 
	{
		sample14 s14 = new sample14();
		s14.m1();
		s14.m2();
		s14.m66();
		
	}
	public void m1()
	{
		System.out.println("its the 1 method of non static class");
	}
	public void m2()
	{
		System.out.println("it is the 2 class of the non static field");
		
		
	}
	public void m66()
	{
		System.out.println("it last class of the this class");
	}

}
