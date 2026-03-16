package onlinejavatraining;

public class ExceptionHandling3 {
	public static void main(String[] args) {

		//try finally block
		try {
			int i=10/0;
			}
		catch(Exception e){
			e.printStackTrace();
		}finally {
				System.out.println("finally will execute always if the excpetion is handled or not");
			}
		try {
		int i=10/0;
		}finally {
			System.out.println("finally will execute always if the excpetion is handled or not");
		}
	}

}
