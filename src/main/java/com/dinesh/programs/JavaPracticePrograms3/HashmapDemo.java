package com.dinesh.programs.JavaPracticePrograms3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapDemo {
	public static void main(String args[]) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Dinesh", 26);
		hm.put("Manohar", 32);
		hm.put("Hymavathi", 28);
		hm.put("Saraswathi", 30);
		System.out.println(hm);

		Set<String> s = hm.keySet();
		System.out.println(s);
		
		Collection<Integer> c = hm.values();
		System.out.println(c);
		
		Set s1 = hm.entrySet();
		System.out.println(s1);

	}

}
