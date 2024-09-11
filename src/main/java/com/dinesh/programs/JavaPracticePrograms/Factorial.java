package com.dinesh.programs.JavaPracticePrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the factorial number you needed:");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println("\t" + i);
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
		fact = 1;
		for (int i = num; i >= 1; --i) {
			System.out.println("\t" + i);
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);

		sc.close();
	}

}
