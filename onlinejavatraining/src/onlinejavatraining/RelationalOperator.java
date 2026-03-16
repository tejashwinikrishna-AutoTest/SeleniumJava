package onlinejavatraining;

public class RelationalOperator {

	public static void main(String[] args) {
		int a = 300;// local variable
		int b = 300;// local variable

		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a is equal to b");
		}

		String p = "HELLO";
		String q = "hello";

		// String comparision - 1st way -case sensitive , it is used for number
		// comparision
		if (p == q) {
			System.out.println("p and q are equal 1st way");
		} else {
			System.out.println("p and q are not equal 1st way");
		}
		// String comparision - 2nd way -case sensitive , it is used for number
		// comparision
		if (p.equals(q)) {
			System.out.println("p and q are equal 2nd way");
		} else {
			System.out.println("p and q are not equal 2nd way");
		}
		// String comparision - 3rd way -non case sensitive
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal 3rd way");
		} else {
			System.out.println("p and q are not equal 3rd way");
		}
	}

}
