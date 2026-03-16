package onlinejavatraining;

public class MethodOverride2 extends MethodOverride1{//overiding cann't be done in single class as overload

	@Override
	public void eat() {
		System.out.println("you are eatting");
	}

	public static void main(String[] args) {
		MethodOverride2 m2=new MethodOverride2();
		m2.eat();
	}

}
