package constructor_overloading;

public class sample5 {
	
	int a;
	int b;
	  
	sample5(int x, int y)
	{
		a=x;
		b=y;
		
	}
	public void m1()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
	
		sample5 s5 = new sample5(11,22);
		s5.m1();
	}
	

}
