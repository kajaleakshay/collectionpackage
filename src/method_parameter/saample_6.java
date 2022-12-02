package method_parameter;

public class saample_6 
{

	public static void main(String[] args) 
	{
		saample_6 s6 = new saample_6();
		s6.m1(5,5);
		s6.m2(2,2);
		
		m3(12,21);
		m4(11,21);
		
		
	}
	public void m1(int a, int b)
	{
		System.out.println(a*b);
	}
	public void m2(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void m3(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void m4(int a, int b)
	{
		System.out.println(a*b);
	}

}
