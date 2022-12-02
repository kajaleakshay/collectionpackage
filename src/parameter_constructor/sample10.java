package parameter_constructor;

public class sample10 
{
	int num1;
	int num2;
	String name;
	
	sample10(int a, int b, String akshay)
	{
		num1=a;
		num2=b;
		name=akshay;
	}
	public void m1()
	{
		System.out.println("multiplication of the two number :"+(num1*num2)+" "+name);
	}
	public static void main(String[] args)
	{
		sample10 s10 = new sample10(11,02,"akshay");
		s10.m1();
	}
	
}
