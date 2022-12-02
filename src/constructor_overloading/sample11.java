package constructor_overloading;

public class sample11 
{
	 int num1;
	 int num2;
	 String s;
	 
	 sample11(int x, int y, String ss)
	 {
		 num1=x;
		 num2=y;
		 s=ss;
		 
		 
	 }
	 public void m1()
	 {
		 System.out.println((num1+num2)+" "+s);
	 }
	 public static void main(String[] args)
	 {
		 sample11 s11 = new sample11(11,2,"jay");
		 s11.m1();
		 
		 System.out.println("-----");
		 
		 // constructor from the different class
		 sample12  s12 = new sample12("abhijay");
				 s12.m2();
	}

}
