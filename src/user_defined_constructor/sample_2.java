package user_defined_constructor;

public class sample_2
{
		int a;
		int b;
		
		sample_2()
		{
			a=11;
			b=04;
			
		}
		public void m1()
		{
			System.out.println(a+b);
		}
		public static void main(String[] args)
		{
			sample_2 s2 = new sample_2();
			s2.m1();
		}

}
