package com.dinesh.programs.JavaPracticePrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.nextLine();
		String reversedString = reverseString(name);
 
		System.out.println("Reversed string:"+reversedString);
		
	}
	public static String reverseString(String str) {
		StringBuilder reversed =new StringBuilder(str);
		reversed.reverse();
		return reversed.toString();
	}

}
