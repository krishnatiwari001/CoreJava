package JavaBasic;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("A","Krishna");
		h.put("B","Tiwari");
		h.put("C",32);
		h.put(1,100);
		h.put(2, 200);
		
		System.out.println(h.size());
		System.out.println(h.get("A"));
		System.out.println(h.get(2));
		
		//Hashtable integer
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(1, 1000);
		//h1.put(2,"Krishna")//It will throw error because we can not add String value in Integer Hashtable
		System.out.println(h1.get(1));
		
		//String Hashtable
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(2,"Rash");
		System.out.println(h2.get(2));
		
	}

}
