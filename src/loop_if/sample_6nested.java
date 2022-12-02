package loop_if;

public class sample_6nested 
{

	public static void main(String[] args)
	{
		int marks=55;
		
		if(marks>=25 &marks<=50)
		{
			System.out.println("its the not qualify for the main exm");
		}
		else if(marks<=100 & marks>=50)
		{
			System.out.println(" qualify for the main exam");
			
			int  mem=75;
			
			if(mem>=50)
			{
				System.out.println("qualify for the interview");
				
				 int interview =1;
				 
				 if(interview>=10)
				 {
					 System.out.println("congratulation !");
				 }
				 else
				 {
					 System.out.println("reject from the interview");
				 }
			}
			else
			{
				System.out.println("not clear the main exam");
			}
		}
		else
		{
			System.out.println("fail");
		}
	}

}
