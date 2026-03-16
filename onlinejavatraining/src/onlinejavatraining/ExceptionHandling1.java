package onlinejavatraining;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
		int a=5/0;
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
	}

}
