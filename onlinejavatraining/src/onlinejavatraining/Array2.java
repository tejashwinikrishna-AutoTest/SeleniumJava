package onlinejavatraining;

public class Array2 {
	public static void main(String[] args) {

		// we can write an array in the below fashion also
		int b[] = { 1, 2, 3, 4, 5 };// defining int array
		String s[] = { "Hi", "Hello" };// defining string array
		Object a[] = { 1, 2, 3, 4.5, 6 > 8, "selenium", 'h' };// defining the object array

		System.out.println(a.length);// 7
		System.out.println(b.length);// 5
		System.out.println(s.length);// 2

		System.out.println(a[5]);// selenium
		System.out.println(b[4]);// 5
		System.out.println(s[1]);// Hi

		a[5] = "Automation";// modifying array value using index
		System.out.println(a[5]);// Automation

	}

}
