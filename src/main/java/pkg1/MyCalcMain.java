package pkg1;

public class MyCalcMain {

	public static void main(String[] args) {

		MyCalc ob = new MyCalc();
		System.out.println("Sum= "+ob.sum(20,10));
		System.out.println("diff= "+ob.diff(20,10));
		System.out.println("mul= "+ob.mul(20,10));
		System.out.println("div= "+ob.div(20,10));
	}
}