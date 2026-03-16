package onlinejavatraining;

public class BitwiseOperator {
	public static void main(String[] args) {
		int a = 10;// local variable
		int b = 5;// local variable
		int c = 20;// local variable

		// bitwise operator -it will check all conditions
		System.out.println(a < b & a++ < c);// false
		System.out.println(a);// 11
	}
}
