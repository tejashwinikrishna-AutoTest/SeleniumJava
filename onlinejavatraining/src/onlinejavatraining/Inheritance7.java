package onlinejavatraining;

public class Inheritance7 extends Inheritance6 {// Multilevel Inheritance inheriting the property from 5 and 6

	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		Inheritance7 i7 = new Inheritance7();
		i7.eat();
		i7.read();
		i7.write();
	}

}
