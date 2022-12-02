package Method;

public class sample_2
{
	public static void main(String[] args) 
	{
		System.out.println("hi");		// different class regular method acces in another class
		
		m1();  		// regular static method run
		m2();
		
		
	}
	public static void m1()		// regular static method declaration
	{
		System.out.println("its the regular static method of m1");
	}
	public static void  m2()
	{
		System.out.println("its regualar static method of the m2");
	}
	
			// conination is very importatnt
}
