package method_parameter;

public class sample_1 
{

	public static void main(String[] args) 
	{
		addi(10,20);
		subs(2,2);
		
		sample_1 s1 = new sample_1();
		s1.addition(10,19);
		s1.substraction(3,7);
		
	}
	public static void addi(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void subs(int a,int b)
	{
		System.out.println(a-b);
	}
	public  void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public  void substraction(int a,int b)
	{
		System.out.println(a-b);
	}

}
