package constructor_overloading;

public class sample3 {
	
	int a;
	int b;
	int c;
	String s;
	String kk;
	
	sample3(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	public void m1()
	
	{
		System.out.println(a+b);
	}
	
	sample3(String ss,String k)
	{
		s=ss;
		kk=k;
		
	}
	public void m2()
	{
		System.out.println(s+kk);
	}
	public static void main(String[] args)
	{
		sample3 s1 = new sample3(11,11,2);
		s1.m1();
		
		System.out.println("----");
		
		sample3 s2 = new sample3("abhi","avai");
				s2.m2();
	}
	

}
