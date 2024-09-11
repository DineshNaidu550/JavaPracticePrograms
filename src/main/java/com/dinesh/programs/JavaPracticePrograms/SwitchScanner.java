package com.dinesh.programs.JavaPracticePrograms;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a day from 1-7:");
		
		int day = scanner.nextInt();
		switch (day) {

		case 1:
			System.out.println("It's a Monday");
			break;
		case 2:
			System.out.println("It's a Tuesday");
			break;
		case 3:
			System.out.println("It's a Wednesday");
			break;
		case 4:
			System.out.println("It's a Thursday");
			break;
		case 5:
			System.out.println("It's a Friday");
			break;
		case 6:
			System.out.println("It's a Saturday");
			break;
		case 7:
			System.out.println("It's a Sunday");
			break;
		default:
			System.out.println("Not a valid weekend");
		}
    scanner.close();
	}
}