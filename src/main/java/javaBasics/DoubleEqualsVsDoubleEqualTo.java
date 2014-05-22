/**
 * 
 */
package javaBasics;

/**
 * @author gayu
 */
public class DoubleEqualsVsDoubleEqualTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Double d1 = new Double(Double.NEGATIVE_INFINITY);
//		Double d2 = new Double(Double.NEGATIVE_INFINITY);
		
//		Double d1 = new Double(Double.NaN);
//		Double d2 = new Double(Double.NaN);
		
		Double d1 = new Double(1.909);
		Double d2 = new Double(1.9090);
		
		System.out.println("d1 == d2      -> " + (d1 == d2));
		System.out.println("d1.equals(d2) -> " + d1.equals(d2));
	}

}
