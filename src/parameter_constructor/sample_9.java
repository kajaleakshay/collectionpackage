package parameter_constructor;

public class sample_9 
{

	int a;
	int b;
	 
	sample_9(int x, int y)
	{
		a=x;
		b=y;
	}
	public void multi()
	{
		System.out.println("mltiplicaation of the two number :"+(a*b));
	}
	public void m2()
	{
		System.out.println("substrction of the two number :"+(a-b));
	}
	public static void main(String[] args)
	{
		sample_9 s9 = new sample_9(2,3);
		s9.multi();
		s9.m2();
		
		sample_9 s99 = new sample_9(3,3);
		s99.multi();
		s99.m2();
	}
}
