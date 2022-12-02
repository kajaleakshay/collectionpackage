package method_combine;

public class sample_12
{

	public static void main(String[] args)
	{
		m1("kajale",22,'e',79.55f);
		sample_12 s12 =new sample_12();
		s12.m2("akshay", 22, 22.02f);
	}
	public static void m1(String s, int rollno, char section ,float per)
	{
		System.out.println("studentinfo :"+s+" "+rollno+" "+section+" "+per);
	}
	public void m2(String a,int area,float fax)
	{
		System.out.println("farmer information :"+a+" "+area+" "+fax);
	}

}
