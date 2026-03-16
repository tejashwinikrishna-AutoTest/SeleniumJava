package onlinejavatraining;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapHashTable {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();//non synchronized i.e.,fast execution
		hm.put(1,"Teju");
		hm.put(2, "Suhasan");

		System.out.println(hm.get(2));
		System.out.println(hm);

		Hashtable<Integer,String> ht=new Hashtable<>();//synchronized
		ht.put(3, "manj");

		System.out.println(ht.get(3));
	}

}
