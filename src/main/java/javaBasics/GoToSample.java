/**
 * 
 */
package javaBasics;

/**
 * @author hari
 *
 */
public class GoToSample {

	private static final Exception abc = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i =0 ;
		for(i=0;i<=5;i++) {
			System.out.println(i);
			if(i == 3) {
//				goto abc;
			}
		}
		abc:
			System.out.println("hello");

	}

}
