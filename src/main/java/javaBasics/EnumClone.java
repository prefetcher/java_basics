/**
 * 
 */
package javaBasics;

import sun.misc.SharedSecrets;

/**
 * @author hari
 * 
 */
public class EnumClone {

	private enum Blah {
		A, B, C, D;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
//			System.out.println(Blah.values());
			System.out.println(SharedSecrets.getJavaLangAccess()
					.getEnumConstantsShared(Blah.class));
		}
		


	}

	@
	private void foo(int a) {
		
	}
}
