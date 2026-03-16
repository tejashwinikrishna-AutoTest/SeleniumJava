package onlinejavatraining;

public class MethodOverload1 {// introducing parameter to make different categorization

	public void aMethod(int a,int b) {
		System.out.println("int parameter");
	}

	public void aMethod() {
		System.out.println("No parameter");
	}

	public void aMethod(int a,String b) {
		System.out.println("int and String parameter");
	}

	public static void main(String[] args) {
		MethodOverload1 m1=new MethodOverload1();
		m1.aMethod();
		m1.aMethod(5,6);
		m1.aMethod(0, null);

	}
}
