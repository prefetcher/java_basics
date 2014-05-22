/**
 * 
 */
package javaBasics;

/**
 * @author hari
 *
 */
public class FinalImmutableMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		FinalImmutable immutable = new FinalImmutable();
		FinalImmutableObject x = FinalImmutable.a;
		System.out.println(x);
		x.setB(false);
		System.out.println(FinalImmutable.a);
//		x.
	}

}
