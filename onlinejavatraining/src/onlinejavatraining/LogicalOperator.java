package onlinejavatraining;

public class LogicalOperator {
	public static void main(String[] args) {
		int a = 10;// local variable
		int b = 5;// local variable
		int c = 20;// local variable

		// logical operator -if 1st condition is false second will not check
		System.out.println(a < b && a++ < c);// since 1st cond is false it will not check 2nd cond /if my 1st cond is
												// true and then if control go to 2nd cond value of a will change
		System.out.println(a);
		System.out.println(a > b && a++ < c);
		System.out.println(a);
	}
}
