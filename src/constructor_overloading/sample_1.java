package constructor_overloading;

public class sample_1
{ 
	 int a;
	 int b;
	 String s;
	 char c;
	 
	 sample_1(int x, int y, String ss)
	 {
		 a=x;
		 b=y;
		 s=ss;
		 
	 }
	 public void m1()
	 {
		 System.out.println((a+b)+" "+s);
	 }
	 // constructor overrinding
	 sample_1(char sec)
	 {
		 c=sec;
	 }
	 public void m2()
	 {
		 System.out.println(c);
	 }
	 public static void main(String[] args) 
	 {
		 sample_1 s1 = new sample_1(11,22,"satish");
		 s1.m1();
		 
		// sample_1 s2 = new sample_1('a');
				 s1.m2();
	}
	 

}
