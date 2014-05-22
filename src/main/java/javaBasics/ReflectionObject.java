package javaBasics;

public class ReflectionObject {
	
	private int a;
	
	public ReflectionObject(int a) {
		this.a = a;
	}
	
	private ReflectionObject() {
		System.out.println("Default private constructor");
		this.a = 12;
	}
	
	public int getA() {
		return a;
	}
}
