package onlinejavatraining;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try{
			int i=20/2;
		}finally {
			System.out.println("finally will execute always");

			try {
				int a=8/0;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("finally inisde finally");
			}
		}
		System.out.println("Exception handled");

	}

}
