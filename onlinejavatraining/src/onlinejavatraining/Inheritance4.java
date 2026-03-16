package onlinejavatraining;

public class Inheritance4 extends Inheritance3 {// single level Inheritance

	public void multiply(int x, int y) {
		z = x * y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Inheritance4 i4 = new Inheritance4();
		int x = 20, y = 40;
		i4.add(x, y);// 60
		i4.subtract(20, 15);// 5
		i4.multiply(x, y);// 800

	}
}
