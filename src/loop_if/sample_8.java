package loop_if;

public class sample_8
{

	public static void main(String[] args)
	{
		int premarks= 50;
		
		if(premarks<=70 &premarks>=50)
		{
			System.out.println("qualify for the main exam");
			
			int mainmarks =60;
			if(mainmarks <=100 & mainmarks>=75)
			{
				System.out.println("ready for interview");
				int interview =5;
				
				if (interview>=10)
				{
					System.out.println("conngratulations");
				}
				else
				{
					System.out.println("sorry fail in interview");
				}
			}
			else
			{
				System.out.println("sorry your fail in main");
			}
		}
		else
		{
			System.out.println("sorry fail in pre");
		}
	}

}
