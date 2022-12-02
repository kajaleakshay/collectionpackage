package loop_if;

public class java_nestedif 
{

	public static void main(String[] args) 
	{
		int a =200;
		
		if(a<=50 & a>=10)
		{
			System.out.println("it is less than 50");
			   
			String s="akshay";
			if(s== "akshay")		//inner if
			{
				System.out.println("akshay is good student");
				
			}
			else
			{
				System.out.println("other student is bad");
			}
		}
		else if(a>=100 & a<=200)
		{
			System.out.println("int is 200 and it is perfect");
			 String k ="kajale";
			 if(k== "kajale")
			 {
				 System.out.println("kajale is the surname");
			 }
			 
		}
		else
		{
			System.out.println("no other is matter in that case");
		}
	}

}
