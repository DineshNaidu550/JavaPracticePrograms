package com.dinesh.programs.JavaPracticePrograms2;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 1234, reverse = 0;
		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("Reverse of the given number is:" + reverse);
	}

}
