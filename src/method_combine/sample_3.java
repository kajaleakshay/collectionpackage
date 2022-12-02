package method_combine;

public class sample_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sample_3 s3 = new sample_3();
		s3.m2("akshay");
		m1("akshay", 'd', 22);
	}
	public static void m1(String name,char code,int marks)
	{
		System.out.println("marks optainning in exam :"+name+" "+code+" "+marks);
		
	}
	public void m2(String name)
	{
		System.out.println("name of the player :"+name);
	}

}
