package loop_if;

public class sample_10
{

	public static void main(String[] args) 
	{
		int income =100;
		if (income>=100 & income<=200)
		{
			System.out.println("get the loan 10");
			int loan = 21;
			if(loan<=10 &loan >=5)
			{
				System.out.println("loan for the bike");
			}
			else if(loan<=35 &loan >=11)
			{
				System.out.println("loan for the home");
				
				if (loan<=25 &loan>=20)
				{
					System.out.println("morgage is neccesary");
				}
			}
			else if(income<=100)
			{
				System.out.println("not get the loan");
			}
		}
	}

}
