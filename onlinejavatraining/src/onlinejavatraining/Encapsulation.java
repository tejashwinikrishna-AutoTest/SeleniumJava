package onlinejavatraining;

public class Encapsulation {//final class cannot be inherited

	Object inputdata;//global variable
	final int c=2;//final variable
	static String Name;

	public void a() {
		//c=5;final variable can't be modified
	}

	final void d() {
		System.out.println("final method");
	}

	public void setDetails(Object s) {
		inputdata=s;
	}

	public Object getDetails() {
		return inputdata;
	}

	public void setName(String n) {
		 Name=n;
	}

	public String getName() {
		return Name;
	}

}
