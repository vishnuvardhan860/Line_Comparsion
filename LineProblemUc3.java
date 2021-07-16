package com.lineproblem;

import java.util.Scanner;

public class LineProblemUc3 {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program:");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of (x1,y1) and (x2,y2) of line A: ");
		float x1 = scan.nextFloat();
		float y1 = scan.nextFloat();
		float x2 = scan.nextFloat();
		float y2 = scan.nextFloat();
		double lengthLineA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The 2 points of the line A are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");

		System.out.print("Enter the value of (m1,n1) and (m2,n2) of line B: ");
		float m1 = scan.nextFloat();
		float n1 = scan.nextFloat();
		float m2 = scan.nextFloat();
		float n2 = scan.nextFloat();
		scan.close();
		double lengthLineB = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));
		System.out.println("The 2 points of the line B are: (" + m1 + "," + n1 + ") and (" + m2 + "," + n2 + ")");

		String lineA = String.valueOf(lengthLineA);
		String lineB = String.valueOf(lengthLineB);
		if (lineA.compareTo(lineB) == 0)
			System.out.println("Line A and Line B are equal");
		else if (lineA.compareTo(lineB) > 0)
			System.out.println("Line A is greater than Line B");
		else if (lineB.compareTo(lineA) > 0)
			System.out.println("Line B is greater than Line A");

		System.out.println("Length of the line A is : " + lengthLineA + " units.");
		System.out.println("Length of the line B is : " + lengthLineB + " units.");
	}
}