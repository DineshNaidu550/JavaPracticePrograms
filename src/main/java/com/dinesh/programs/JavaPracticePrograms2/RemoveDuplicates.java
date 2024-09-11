package com.dinesh.programs.JavaPracticePrograms2;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void removeDuplicates(int[] a) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
			for (int i =0;i< a.length;i++) {
				ls .add(a[i]);
			}
			System.out.println(ls);
		
	}
	public static void main(String []args) {
		int a[] = {1,2,2,3,3,2,4,5,66,3,8};
		removeDuplicates(a);
	}

}
