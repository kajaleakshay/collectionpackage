package constructor_overloading;

public class sample4
{ 		int num1;
		int num2;

		sample4(int a, int b)
		{
			num1=a;
			num2=b;
		}
		public void m1()
		{
			System.out.println(num1*num2);
		}
		
		sample4()
		{
		}
		public void m2(int b, int a)
		{
			int x=b;
			int y=a;
			System.out.println(x+y);
		}
		public static void main(String[] args) {
 
			
			sample4 s4 = new sample4(11, 10);
			s4.m1();
			
			System.out.println("---");
			sample4 s5 = new sample4(11,22);
			s5.m2(11,22);
		}

}
