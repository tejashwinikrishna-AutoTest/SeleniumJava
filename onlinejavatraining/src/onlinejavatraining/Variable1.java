package onlinejavatraining;//onlinejavatraining is a identifiers

//alphabets (a to z,A to Z,0-9,_,$)
//identifier shouldn't start with digit , it can start from second character)

public class Variable1 {
	// any variable defined inside class area is called global variable
	int x;// variable declaration syntax datatype variablename;
	int y = 5;// variable definition syntax datatype variablename=variablevalue;
	int a = 5; // global variable
	byte b = 9; // global variable

	public static void main(String[] args) {
		int f = 10;// local variable
		// for defining variable we need data type
		System.out.println(f);// 10
		// any variable inside method area is called local variable // local variable
		int d = 5;
		System.out.println(d);
		// Object is the superclass in java hence java is a object oriented Language
	}

}
