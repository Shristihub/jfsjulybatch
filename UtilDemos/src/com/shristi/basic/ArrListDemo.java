package com.shristi.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrListDemo {

	public static void main(String[] args) {
		// ordered by index
		List<String> list = new ArrayList<>();
		list.add("Raju");
		list.add("100");
		list.add(1, "Ronnie");
		System.out.println(list); // Raju, Ronnie,100
		list.add("Jennie");
		list.add("Kevin");
		list.set(4, "Arya");
		list.add("Kevin");
		list.add("Kevin");
//		list.add(null);
		System.out.println(list.get(4));
		System.out.println(list);
		for (String name : list) {
			System.out.println(name);
		}
		Collections.sort(list);
		System.out.println();
		System.out.println("Sorted");
		for (String uname : list) {
			System.out.println(uname);
		}
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}

		System.out.println();
		System.out.println("Using ListIterator");
		ListIterator<String> listIt = list.listIterator(list.size());
		while (listIt.hasPrevious()) {
			String name = listIt.previous();
			System.out.println(name);
		}
	}
}
