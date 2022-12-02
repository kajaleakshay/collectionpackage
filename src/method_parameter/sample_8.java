package method_parameter;

public class sample_8
{

	public static void main(String[] args) 
	{
		m1(2,2);
		 
		sample_8 s8 = new sample_8();
		s8.m2(3,3);
	}
	public static void m1(int a, int c)
	{
		System.out.println(a+c);
	}
	public void m2(int a,int d)
	{
		System.out.println(a/d);
	}

}
