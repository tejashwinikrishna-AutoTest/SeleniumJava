package onlinejavatraining;

public class Static3 {

	int roll;// global variable
	String name;// global variable
	static String clg = "VTU";// static variable

	public void getResult(int r, String n) {
		roll = r;
		name = n;
		System.out.println(roll + " " + name + " " + clg);
	}

	public static void main(String[] args) {
		Static3 s3 = new Static3();
		s3.getResult(1, "Tejashwini K");// 1 Tejashwini VTU
		s3.getResult(2, "Suhasan R");// 2 Suhasan R VTU
		s3.getResult(3, "Vidya N");// 3 Vidya N VTU
	}
}
