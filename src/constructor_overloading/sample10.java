package constructor_overloading;

public class sample10 
{
	int a;
	int b;
	String s;
	
	sample10(int x, int y, String ss)
	{
		a= x;
		b=y;
		s=ss;
		
	}
	public void m1()
	{
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		sample10 a10 = new sample10(10,1,"jay");
		a10.m1();
	}

}
