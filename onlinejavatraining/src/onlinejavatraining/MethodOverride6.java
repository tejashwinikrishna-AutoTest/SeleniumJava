package onlinejavatraining;

public class MethodOverride6 extends MethodOverride5{//if the method is present in parent and not present in child then we pass the reference of parent class and create child object but we can't call the method that is present only in child

	@Override
	public void cook() {
		System.out.println("I is cooking");
	}

	public void angry() {
		System.out.println("I am angry");
	}

	public static void main(String[] args) {
		MethodOverride5 m5=new MethodOverride6();
		m5.cook();//child
		m5.eat();
		//m5.angry(); -Undefined because of dynamic method dispatch concept

		MethodOverride6 m6=new MethodOverride6();
		m6.angry();

		MethodOverride5 m7=new MethodOverride5();
		m7.cook();
	}
}
