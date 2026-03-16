package onlinejavatraining;

public class Static5 {

	int x = 10;// global variable
	static int y = 5;// static variable

	// non static method
	public void a() {
		int z = 10;// local variable
		System.out.println(z);// 10
	}

	static int b = 6;// static variable

	// static method
	public static void b() {
		int a = 5;// local variable
		System.out.println(a);// 5
	}

	public static void main(String[] args) {
		Static5 s5 = new Static5();
		Static4 s4 = new Static4();

		s5.a();// 10
		System.out.println(Static4.z);// 5
		Static4.z = 100;
		System.out.println(Static4.z);// 100
		System.out.println(Static5.b);// 6 not an appropriate way
		System.out.println(b);// 6 correct way
		b();// 5
		System.out.println(s5.x);// 10
		System.out.println(y);// 5
		System.out.println(s4.y);
		s4.b();

	}
}
