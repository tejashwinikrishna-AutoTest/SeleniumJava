package onlinejavatraining;

public class Variable2 {
	public static void main(String[] args) {
		int a = 100;// defining int type local variable
		System.out.println(a);// calling the variable a =100

		int x = 5;
		System.out.println(x);// x=5
		// always use unique variable name for same datatype
		// if we create again int x=10 then the compiler will get confusion or ambiguity
		x = 10;
		System.out.println(x);// x=10

		x = 90;
		System.out.println(x);// x=90

		char c = 'h';// char type local variable ,should be placed inside single quote
		System.out.println(c);// h

		boolean b = true;
		System.out.println(b);// true
		b = false;
		System.out.println(b);// false
		System.out.println(3 > 12);// condition 3>12 =false o/p

		int e = 100;// int type local variable
		int f = 200;// int type local variable
		boolean z = e > f;
		System.out.println(z);// false

	}

}
