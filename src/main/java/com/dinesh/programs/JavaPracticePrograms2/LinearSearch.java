package com.dinesh.programs.JavaPracticePrograms2;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = { 11, 13, 22, 32, 45, 62 };
		
		int numberToBeSearch = 45;
		
		for (int i = 0; i < array.length; i++) {
			
			if (numberToBeSearch == array[i]) {
				
				System.out.println("Number to be found" + i);
				return;

			}
		}
		System.out.println("Number not found");
	}

}
