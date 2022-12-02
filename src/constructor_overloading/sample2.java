package constructor_overloading;

public class sample2 
{
	 int a;
	 int b;
	 String s;
	 
	 sample2(int x,int y,String ss)
	 {
		 a=x;
		 b=y;
		 s=ss;
		 
	 }
	 public void m1()
	 {
		 System.out.println((a+b)+s);
	 }
	 public static void main(String[] args) 
	 {
		 sample2 s2 = new sample2(11,21,"abhi");
				 s2.m1();
	}

}
