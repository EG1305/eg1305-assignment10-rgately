package com.reagan.assignment10;

import java.util.Scanner;

public class TestRectangle {

	public static void main (String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the number od rectangles to be created");
		int numRectangles = myScanner.nextInt();
		
		Rectangle[] rectangles = new Rectangle[numRectangles];
		
		for(int i = 0; i < numRectangles; i++) {
			
			System.out.println("Enter rectangle " + (i+1) + " length");
			double length = myScanner.nextDouble();
			System.out.println("Enter rectangle " + (i+1) + " width");
			double width = myScanner.nextDouble();
			
			rectangles[i] = new Rectangle(length, width);
		}
		
		System.out.println("Here are the rectangles that you created");
		
		for(int i = 0; i < rectangles.length; i++) {
			
			System.out.println("Rectangle " + (i + 1) + " : area: " + rectangles[i].getArea() + " : perimeter: " + rectangles[i].getPerimeter());
		}
		
		myScanner.close();
	}
	
}
