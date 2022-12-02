package loop_if;

public class sample_44 {

	public static void main(String[] args) 
	{
		 int a=10;
		
		 if(a>=1 &a<=25)
		 {
			 System.out.println("student is fail");
			 if(a>=20)
			 {
				 System.out.println("should too practice more");
			 }
		 }
		 else if (a>=26 & a<=50)
		 {
			 System.out.println("student is paass but not well");
		 }
		 else if(a>=51 & a<=75)
		 {
			 System.out.println("student is pass with first class");
			  if(a<=75 & a>=70)
			  {
				  System.out.println(" next time distingtion");
			  }
		 }
		 else if(a>=76 & a<=80)
		 {
			 System.out.println("paass with the distingtion");
		 }
		 else 
		 {
			 System.out.println("student is must have to ty the business");
		 }
	}

}
