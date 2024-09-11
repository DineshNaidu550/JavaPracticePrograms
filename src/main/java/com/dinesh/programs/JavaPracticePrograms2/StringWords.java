package com.dinesh.programs.JavaPracticePrograms2;

import java.util.Scanner;

public class StringWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int count = CountNumberofWords(str);
		System.out.println("Number of words in the String :"+count);
	}

	private static int CountNumberofWords(String str) {
		int count=0;
		if(str.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<str.length();i++)
		if (str.charAt(i)==' '&&str.charAt(i+1)!=' '){
			count++;
		}
		return count;
	}
}
