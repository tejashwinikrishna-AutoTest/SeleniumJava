package onlinejavatraining;

public class Constructor2 {

	int id;// global variable
	String name;// global variable
	String address;// global variable

	// default constructor
	Constructor2() {
		System.out.println("defualt Constructor");
	}

	// parameterized constructor
	Constructor2(int a, String b, String c) {
		id = a;
		name = b;
		address = c;
	}

	// non static method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		// Default Constructor
		Constructor2 c2 = new Constructor2();

		// Parameterized Constructor
		Constructor2 c3 = new Constructor2(1, "Tejashwini K", "Hoskote");
		c3.displayInfo();
		Constructor2 c4 = new Constructor2(2, "Suhasan R", "Malur");
		c4.displayInfo();

	}

}
