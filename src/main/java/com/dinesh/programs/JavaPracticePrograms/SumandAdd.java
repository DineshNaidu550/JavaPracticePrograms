package com.dinesh.programs.JavaPracticePrograms;

import java.util.Scanner;

public class SumandAdd {
	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println("Enter the operator(+,-,*,/)");

		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 - num2);
		char op = sc.next().charAt(0);
		double o = 0;
		switch (op) {

		}

	}
}