package com.lineproblem;

import java.util.*;

public class LineProblemUc1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start values of line X1 and y1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter start values of line x2 and y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double lengthOfLine;
		lengthOfLine = Math.sqrt((x2-x1)*(x2+x1)+(y2-y1)*(y2+y1));
		System.out.println("Length of line is : "+lengthOfLine);
	}
}