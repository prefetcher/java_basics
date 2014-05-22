/**
 * 
 */
package interview_street;

import java.util.Scanner;

/**
 * @author hari
 * 
 */
public class ArithmethicProgression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.print("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// System.out.println(str);
		// String str = scanner.nextLine();
		int[] a = new int[n];
		int actualSum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			actualSum+= a[i];
		}
		scanner.close();
		if (n <= 3) {
			System.out.println("Not sufficient inputs to determine result");
			return;
		}
		System.out.println(a);
		int diff1, diff2, diff3;
		diff1 = a[1] - a[0];
		diff2 = a[2] - a[1];
		diff3 = a[3] - a[2];
		int diff;
		diff = diff1;
		if(diff2 == diff3) 
			diff = diff2;
		int start = a[0];
		int end = a[n-1];
		int expectedSum = (int) (((n+1) * (start + end))/2.0);
		System.out.println(expectedSum-actualSum);


	}
}
