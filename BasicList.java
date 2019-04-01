package com.reagan.assignment10;

import java.util.ArrayList;

public class BasicList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			
			numbers.add(i * 10);
		}
		
		System.out.println(numbers.toString());
		System.out.println("Size of the list is " + numbers.size());
		
		numbers.add(numbers.size() / 2, 200);
		System.out.println(numbers.toString());
		System.out.println("Size of the list is " + numbers.size());
		System.out.println("Value of 200 is located at index " + numbers.indexOf(200));
		
	}
}
