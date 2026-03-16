package onlinejavatraining;

public class Variable9 {
	int b = 10;// int type global variable
	static int c = 5;// static variable

	// static method
	public static void d() {
		int e = 50;// local variable
		System.out.println(e);// 50
	}

	// non static method
	public void f() {
		int g = 11;// local variable
		System.out.println(g);
	}

	public static void main(String[] args) {
		int a = 6;// local variable
		System.out.println(a);// calling variable

		// static member calling
		System.out.println(c);// 5 - calling static variable can be directly called in same class -predefined
								// rule
		d();// 50 - calling static method can be directly called in same class -predefined
			// rule

		// non static member calling
		Variable9 v9 = new Variable9();// syntax for Object creation classname refvar = new classname();
		System.out.println(v9.b);// 10 -calling non static variable using class ref - predefined rule
		v9.f();// 11 -calling non static method using class ref - predefined rule

	}

}
