package onlinejavatraining;

public class Unaryoperator {
	public static void main(String[] args) {
		int a = 5;// local variable
		int b = 5;// localvariable

		System.out.println(a);// 5
		System.out.println(a++);// 5 is a will get printed and in background 1 will get added
		System.out.println(a);// 6
		System.out.println(++a);// 7
		System.out.println(a);// 7
		System.out.println(a--);// 7
		System.out.println(a--);// 6
		System.out.println(a);// 5
		System.out.println(--a);// 4
		System.out.println(a++ + ++a);// 4->5,5->6 4+6=10
		System.out.println(a + a++);// 6 + 6->7 6+6=12
		System.out.println(b++ + b--);// 5->6 + 6->5=5+6=11
		System.out.println(b-- + ++b);// 5->4 + 4->5 5+5=10
		System.out.println(b-- + ++b);// 5->4 + 4->5 5+5=10
		System.out.println(b);// 5
		System.out.println(a++ + b++);// 7->8 + 5->6 7+5=12
	}

}
