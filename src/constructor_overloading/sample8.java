package constructor_overloading;

public class sample8
{
	int a;
	int b;
	String s;
	
	sample8(int x,int y)
	{
		a=x;
		b=y;
		
	}
	public void m1()
	{
		System.out.println(a+b);
	}
	// constructor overloading
	sample8(String ss)
	{
		s=ss;
		
	}
	public void m2()
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		sample8 s8 = new sample8(1,2);
		s8.m1();
		
		// constructor overloading 
		sample8 s88 = new sample8("jay");
		s88.m2();
		
		// constructor from the differrent class
		sample9 s9 = new sample9("differnet clsss");
		s9.m1();
	}

}
