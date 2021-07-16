package com.lineproblem;

import java.util.Scanner;

public class LineProblemUc2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start values of Line x1 and y1: ");
		System.out.println("Enter First Line values x1 and y1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter end values of Line x2 and y2: ");
		System.out.println("Enter First Line values x2 and y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double lengthOfLine;
		lengthOfLine = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The length of the line is : "+lengthOfLine);
		double lengthOfLine1;
		lengthOfLine1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Enter Second Line values x3 and y3: ");
                int x3 = sc.nextInt();
                int y3 = sc.nextInt();
                System.out.println("Enter Second Line values x4 and y4: ");
                int x4 = sc.nextInt();
                int y4 = sc.nextInt();
                double lengthOfLine2;
                lengthOfLine2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		String str1 = String.valueOf(lengthOfLine1);
		String str2 = String.valueOf(lengthOfLine2);
		if(str1.equals(str2))
			System.out.println("The length of two lines are equal");
		else
			System.out.println("The length of two lines are not equal");
		System.out.println("The length of the first line is : "+lengthOfLine1);
		System.out.println("The length of the second line is : "+lengthOfLine2);
	}
}
