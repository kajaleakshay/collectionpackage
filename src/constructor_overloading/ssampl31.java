package constructor_overloading;

public class ssampl31
{
	int z=4;
	
	ssampl31(int a)
	{
		System.out.println(z+a);
	}
	ssampl31(String s)
	{
		System.out.println(s+z);
	}
	
	public static void main(String[] args) {
		
		ssampl31 k = new ssampl31("kari"+10+5);
		
	}

}
