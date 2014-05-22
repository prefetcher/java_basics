/**
 * 
 */
package javaBasics;

/**
 * @author hari
 *
 */
public class FinalImmutableObject {
	
	private Boolean b = Boolean.TRUE;
	
	private String str= "Gayu";

	public Boolean getB() {
		return b;
	}

	public void setB(Boolean b) {
		this.b = b;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return b + " " + str;
	}
	
}
