package method_parameter;

public class sample_2
{

	public static void main(String[] args) 
	{
		m1(12,22);
		m2(2,1);
		
		sample_2 s2 =new sample_2();
		s2.m3(11,12);
		s2.m4(16,8);
	}
	
	public static void m1(int a , int b)
	{
		System.out.println(a+b);
	}
	public static void m2(int a , int b)
	{
		System.out.println(a*b);
	}
	public  void m3(int a , int b)
	{
		System.out.println(a+b);
	}
	public  void m4(int a , int b)
	{
		System.out.println(a/b);
	}




}
