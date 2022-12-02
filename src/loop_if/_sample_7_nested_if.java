package loop_if;

public class _sample_7_nested_if 
{

	public static void main(String[] args)
	{
		 int cost =2200;
		
		if(cost<=1000 & cost>=500)
		{
			System.out.println("get the discount 10% ");
			
			if (cost >=700)
			{
				System.out.println("get free towel");
			}
		}
		else if(cost<=1500 & cost>=1001)
		{
			System.out.println("get the discount 20%");
		
		if(cost>=1200)
		{
			System.out.println("get handwash free");
		}
		}
		else if (cost<=2000 & cost >=1501)
		{
			System.out.println("get the discount 25%");
		}
		else
		{
			System.out.println("no need discount");
		}
	}

}
