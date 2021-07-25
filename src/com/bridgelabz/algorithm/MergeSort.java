package com.bridgelabz.algorithm;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number Elements....");
		int number=scanner.nextInt();
		int array[]=new int[number];
		
		System.out.println("Enter the Array Elements....");
		for(int i=0;i<array.length;i++)
			array[i]=scanner.nextInt();
		Utility.mergesort(array);
		Utility.printArray(array);
		scanner.close();
	}

}
