package onlinejavatraining;

public class MethodOverload3 extends MethodOverload2{// introducing parameter to make different categorization

	public static void main(String[] args) {
		MethodOverload3 m3=new MethodOverload3();
		m3.sum(25, 15);//40
		m3.sum(2, 3, 5);//10
	}

}
