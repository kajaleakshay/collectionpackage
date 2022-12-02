package method_combine;

public class sample_2
{
	public static void main(String[] args)
	{
		sample_2 s2 = new sample_2();
		s2.stuinfo("suaraj", 22, 22.22f, 'c');
		
		m1('d');
	}
	
	public void stuinfo(String name,int rollno ,float per,char grade)
	{
		System.out.println("student info "+name+" "+rollno+" "+per+" "+grade);
	}
	public static void m1(char section)
	{
		System.out.println(section);
	}
	
}
