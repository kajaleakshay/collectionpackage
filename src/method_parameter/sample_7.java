package method_parameter;

public class sample_7
{

	public static void main(String[] args) 
	{
		sample_7 s7 = new sample_7();
		s7.m1(11,1);
		
		m2(8,4);
	}
	public static void m2(int a,int b)
	{
		System.out.println(a/b);
	}
	public void m1(int a, int b)
	{
		System.out.println(a*b);
	}

}
