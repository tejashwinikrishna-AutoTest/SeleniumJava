package onlinejavatraining;

public class TypeCasting {

	public static void main(String[] args) {

		//==================Narrowing/manual casting=====================//
		//double to int
		double b=5.9;
		int a=(int) b;
		System.out.println(a);//5
		System.out.println(b);//5.9

		//string to int conversion
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i);//10

		//int to String conversion
		int z=5;
		String t=String.valueOf(z);
		System.out.println(t.length());//1
		System.out.println(t);


		//=====================Widening/Auto casting==============//

		//int to double
		int w=5;
		double r=w;
		System.out.println(r);

		//double to string
		double q=4.8;
		String y=String.valueOf(q);
		System.out.println(y);
		System.out.println(y.length());
	}

}
