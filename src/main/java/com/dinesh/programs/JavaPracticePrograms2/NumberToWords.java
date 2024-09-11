package com.dinesh.programs.JavaPracticePrograms2;

import java.util.Scanner;

public class NumberToWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		if (number < 1 || number > 10) {
			System.out.println("Invalid number");
		} else {
			String str[] = { " ", "one", "two", "three", "four", "Five", "six", "seven", "eight", "nine", "ten" };

			System.out.println(str[number]);
		}
	}

}
