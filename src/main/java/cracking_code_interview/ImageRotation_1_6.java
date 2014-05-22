/**
 * 
 */
package cracking_code_interview;

import java.util.Scanner;

/**
 * @author hari
 * 
 */
public class ImageRotation_1_6 {

	/**
	 * @param argssourcef
	 */
	public static void main(String[] args) {

		int n, layer, i;
		int temp = 10;
		System.out.print("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int a[][] = new int[n][n];
		for (layer = 0; layer < n; layer++)
			for (i = 0; i < n; i++) {
				a[layer][i] = ++temp;
			}
		display(a, n);
		System.out.println("Processing..");
		for (layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n-1-layer;
			for(i=first;i<last;i++) {
//				int myFirst = j-first;
//				int myLast = last-j;
//				temp = a[myFirst][myFirst];
//				a[myFirst][myFirst] = a[myLast][myFirst];
//				a[myLast][myFirst] = a[myLast][myLast];
//				a[myLast][myLast] = a[myFirst][myLast];
//				a[myFirst][myLast] = temp;
				
				int offset = i-layer;
				temp = a[layer][i];
				a[layer][i] = a[last-offset][layer];
				a[last-offset][first] = a[last][last-offset];
				a[last][last-offset] = a[i][last];
				a[i][last] = temp;				
				
				System.out.println("i is " + layer + "; j is "+ i + ";");
				display(a, n);
//				scanner.nextLine();
			}
			
		}

	}

	private static void display(int[][] a, int n) {
		System.out.println("Array follows:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
