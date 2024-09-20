package com.dinesh.programs.JavaPracticePrograms3;

public class MethodOverloading {
	public int sum(int a, int b) {
		return a + b;

	}

	public int sum(int x, int y, int z) {
		return x + y + z;
	}

	public float sum(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		MethodOverloading sum = new MethodOverloading();
		System.out.println(sum.sum(10, 20));
		System.out.println(sum.sum(10, 20, 30));
		System.out.println(sum.sum(10f, 20f));
	}

}
