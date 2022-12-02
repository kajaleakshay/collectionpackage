package constructor_overloading;

public class sample_6 
{
	 int x;
	 int y;
	 String s;
	 String kk;
	 sample_6(int a, int b, String ss)
	 {
		 x=a;
		 y=b;
		 s=ss;
		 
	 }
	 public void m1()
	 {
		 System.out.println(x+" "+y+" "+s);
	 }
	 sample_6(String k)
	 {
		 kk=k;
	 }
	 public void m2(int z)
	 {
		 System.out.println(z+" "+kk);
	 }
	 
	 public static void main(String[] args)
	 {
		 sample_6 s6 = new sample_6(1,22,"akshay");
		 s6.m1();
		 
		 sample_6 s66 = new sample_6("kajale");
		 s66.m2(10);
	}
}
