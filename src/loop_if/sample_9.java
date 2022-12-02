package loop_if;

public class sample_9
{
	public static void main(String[] args)
	{
		int cost =201;
		 if (cost <=200 &cost>=100)
		 {
			 System.out.println("discount 10%");
			 
			 if (cost>=150)
			 {
				 System.out.println("free handwash");
			 }
			 else
			 {
				 System.out.println("free 10rs");
			 }
		 }
		 else if(cost>=201 & cost<=300)
		 {
			 System.out.println("discount 20%");
			 if(cost>=250)
			 {
				 System.out.println("free cup");
			 }
		 }
		 else if (cost>=301 &cost <=400)
		 {
			 System.out.println("discount is 30%");
			 if(cost>=350)
			 {
				 System.out.println("free bucket");
			 }
		 }
		 else 
		 {
			 System.out.println(" no discount");
		 }
	}
}
