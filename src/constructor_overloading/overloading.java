package constructor_overloading;

public class overloading
{
	int a;
	int b;
	String s="no";
	
	overloading(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}
	overloading(int l, int m,String s)
	{
		a=l;
		b=m;
		System.out.println(l+m+s);
	}
	public void name() 
	{
		System.out.println(a-b);
	}
	public void kname() 
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		overloading ss = new overloading(10,10,"karduya");
		
		ss.kname();
		ss.name();
		
	}
	

}
