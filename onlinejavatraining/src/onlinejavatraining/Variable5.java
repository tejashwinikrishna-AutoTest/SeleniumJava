package onlinejavatraining;

public class Variable5 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);

		int b = 2;
		System.out.println(b);

		int c = 3;
		System.out.println(c);

		int d = 4;
		System.out.println(d);
		System.out
				.println("--------------------------------------------array concept---------------------------------");
		// to print value from 1-4 we need 8 lines of code to optimise the code we go
		// for array

		int a1[] = { 1, 2, 3, 4, 5 }; // syntax datatype variablename[]={variable value} int type array
		System.out.println(a1[2]);// index start from 0

		String s[] = { "tejashwini", "krishna" };// string type array
		Object o[] = { 1, 2, 3, "tejashwini", "suhasan", 'e', 't', 3 > 12, 10.5 };// Object type array can hold all type
																					// of variable values

		for (int element : a1) {
			System.out.println(element);
		}
		for (String element : s) {
			System.out.println(element);
		}
		for (Object element : o) {
			System.out.println(element);
		}

	}

}
