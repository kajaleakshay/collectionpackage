package loop_if;

public class sample_5 
{

	public static void main(String[] args)
	{
		int premarks=80;
	
		
		if(premarks>=50 &premarks<=75)
		{
			System.out.println("ready for the main exam");
		}
	
		else if(premarks>=76 &premarks <=100)
		{
			System.out.println("ready for interview");
			
			int mainmarks =75;
			if(mainmarks>=70)
			{
				System.out.println("ready for the interview2");
			}
		}
	}

}
