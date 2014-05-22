package integral.solution2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dimenstionString = scanner.nextLine();

		String[] dimensions = dimenstionString.split(",");
		int col = Integer.parseInt(dimensions[0]);
		int row = Integer.parseInt(dimensions[1]);
		if(row <1  || col < 1) {
			return;
		}
		// System.out.println("Value is " + row + ", " + col);
		int data[][] = new int[row][col];
		int i, j, sum, maximumSum;
		for (i = 0; i < row; i++) {
			String rowString = scanner.nextLine();
			String[] rowStringValues = rowString.split(",");
			for (j = 0; j < col; j++) {
				Integer value = Integer.parseInt(rowStringValues[j]);
				data[i][j] = value;
			}
		}
		
		maximumSum = row+ col -2;
		for(sum =0;sum <= maximumSum;sum++) {
			boolean seen = false;
			for(i=0;i<row;i++) {
				for(j=0;j<col;j++) {
					if (i+j == sum) {
//						System.out.print("(" + i + "," + j + ") ");
						System.out.print((seen ? "," : "") + data[i][j]);
						seen = true;
					}
				}
//				System.out.println();
			}
			System.out.println();
		}
		
//		int noOfIterations = row + col - 1; 
//		for(i= 0;i<noOfIterations; i++) {
//			int count = 0;
//			for(j=0;j<=Math.min(i, Math.min(col,row)) && j< Math.min(col,row); j++) {
//				if(count == Math.min(col, row)) {
//					break;
//				}
//				System.out.print("(" + j + "," + (i-j) + ") ");
//				count++;
////				System.out.print(data[j][i-j] + (j!=i ? "," : ""));
//			}
//			System.out.println();
//		}
//		for (i = 0; i < row; i++) {
//			for (j = 0; j < col; j++) {
//				System.out.print(data[i][j] + " ");
//			}
//			System.out.println();
//		}
		scanner.close();
	}

}
