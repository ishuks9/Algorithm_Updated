package com.bridgelabz.algorithm;

import java.util.Scanner;

public class QuestionFindNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int range = (int) Math.pow(2,number);
		System.out.printf("Think a number between 0 and range:" , 0, number );
		int yourNumber=Utility.search(0, range);
		System.out.printf("Your guessing number is %d :", yourNumber );
		scanner.close();
	}
}
