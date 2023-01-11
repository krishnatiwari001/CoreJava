package JavaBasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("Name");
		ar.add("Krishna");
		ar.add("Age");
		ar.add(32);
		System.out.println(ar.get(0));
//Print all ArrayList values
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		//Integer ArrayList
		ArrayList <Integer> ar1 = new ArrayList();
		//ar1.add("Krishna");//it will through error because we can not add string in integer ArrayList
		System.out.println("Before Removing");
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		ar.remove(0);
		System.out.println("After Removing");
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
	}

}
