package constructor_overloading;

public class sample111 
{
	int a;
	int b;
	String s;
	char k;
	String naav;
	
	sample111(int x,int y,String ss,char kk)
	{
		a=x;
		b=y;
		s=ss;
		k=kk;
		
	}
	sample111(String name)
	{
		naav = name;
	}
	public void m1()
	{
		System.out.println("operation :"+(a+b)+naav+" "+k);
	}
	public static void main(String[] args) 
	{
		sample111 s111= new sample111(11,22,"abhi",'c');
		s111.m1();
		
		sample111 s11 = new  sample111("abhi");
		s11.m1();
	}
}
