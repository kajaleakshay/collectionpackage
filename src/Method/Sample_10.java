package Method;

public class Sample_10 {

	public static void main(String[] args)		/// MANAGER --->ITS CALL FIRST BY JVM 
	{
		System.out.println("ITS WORK LIKE MANAGER");
		employee1();
		employee2();
	}
		public static void employee1()
		{
			System.out.println("its the employee work under the main method");
		}
		public static void employee2()
		{
			System.out.println("its 2nd employee also work under the manager");///	foer that we need to call that method
		}
}
