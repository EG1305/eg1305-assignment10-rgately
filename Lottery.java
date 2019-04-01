package com.reagan.assignment10;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		int[] userValues;
		int[] lotteryValues;

		Random rand = new Random();

		System.out.println("Enter a series of 5 numbers. (0-9)");
		userValues = getValues(5);
		lotteryValues = new int[userValues.length];

		System.out.println("\nThe lottery numbers are: ");
		for (int i = 0; i < userValues.length; i++) {
			lotteryValues[i] = rand.nextInt(10);
			System.out.print(lotteryValues[i] + " ");
		}

		int[] matches = compareNumbers(lotteryValues, userValues);
		System.out.println("\nYou matched " + matches.length + " numbers");

		if (matches.length > 0) {
			
			if(matches.length == 5) System.out.println("You won the lottery!");

			System.out.println("The matching numbers are: ");

			for (int i = 0; i < matches.length; i++) {
				System.out.print(matches[i] + " ");
			}
		}

	}

	public static int[] compareNumbers(int[] arr1, int[] arr2) {

		int[] tmp = new int[arr1.length];

		int numMatches = 0;
		for (int i = 0; i < tmp.length; i++) {

			if (arr1[i] == arr2[i]) {
				numMatches++;
				tmp[i] = arr1[i];
			} else {
				tmp[i] = -1;
			}
		}

		int[] matches = new int[numMatches];
		for (int i = 0, matchIndex = 0; i < tmp.length; i++) {

			if (tmp[i] >= 0) {
				matches[matchIndex] = tmp[i];
				matchIndex++;
			}
		}

		return matches;
	}

	public static int[] getValues(int numValues) {

		int[] values = new int[numValues];
		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < numValues; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			values[i] = myScanner.nextInt();
		}

		myScanner.close();
		return values;
	}

}
