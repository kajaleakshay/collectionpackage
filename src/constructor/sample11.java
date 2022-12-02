package constructor;

public class sample11 
{
	public void nonstatic(String s) 
	{
		System.out.println(s+"it is the non static method");
		
	}
	public static void staticmethod(char k)
	{
		System.out.println(k+"it is staic method");
	}
	public static void main(String[] args) 
	{
		sample11 ak = new sample11(); // class name obj = new classname();
		
		ak.nonstatic("akshau");
		
		staticmethod('k');
		
		// from the diff class
		constuctor03 kk = new constuctor03();
		kk.m3();
	}

}
