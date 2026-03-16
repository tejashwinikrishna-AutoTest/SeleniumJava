package onlinejavatraining;

public class ExceptionHandling2 {


	public static void main(String[] args) {
		String n=null;
		try {
			System.out.println(n.length());
		}
		catch(Exception e) {
                e.printStackTrace();
		}
		System.out.println("null pointer Exception");
		//Handling number format exception
		String s="Selenium";

		try {
		int i=Integer.parseInt(s);}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Number format pointer Exception");
		//ArrayIndexOutofBoundException
		int i[]= {1,2,3};
		try {
			System.out.println(i[3]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ArrayIndex out of bound Exception");
	}


}
