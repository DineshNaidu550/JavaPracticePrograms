package com.dinesh.programs.JavaPracticePrograms1;

public class ReverseString {
	public static void main(String[]args) {
		String str ="Dinesh",nstr="";
		char ch;
		System.out.println("Original Name");
		System.out.println("Dinesh");
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			nstr =ch+nstr;
		}
		System.out.println("Reversed Name:");
		System.out.println(nstr);
	}

}
