package loop_if;

public class sample1
{

	public static void main(String[] args) {
		
		int a=11;
		
		if(a>=10 & a<=20)
		{
			System.out.println("provide dicount to the customers");
			
			if(a>=9 &a<=15)
			{
				System.out.println("it is the normal overway");
			}
		}
		else if(a>=21 &a<=30)
		{
			System.out.println("dicount is not allowed to the customers");
		}
		else
		{
			System.out.println("it is not the customer it is the terririst");
		}
		
		
	}
}
