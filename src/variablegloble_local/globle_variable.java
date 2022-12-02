package variablegloble_local;

public class globle_variable
{
	int a = 44; // globle variable call in same class
	
	static int b=22;
	
	public static void main(String[] args) 
	{
		m1();
		
		globle_variable s1 =new globle_variable();
		s1.m2();
	}
	public static void m1()
	{
		System.out.println(b); 
		
		globle_variable s11 =new globle_variable();	// to call non static variable in static method we have to create object of the class
		System.out.println(s11.a);//			and then objectname.variable name
	}
	public void m2()

	{
		System.out.println(a);
	}
}
