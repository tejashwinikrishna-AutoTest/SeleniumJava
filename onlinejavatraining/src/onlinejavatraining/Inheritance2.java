package onlinejavatraining;

public class Inheritance2 extends Inheritance1 {// Inheritance 1 is parent class
	String name = "Selenium";// global variable

	public static void main(String[] args) {
		Inheritance2 i2 = new Inheritance2();
		System.out.println(i2.name);// Selenium
		System.out.println(i2.roll);// 5
	}

}
