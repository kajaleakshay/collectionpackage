package user_defined_constructor;

public class sample_1 
{
		// define the variable
	static int num_1;
	 static int num_2;
	
	// assigne the values in constructor
	sample_1()
	{
		num_1=11;
		num_2=33;
		
	}	// 
	// use that values  in the method
	public void add()
	{
		System.out.println(num_1+num_2);
	}
	public static void sub()
	{
		System.out.println(num_1-num_2);
	}
	public static void main(String[] args) 
	{
		sample_1 s1 = new sample_1();
		s1.add();
		sub();
	}
	

}
