/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class LineComparision {

	/**
	 * I want to model a line based on a point consisting of (x, y) co -ordinatesusing the Cartesian system,So that I can calculate its length
	 *- A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
	 */
	public static void main(String[] args) {
		// Driving Class
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value x1");
		int x1 =input.nextInt();
		System.out.println("Enter the value x2");
		int x2 =input.nextInt();
		System.out.println("Enter the value y1");
		int y1 =input.nextInt();
		System.out.println("Enter the value y2");
		int y2 =input.nextInt();
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(distance);

	}

}
