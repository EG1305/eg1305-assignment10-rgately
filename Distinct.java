package com.reagan.assignment10;

import java.util.ArrayList;
import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		
		int[] userValues = new int[10];
		Scanner myScanner = new Scanner(System.in);
	
		for(int i = 0; i < userValues.length; i++) {
			
			System.out.print("Enter number " + (i+1) + ":");
			userValues[i] = myScanner.nextInt();
		}
		
		int[] distinct = getDistinct(userValues);
		
		System.out.println("Distinct numbers are:");
		for(int i = 0; i < distinct.length; i++) {
			System.out.print(distinct[i] + " ");
		}
		
		myScanner.close();
	}
	
	public static int[] getDistinct(int[] arr) {
		
		if(arr.length == 1) return arr;
		
		ArrayList<Integer> distinct = new ArrayList<Integer>();
		
		distinct.add(arr[0]);
		for(int i = 0; i < arr.length; i++) {
			
			boolean found = false;
			for(int j = 0; j < distinct.size(); j++) {
				
				if(distinct.get(j) == arr[i]) found = true;
			}
			
			if(!found) distinct.add(arr[i]);
		}
		
		int[] distinctArray = new int[distinct.size()];
		
		for(int i = 0; i < distinctArray.length; i++) {
			distinctArray[i] = distinct.get(i);
		}
		
		return distinctArray;
	}
}
