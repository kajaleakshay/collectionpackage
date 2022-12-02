package constructor_overloading;

public class sample13 
{
	int num1;
	int num2;
	String name;
	
	sample13(String naav)
	{
		name= naav;
	}
	public void m2() 
	{
		System.out.println(name);
		
	}
	
	sample13(int a, int b)
	{
		num1=a;
		num2=b;
		
	}
 public void m1()
 {
	 System.out.println((num1+num2));
 }
 public static void main(String[] args) 
 {
	 sample13 s13 = new sample13(11,12);
	 s13.m1();
	 
	 sample13 s133 = new sample13("abhi");
	 s133.m2();
}
}
