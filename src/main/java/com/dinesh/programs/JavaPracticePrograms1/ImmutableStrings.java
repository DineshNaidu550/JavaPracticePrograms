package com.dinesh.programs.JavaPracticePrograms1;

public class ImmutableStrings {

// main method  
	public static void main(String argvs[]) {
		String str1 = "dadi";
		
		String str2 = str1;
		str1 = str1 + "Gulzar";

		if (str1 == str2) {
			System.out.println("Strings are not immutable.");
		} else {
// if the control reaches here, then it means == operator   
// has returned a false value.  
			System.out.println("Strings are immutable.");
		}
	}
}
