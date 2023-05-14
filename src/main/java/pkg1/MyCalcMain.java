package pkg1;

public class MyCalcMain {
	
	public int sum2(int a, int b)
	{
		int c;		
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		MyCalc ob = new MyCalc();
		System.out.println("Sum= "+ob.sum(20,10));
		System.out.println("diff= "+ob.diff(20,10));
		System.out.println("mul= "+ob.mul(20,10));
		System.out.println("div= "+ob.div(20,10));		
		MyCalcMain ob2 = new MyCalcMain();
		//System.out.println("Sum2= "+ob2.sum2(20,10));		
	}
}