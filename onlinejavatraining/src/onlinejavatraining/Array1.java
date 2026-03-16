package onlinejavatraining;

public class Array1 {
	public static void main(String[] args) {

		// Declare an array with length of 5
		int a[] = new int[5];

		// print the length of array
		System.out.println(a.length);

		// print the default value of an integer array
		for (int element : a) {
			System.out.println(element);
		}

		// assign value to an array
		a[0] = 65;
		a[1] = 99;
		a[2] = 5;
		a[3] = 10;
		a[4] = 6;

		System.out.println(a[3]);

		// print all the elements in an array
		for (int element : a) {
			System.out.println(element);
		}
	}

}
