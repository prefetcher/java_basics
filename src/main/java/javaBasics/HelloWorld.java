package javaBasics;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!!");

		Map<Integer, Integer> map = new HashMap<>();
		Class mapClazz = map.getClass();
		Field f = null;
		try {
			f = mapClazz.getDeclaredField("modCount");
//			System.out.println(f.getName());
			f.setAccessible(true);
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i >= 0; i++) {
			map.put(i, i);
			try {
				System.out.println("value is " + f.getInt(map));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println(i);
		}

		for(Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			map.put(8, 89);
			System.out.println(map.get(8));
			break;
		}
	}

}
