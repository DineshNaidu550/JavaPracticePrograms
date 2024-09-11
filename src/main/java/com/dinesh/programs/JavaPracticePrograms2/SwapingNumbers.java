package com.dinesh.programs.JavaPracticePrograms2;

import java.util.Scanner;

public class SwapingNumbers {
	public static void main(String[] args) {
		int m, n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		m=sc.nextInt();
		System.out.println("Enter the second number");
		n=sc.nextInt();
		temp=m;
		m=n;
		n=temp;
		System.out.println("After swaping");
		System.out.println("Enter the first number"+m);
		System.out.println("Enter the second number"+n);
	}

}
