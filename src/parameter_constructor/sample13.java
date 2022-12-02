package parameter_constructor;

public class sample13
{
	 int num1;
	 int num2;
	 String name;
	 
	 sample13(int a, int b, String naav)
	 {
		 num1=a;
		 num2=b;
		 name=naav;
	 }
	 public void m1()
	 {
		 System.out.println((num1+num2)+name);
	 }
	 public static void main(String[] args) 
	 {
		 sample13 s13 =new sample13(11,02,"abhi");
		 s13.m1();
	}
}
