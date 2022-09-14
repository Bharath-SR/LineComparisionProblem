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

	/*UC2
	 * check two lines are equal. - Using Java equals method 
	 *                                                                                         
	 */
	public static void main(String[] args) {
		// Driving Class
		
		int a1=1,b1=1,a2=4,b2=4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value x1");
		int x1 =sc.nextInt();
		System.out.println("Enter the value x2");
		int x2 =sc.nextInt();
		System.out.println("Enter the value y1");
		int y1 =sc.nextInt();
		System.out.println("Enter the value y2");
		int y2 =sc.nextInt();
		double distance1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double distance2 =Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println(distance1);
		System.out.println(distance2);
		if(distance1 == distance2) {
			System.out.println("Two lines are equal");
		}else {
			System.out.println("Two lines are Not equal");
		}
	}

}
