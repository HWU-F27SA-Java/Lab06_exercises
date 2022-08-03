package exercise6;

import java.util.Scanner;

public class TestMatrix {
	static java.util.Random rand = new java.util.Random();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

//your code here
		input.close();

	}

	static Matrix buildMatrix() {
		System.out.println();
		System.out.print("Rows? ");
		int x = input.nextInt();
		System.out.print("Columns? ");
		int y = input.nextInt();

		System.out.print("Min value? ");
		double min = input.nextDouble();
		System.out.print("Max value? ");
		double max = input.nextDouble();

		double[][] t = new double[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				t[i][j] = rand.nextDouble() * (max - min) + min;
			}
		}
		return new Matrix(t);
	}

	static int menu() {
		System.out.println("------------------------------------------");
		System.out.println("0- Quit");
		System.out.println("1- Add two matrices");
		System.out.println("2- Multiply two matrices");
		System.out.println("3- Transpose a matrix");
		System.out.println("4- Calculate determinant");
		System.out.println("5- Sum several matrices");
		System.out.print("Enter your choice (0-5)? ");
		int c = input.nextInt();
		System.out.println("------------------------------------------");
		return c;
	}

}
