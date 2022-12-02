package parameter_constructor;

public class sample12
{
	int a;
	int b;
	String name;
	String sirname;
	char section;
	
	sample12(int x,int y,String naav,String surname,char sec)
	{
		a=x;
		b=y;
		name=naav;
		sirname=surname;
		section=sec;
		
	}
	public void m1()
	{
		System.out.println(a+" "+b+" "+name+" "+section);
	}
	 public void m2(String name,int area)
	 {
		 System.out.println(name+" "+area);
	 }
	public static void main(String[] args) 
	{
		sample12 s12 = new sample12(12,1,"akshay","kajel",'c');
		s12.m1();
		s12.m2("kanhuji",100);
	}
}
