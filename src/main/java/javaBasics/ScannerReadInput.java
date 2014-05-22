/**
 * 
 */
package javaBasics;

import java.util.Scanner;

/**
 * @author hari
 *
 */
public class ScannerReadInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,sum=0;
		System.out.print("Enter the first number to add: ");
		a= scanner.nextInt();
		System.out.print("Enter the second number to add: ");
		b = scanner.nextInt();
		sum = a+b;
		System.out.println("Sum is " + sum);
		scanner.close();
		
	}

}
