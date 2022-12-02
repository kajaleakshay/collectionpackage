package parameter_constructor;

public class sample8 
{
	int num1;
	int num2;
	
	sample8(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public void m1()
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args) 
	{
		sample8 s8 = new sample8(11,12);
				s8.m1();
	}
}
