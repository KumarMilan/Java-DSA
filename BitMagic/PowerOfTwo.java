
package com.bit.magic;


/**
 * Check if a given number 'num' is power of 2 or not
 */

public class PowerOfTwo {

	public static void main(String[] args) {

		System.out.println(isPowerof2(64));
		
		System.out.println(isPowerof2(5));
	}

	
	/**
	 * @return - true if the number is power of 2 otherwise false
	 */
	private static boolean isPowerof2(int num) {
		
		if(num == 0) {
			return false;
		}
		
		return (num & (num - 1)) == 0;
	}
}
