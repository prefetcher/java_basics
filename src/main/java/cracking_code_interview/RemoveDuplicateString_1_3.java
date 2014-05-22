/**
 * 
 */
package cracking_code_interview;

import java.util.Scanner;

/**
 * @author hari
 *
 */
public class RemoveDuplicateString_1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.print("Enter String: ");
		String input = scanner.next();
		char[] arr = input.toCharArray();
		int length = arr.length;
		if(length > 1) {
			int writeIndex = 1;
			for(int i = 1; i< length; i++) {
				int j;
				for(j=0;j<writeIndex; j++) {
					if(arr[j] == arr[i]) {
//						System.out.println("Duplicate found");
						break;
					}
				}
				if(j == writeIndex) {
					arr[writeIndex] = arr[i];
					writeIndex++;
				}
			}
			arr[writeIndex] = '\0';
		}
		scanner.close();
		System.out.println("Result is " + String.valueOf(arr).toString());
	}

}
