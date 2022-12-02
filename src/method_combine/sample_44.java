package method_combine;

public class sample_44 
{
public static void main(String[] args)
{
	sample_44 s44 = new sample_44();
	s44.m1("akshay",22,'c',22.22f);
	
	m2("abhi",22,'c',22.22f);
	
}

public void m1(String studentname, int rollno, char section , float per)
{
	System.out.println("student info :"+studentname +" "+rollno+" "+section+" "+per);
}
public static void m2(String farms , int arae, char set, float count)
{
	System.out.println("farms information :" +farms+" "+arae+" "+set+" "+count);
	
	
}		// concatination is very importatant in the java is tis manage by the + sign and always used to connect the two values
}
