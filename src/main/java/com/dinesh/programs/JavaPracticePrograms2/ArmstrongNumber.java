package com.dinesh.programs.JavaPracticePrograms2;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		int n, count = 0, a, b, c, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		a = n;
		c = n;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		while (n > 0) {
			b = n % 10;
			sum=(int)(sum+Math.pow(b,count));
			n=n/10;
		}
		if(sum==c) {
			System.out.println(c + " is a Armstrong number ");
		}
			else {
				System.out.println(c + " is not a Armstrong number");
			}

	}

}
