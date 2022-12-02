package method_parameter;

public class sample_14
{
	
	public static void main(String[] args) 
	{
		sample_14 s14 = new sample_14();
		s14.m1(11, 110);
		
		m2(11,12);
	}
	public void m1(int a , int c)
	{
		System.out.println(a+c);
	}
	public static void m2(int c,int d)
	{
		System.out.println(c*d);
	}
}
