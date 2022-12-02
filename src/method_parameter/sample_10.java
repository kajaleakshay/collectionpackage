package method_parameter;

public class sample_10 {

	public static void main(String[] args) 
	{
		m1(2,1);
		
		sample_10 s10 = new sample_10();
		s10.m2(9,2);
	}
	public static void m1(int a,int b)
	{
		System.out.println(a*b);
	}
	public void m2(int a,int b)
	{
		System.out.println(a-b);
	}

}
