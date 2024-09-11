package com.dinesh.programs.JavaPracticePrograms3;

import java.util.Scanner;

public class SimpleJavaProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number");
		int num =sc .nextInt();
     int fact =1;
		for (int i =1 ;i<=num;i++) {
			System.out.println("\t"+ i);
			fact =fact *i;
			}
		System.out.println("Factorial of "+num+"is"+fact);

	}

}
