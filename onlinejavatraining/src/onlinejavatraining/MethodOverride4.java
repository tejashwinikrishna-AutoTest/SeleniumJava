package onlinejavatraining;

public class MethodOverride4 extends MethodOverride3{

	@Override
	public void run() {
		System.out.println("you are running");
	}

	public static void main(String[] args) {
		MethodOverride3 m3=new MethodOverride3();
		MethodOverride4 m4=new MethodOverride4();

		m3.run();
		m4.run();
	}
}
