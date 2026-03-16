package onlinejavatraining;

public class Constructor3 {

	//Constructor overloading
	Constructor3(){
		System.out.println("No parameter");
	}

	Constructor3(int n){
		System.out.println("int param");
	}

	Constructor3(String s){
		System.out.println("string param");
	}

	public static void main(String[] args) {
		Constructor3 c3=new Constructor3();
		Constructor3 c4=new Constructor3(4);
		Constructor3 c5=new Constructor3("selenium");


	}


}
