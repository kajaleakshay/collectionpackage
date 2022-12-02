package method_nonstatic;

public class sample_introduction 
{
	public static void main(String[] args)
	{
		// how to cll the non static method in main method class and another calss
		// non static method call from the same class
		//classname objectname =new classname();
		//objectname.methodname();
		// classname --.>datatype of the object
		// object name-->to identityfy the object
		//neew --->to create empty object
		//class name-->constructor to copy al the member in the class
		
		sample_introduction s1=new sample_introduction();
		s1.m1();					// its for non static r. method
		System.out.println("gm");
		
		// for static r.method
		m2();
	}
	
	public void m1()  // non static regular method
	{
		System.out.println("hi");
	}
	
	public static void m2()
	{
		System.out.println("its static method");
	}
	
	
	
}
