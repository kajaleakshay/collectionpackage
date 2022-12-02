package method_parameter;

public class sample_4
{

	public static void main(String[] args)
	{
		sample_4 s4 = new sample_4();
		s4.m1(2,2);
		s4.m2(3,3);
		
		m3(1,1);
		m4(4,4);
	}
	public void m1(int a, int b)
	{
		System.out.println(a*b);
	}

	public void m2(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void m3(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void m4(int a, int b)
	{
		System.out.println(a-b);
	}
}
