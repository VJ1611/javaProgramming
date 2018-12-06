package javaCollections;

import java.util.*;

public class javaArrayList {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();

		System.out.println("Before adding/removing elements into ArrayList :" + alist);

		alist.add("Hello");
		alist.add("!!!");
		alist.add(", This ");
		alist.add(" Venky.");
		alist.add(3, " is ");
		alist.add(4, " is ");
		alist.add(" iss ");

		System.out.println("After adding elements into ArrayList :" + alist);

		alist.remove(" iss ");
		alist.set(4, "VJ");

		System.out.println("After removing elements into ArrayList :" + alist);
		alist.clear();
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Gregor Clegane");
		alist1.add("Khal Drogo");
		alist1.add("Cersei Lannister");
		alist1.add("Sandor Clegane");
		alist1.add("Tyrion Lannister");

		int pos = alist1.indexOf("Tyrion Lannister");

		System.out.println("Index of  Tyrion Lannister :" + pos);

		String str1 = alist1.get(2);

		System.out.println("Element at position 2 is :" + str1);

		int numberofitems = alist1.size();

		System.out.println("No of elements in list :" + numberofitems);

		boolean drogoPresence = alist1.contains("Khal Drogo");

		System.out.println("Drogo present in the list :" + drogoPresence);
		
		Collections.sort(alist1);
		// iterating ArrayList
		for (String str : alist1)
			System.out.println(str);
		
		Collections.sort(alist1);
		Collections.reverse(alist1);
		// iterating ArrayList
		for (String str : alist1)
			System.out.println(str);

		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));
		System.out.println("Elements are:" + obj);

	}
}
