package onlinejavatraining;

public class Encapsulation2 extends Encapsulation{

	//final method can't be overrided
	/*
	 * public void d() {
	 *
	 * }
	 */

	public static void main(String[] args) {
		Encapsulation2 e2=new Encapsulation2();
		e2.setDetails('g');
		System.out.println(e2.getDetails());
		e2.setName("Tejashwini");
		System.out.println(e2.getName());
	}
}
