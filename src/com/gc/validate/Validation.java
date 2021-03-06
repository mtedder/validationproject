package com.gc.validate;

import java.util.Scanner;

/**
 * Validation class containing methods for  validating various scanner input types.
 * @author Maurice Tedder
 *
 */
public class Validation{
	
	/**
	 * This method does not return until the user inputs a valid integer.
	 * @param scan
	 * @return valid integer
	 */
	public static int validateInt(Scanner scan) {
		while (!scan.hasNextInt()) {
			System.out.println(scan.next() + " is Incorrect input. Input must be an integer.");		
		}
		return scan.nextInt();
	}
}