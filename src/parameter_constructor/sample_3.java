package parameter_constructor;

public class sample_3
{
	int num1;
	int num2;
	
	sample_3(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public void multi()
	{
		System.out.println("multiplication of the two number :"+(num1*num2));
	}
	public static void main(String[] args) 
	{
		sample_3 s3 = new sample_3(04,02);
		s3.multi();
		
		sample_3 s2 = new sample_3(1,3);
		s2.multi();
	}
	
	
}
