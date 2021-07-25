package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSortString {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of a string:");
		int sizeString  = scanner.nextInt();
		String[] arrayString = new String[sizeString ];
		int length=arrayString.length;
		//System.out.println(length);
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < length; i++) {
			arrayString[i] = scanner.next();
		}
		
		//System.out.println("List after sorting:");
		scanner.close();
		Utility.insertionSort(arrayString);
		Utility.printArray(arrayString);
	}
}
