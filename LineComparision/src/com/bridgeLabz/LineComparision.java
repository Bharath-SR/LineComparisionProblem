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

	/*UC3
	 * check two lines are equal or 1 is  greater then 2
	 *                                                                                         
	 */
	public static void main(String[] args) {
		// Driving Class
		
		int a1=1,b1=1,a2=1,b2=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value x1");
		int x1 =sc.nextInt();
		System.out.println("Enter the value x2");
		int x2 =sc.nextInt();
		System.out.println("Enter the value y1");
		int y1 =sc.nextInt();
		System.out.println("Enter the value y2");
		int y2 =sc.nextInt();
		Double distance1 =new Double(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		Double distance2 =new Double(Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1)));
		System.out.println(distance1);
		System.out.println(distance2);
		
		if(Double.compare(distance1,distance2)==0) {
			System.out.println("Two lines are equal");
		}else if(Double.compare(distance1, distance2)<0){
			System.out.println("distance 1 is lesser than distance 2");
		}else{
			System.out.println("distance 1 is greater than distance 2");
		}
	}
}
