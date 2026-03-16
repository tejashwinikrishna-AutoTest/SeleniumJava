package onlinejavatraining;

public class Array3 {
	static int c[]= {22,3,44,5};
	public static void main(String[] args) {
		int b=c[0];
		for (int element : c) {
			if(b>element) {
				System.out.println(b);
			}
			else {
				System.out.println('A');
			}
		}

	}

}
