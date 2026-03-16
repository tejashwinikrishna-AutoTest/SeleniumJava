package onlinejavatraining;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if statement
		int a = 15;// local variable
		if (a > 10) {
			System.out.println("a is greater than 10");
		}

		// if else statement
		int b = 10;// local variable
		if (b / 2 == 0) {// it is 5
			System.out.println("result of b is equal to 0");
		} else {
			System.out.println("result of b is not equal to 0");
		}

		// if else if ladder statement
		int q = 200; // local variable
		int w = 300; // local variable
		if (q < w) {
			System.out.println("q is lesser than w");
		} else if (q == w) {
			System.out.println("q is equal to w");
		} else {
			System.out.println("q is greater than w");
		}

		// Nested if statement
		int age = 9;// local variable
		int wgt = 55;// local variable

		// outer if statement
		if (age > 18) {
			// inner if statement
			if (wgt > 50) {
				System.out.println("eligible");
			} else {
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("age is not greater than 18");
		}
	}

}
