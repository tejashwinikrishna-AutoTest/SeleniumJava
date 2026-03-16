package onlinejavatraining;

public class Static2 {
	static int roll;// declaring static variable
	static String name;// declaring static variable
	String clg = "CMRIT";// defining global variable
	int a = 10;// defining global variable

	public static void main(String[] args) {

		Static2 s2 = new Static2();

		System.out.println(roll);// 0
		System.out.println(name);// null
		System.out.println(s2.clg);// CMRIT
		System.out.println(s2.a);// 10

	}
}
