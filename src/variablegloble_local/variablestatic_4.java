package variablegloble_local;

public class variablestatic_4 {
	int a=11;
	static int b=22;
	int d=44;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
		
		variablestatic_4 s44 = new variablestatic_4();
		s44.m1();
	}
	public void m1()			// in non static method both static as weell as non static variable is accesible
	{
		int c=33;			/// local variable
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
	public static void m2()		// but in  static method only static variable is accesible  if..
	{
		// System.out.println(a);
		System.out.println(b);
		
		
		variablestatic_4 s4 = new variablestatic_4();
		System.out.println(s4.a);
		System.out.println(s4.d);
		
	}

}
