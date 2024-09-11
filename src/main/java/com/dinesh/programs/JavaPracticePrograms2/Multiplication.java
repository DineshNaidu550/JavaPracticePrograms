package com.dinesh.programs.JavaPracticePrograms2;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int fact = 1;
		for (int i = 1; i <= 10; i++) {
			fact = num * i;

			System.out.println(num + " * " + i + " = " + fact);

		}
	}

}
