package constructor;

public class constructor02 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		m2();
		
		constructor02 s2 = new constructor02();
		s2.m1();
		
		constuctor03 s3 =new constuctor03(); // acess from the diff. class
		s3.m3();
		
		constuctor03.m4();
		
	}

	public void m1()
	{ int a=11;
	
		System.out.println(a);
	}
	public static  void m2()
	{
		  int c =33;
		System.out.println(c);
	}
}
