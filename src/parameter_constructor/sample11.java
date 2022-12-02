package parameter_constructor;

public class sample11 
{
	int a;
	int b;
	String name;
	
	sample11(int x,int y, String naav)
	{
		a=x;
		b=y;
		name=naav;
	}
	public void m1()
	{
		System.out.println("charector of the symbol :"+a+" "+b+" "+name);
	}
	public void m2(String name,int rollno, float per)
	{
		System.out.println("student info"+name+" "+rollno+" "+per);
	}
	public static void main(String[] args)
	{
		sample11 s11 = new sample11(01,02,"akshay");
		s11.m1();
		
		s11.m2("kajale",20,22.22f);
		
	}
	

}
