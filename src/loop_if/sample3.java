package loop_if;

public class sample3
{
	public static void main(String[] args) {
		
		int marks =60;
		
		if(marks>=0 & marks<=35)
		{
			System.out.println("student is fail");
		}
		else if(marks >=35 )
		{
			System.out.println("student is pass ");
			
			if(marks >=35 & marks<=60)
			{
				System.out.println("student  pass with the 2 st class ");
			}
		}
		else if (marks >=61 &marks<=80)
		{
			System.out.println("student pass with 1 st class");
		}
		else if (marks >=81 &marks <=100)
		{
			System.out.println("student is pass with disgntions");
		}
		else
		{
			System.out.println("student is absent in the exam");
		}
	}

}
