package loop_if;

public class ifloop_88 {

	public static void main(String[] args)
	{
		int marks=20;
		
		if(marks>=10 & marks<=50)
		{
			System.out.println("marks is less than the 50");
			if(marks<=35)
			{
				System.out.println("student is fail");
			}
		}
		else if(marks>=51 & marks<=100)
		{
			System.out.println("student get the distingtion");
		}
		else if(marks>=101 & marks<=150)
		{
			System.out.println("student get pass ");
		}
		else if(marks>=151 & marks<=200)
		{
			System.out.println("student is pass ");
			if(marks>=160)
			{
				System.out.println("student is eligible for the scholership");
			}
		}
		else 
		{
			System.out.println("student is absent in the exam");
		}
	}

}
