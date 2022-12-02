package parameter_constructor;

public class sample_01 
{
		int num1;
		int num2;
		
		sample_01(int a, int b)// define the variable in the constructor
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
			sample_01 s1 = new sample_01(01,02);
			s1.m1();
		}

}
