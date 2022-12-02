package method_parameter;

public class sample_3
{

	public static void main(String[] args) 
	{
		m1(2,6);
		m2(1,1);
		
		sample_3 s3 = new sample_3();
		s3.m3(4,4);
		s3.m4(21,22);
		
	}
	public static void m1(int a,int b)
	{
		System.out.println(a*b);
	}

	public static void m2(int a,int b)
	{
		System.out.println(a+b);
	}
	public  void m3(int a,int b)
	{
		System.out.println(a*b);
	}
	public  void m4(int a,int b)
	{
		System.out.println(a-b);
	}
}
