package onlinejavatraining;

public class LoopStatement {
	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 5; i++) {// i=1 then check for condition 1<=5 true it will print body then it will get
										// incremented by 1 that is i=2
			System.out.println(i);
		}
		System.out.println("====================End of for loop=======================");
		// for each loop
		Object a[] = { "selenium", 10.5, 3 > 12, 'c', 5 };
		Integer c[] = { 1, 2, 3 };// Integer is a parent class for int , int is primitive datatype whereas class
									// Integer is a non primitive datatype
		// print an array using for each loop
		for (Object b : a) {// whatever datatype we use to define a variable use the same datatype while
							// declaring in the loop
			System.out.println(b);
		}

		for (Integer i : c) {// predefined syntax
			System.out.println(i);
		}

		System.out.println("====================End of for each loop=======================");
		// while loop
		int i = 10;// local variable

		// while loop
		while (i < 15 & i < 12) {
			System.out.println(i);
			i++;
		}
		System.out.println("====================End of while loop=======================");

		// do while loop at least to print once whatever the condition is we use do
		// while loop
		int d = 1;// local variable
		do {
			System.out.println(d);
			d++;
		} while (d < 5);
		System.out.println("====================End of do while loop=======================");
	}
}
