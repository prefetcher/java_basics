package javaBasics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionObjectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class reflectionClass = ReflectionObject.class;
		Constructor[] constructors = reflectionClass.getDeclaredConstructors();
		System.out.println("Length is " + constructors.length);
		for(Constructor constructor : constructors) {
			int modifier = constructor.getModifiers();
			if(!Modifier.isPrivate(modifier)) {
				continue;
			}
			constructor.setAccessible(true);
			for(Class clazz : constructor.getParameterTypes()) {
				System.out.println(clazz.getName());
			}
			System.out.println("End");
			try {
			ReflectionObject object = (ReflectionObject) constructor.newInstance();
			System.out.println("Result is " + object.getA());
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
//			try {
//				ReflectionObject object = (ReflectionObject) constructor.newInstance(10);
//				System.out.println("Result is " + object.getA());
//			} catch (InstantiationException | IllegalAccessException
//					| IllegalArgumentException | InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		

	}

}
