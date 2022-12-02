package parameter_constructor;

public class sample_02
{
	int a;
	int b;
	
	sample_02(int x, int y)
	{
		a=x;
		b=y;
	}
	public void m1()
	{
		System.out.println("multiplication of the two no :"+(a*b));
	}
	 public static void main(String[] args)
	 {
		 sample_02 s2 = new sample_02(2,2);
		 s2.m1();
		 
		 sample_02 s1 = new sample_02(3,3);
		 s1.m1();
	}
}
