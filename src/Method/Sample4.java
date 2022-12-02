package Method;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String farmer_name;
		int area;
		char section;
		
		farmer_name="akshay";
		area=22;
		section='a';
		
		System.out.println("its all infomation about the farmer");
		System.out.println(farmer_name);
		System.out.println(area);
		System.out.println(section);
		m1( "akshay");
		m2('a');
		
	}
	
	public static void m1(String farmer_name)
	{
		System.out.println(farmer_name);// 	its shows the error if we use the variable at out side of the main metghod body
		
	}

		public static void m2(char section)
		{
			System.out.println(section);
		}
}
