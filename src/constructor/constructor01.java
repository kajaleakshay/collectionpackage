package constructor;


public class constructor01 {
	
	static int a= 11;
	int b=22;

	public static void main(String[] args)
	{

		m2();
		
		constructor01 s11 = new constructor01();
		s11.m1();
		
	}

	public void m1()
	{
		System.out.println(a);
		System.out .println(b);
	}
	
	public static void m2()
	{
		//System.out.println(b);
		System.out.println(a);
		
		constructor01 s1 = new constructor01();
		System.out.println(s1.b);
	}
}

