package com.dinesh.programs.JavaPracticePrograms1;

import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns = sc.nextInt();

		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the matrix elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int[][] rotatedMatrix = rotateMatrixClockwise(matrix);
		System.out.println("Rotated matrix");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.println(rotatedMatrix[j][i] + " ");

			}
			System.out.println();
		}
	}

	public static int[][] rotateMatrixClockwise(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[][] rotatedMatrix = new int[columns][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

}
