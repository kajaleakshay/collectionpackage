
package method_combine;

public class sample_1
{

	public static void main(String[] args)
	{
		sample_1.m1("suraj");
		
		sample_1 s1 = new sample_1();
		s1.m2(21);
		
	}
	public static void m1(String name)
	{
		System.out.println("name of the student :"+name);
	}
	public void m2(int rollno)
	{
		System.out.println("student roll  no"+rollno);
	}

}
