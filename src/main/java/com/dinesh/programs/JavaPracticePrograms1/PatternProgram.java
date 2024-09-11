package com.dinesh.programs.JavaPracticePrograms1;

public class PatternProgram {
	public static void patternNum(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int n = 9;
		patternNum(n);
	}

}
