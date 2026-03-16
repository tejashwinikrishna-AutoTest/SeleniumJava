package onlinejavatraining;

public class Variable4 {
	int data = 50;// global variable
	static int f = 5;// static variable
	// any variable defined in class area is called global variable
	// static variable can't be defined locally

	// main method is a predefined method
	public static void main(String[] args) {
		int n = 5;// int type local variable
	}

	static int k = 7;// static variable

	// user defined method
	public static void a() {
		int a = 100;// int type local variable
	}

}
