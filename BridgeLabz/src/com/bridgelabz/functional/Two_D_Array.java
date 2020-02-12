package com.bridgelabz.functional;

import java.util.Scanner;

public class Two_D_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Columns");
		int col = sc.nextInt();
		System.out.println("Enter Number of Rows");
		int row = sc.nextInt();
		Object array[][] = new Object[col][row];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.next();
			}
		}
		sc.close();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
		}
	}
}
