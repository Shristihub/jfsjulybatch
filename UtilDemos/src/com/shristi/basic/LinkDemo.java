package com.shristi.basic;

import java.util.Collections;
import java.util.LinkedList;

public class LinkDemo {

	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<>();
		linked.add("apple");
		linked.add("mango");
		linked.addFirst("pineapple");
		linked.add("orange");
		linked.add(1, "kiwi");
		linked.set(2, "grapes");
		System.out.println(linked);
		Collections.sort(linked);
		System.out.println(linked);
		System.out.println();
		// list queue deque
		// add() offer offerFirst, offerList
		// element() peek peekFirst, peekLast
		// remove() poll pollFirst, pollFirst
		
		System.out.println(linked.element());
		// returns the head will not remove
		System.out.println(linked.peek());
		System.out.println(linked);
		// returns the head and removes it
		System.out.println(linked.poll());
		System.out.println(linked);
		System.out.println(linked.pollLast());
		System.out.println(linked);
		System.out.println(linked.pollFirst());
		System.out.println(linked);
		System.out.println(linked.remove());
		System.out.println(linked);
		System.out.println(linked.pollFirst());
		System.out.println(linked);
		System.out.println();
		System.out.println(linked.pollFirst()); // returns null
//		System.out.println(linked.remove()); // throws exception
//		System.out.println(linked.element()); // throws exception
		System.out.println(linked.peek());
	}
}
