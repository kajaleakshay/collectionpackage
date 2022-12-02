package variablegloble_local;

public class globlevariable {

	static int a=11;
	int b=22;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		m1();
		globlevariable s11 = new globlevariable();
		s11.m2();
	}
	public static void m1()
	{
		System.out.println(a);
		
		globlevariable s22 = new globlevariable();
	
		System.out.println(s22.b);
	}
	public void m2()
	{
		System.out.println(a);
		System.out.println(b);
	}

}
