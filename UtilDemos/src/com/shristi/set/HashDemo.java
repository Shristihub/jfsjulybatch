package com.shristi.set;

import java.util.HashSet;
import java.util.TreeSet;

import com.shristi.compare.Book;

public class HashDemo {
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<>();
//		LinkedHashSet<String> set = new LinkedHashSet<>();
		TreeSet<String> set = new  TreeSet<>();
		set.add("apple");
		set.add("mango");
		set.add("pineapple");
		set.add("orange");
		set.add("mango");
		set.add("kiwi");
//		set.add(null);
		System.out.println(set);
		System.out.println();
		
		for (String fruit : set) {
			System.out.println(fruit);
		}
		System.out.println();
	
		
	}

}
