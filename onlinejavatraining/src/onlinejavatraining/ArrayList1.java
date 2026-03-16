package onlinejavatraining;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
	public static void main(String[] args) {

		// Create Arraylist instead of array as the size is dynamic whereas in array
		// size is fixed
		// it provide more flexbility compared to array
		ArrayList<Object> obj = new ArrayList<>();

		// adding object in arraylist
		obj.add(1);
		obj.add("Selenium");
		obj.add(3.5);
		obj.add(4 > 5);
		obj.add('a');

		// print arraylist element - 1st way
		System.out.println(obj);

		// print arraylist element using foreach loop
		for (Object ob : obj) {
			System.out.println("for each loop : " + ob);
		}

		// print arraylist element using for loop
		for (Object element : obj) {
			System.out.println("using for loop : " + element);
		}
		/*correct usage comparision
		check if value exists -conatins()
		print only matching values - equals()
		compare objects -equals()
		compare primitives - ==*/

		// adding the values in single line
		obj.addAll(Arrays.asList(99,100,"Automation"));
		System.out.println(obj);

	}

}
