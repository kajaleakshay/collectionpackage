package method_combine;

public class sample_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample_6 s6 = new sample_6();
		s6.m2("hello");
		
		sample_6.m1(22);
	}
	public void m2(String s )
	{
		System.out.println(s);
	}
	public static void m1(int a)
	{
		System.out.println(a);
	}

}
