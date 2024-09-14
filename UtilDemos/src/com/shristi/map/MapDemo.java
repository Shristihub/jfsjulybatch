package com.shristi.map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Ram");
		map.put(200,"Rohan");
		map.put(null,"Ram");
		map.put(14,"Anna");
		map.put(17,"Sera");
		map.put(1,"Selvi");
		map.put(18,"Ram");
		map.put(100, null);
		System.out.println(map);
		
		// convert the map to a set by getting the keys
		Set<Integer> keys = map.keySet();// returns the keys in th form of set
		for(Integer key:keys) {
			String val = map.get(key);
			System.out.println(key+" "+val);
		}
		System.out.println();
		System.out.println(map.get(200)); // Rohan
		System.out.println(map.get(100)); // null
		System.out.println(map.containsKey(200));// true
		System.out.println(map.containsKey(100));// false
		
		System.out.println(map.getOrDefault(100, "Ronnie"));
		// using putifabsent of key is available dont change else add value
		System.out.println(map);
		map.putIfAbsent(17,"Jagan");
		map.putIfAbsent(110,"Nila");
		System.out.println(map);
		
		
		
	}
	
	
	
}
