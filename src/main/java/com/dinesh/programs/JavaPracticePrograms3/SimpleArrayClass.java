package com.dinesh.programs.JavaPracticePrograms3;

public class SimpleArrayClass {
	public static void main(String[] args) {

		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[1]);
		System.out.println("Here is the another approach");
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		// System.out.println(a);
		for (int arr : a) {
			System.out.println(arr);
		}

	}
}