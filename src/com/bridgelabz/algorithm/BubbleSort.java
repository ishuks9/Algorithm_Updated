package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int i, j, temp;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number to be sort:");
		int number = scanner.nextInt();
		int array[] = new int[number];

		System.out.println("Enter " + number + " integers: ");
		for (i = 0; i < number; i++)
			array[i] = scanner.nextInt();
		scanner.close();
		for (i = 0; i < (number - 1); i++) {
			for (j = 0; j < number - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted list of integers:");

		for (i = 0; i < number; i++)
			System.out.println(array[i]);
	}

}
