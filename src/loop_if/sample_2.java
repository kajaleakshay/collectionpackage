package loop_if;

public class sample_2		//CREATE RANGE TYPE PROBLEM
{

	public static void main(String[] args)
	{
		int shoping = 70;
		
		if(shoping >=300 & shoping <=500)
		{
			System.out.println("discount is 10%");
			
		}
		else if(shoping>=501 & shoping <=700)
		{
			System.out.println("discount is 20%");
		}
		else if (shoping >=700 & shoping <=1000)
		{
			System.out.println("discount is 25%");
		}
		else 
		{
			System.out.println("no dis count");
		}
		
	}

}
