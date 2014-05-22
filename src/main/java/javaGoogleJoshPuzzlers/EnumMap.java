package javaGoogleJoshPuzzlers;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnumMap {
	
	private enum Sex{MALE,FEMALE;}
	
	public static void main(String args[]) {
		Map<Sex,Sex> map = new java.util.EnumMap<>(Sex.class);
		Sex m = Sex.MALE;
		System.out.println(m);
		map.put((Sex)m, Sex.FEMALE);
//		map.put(Sex.FEMALE, Sex.MALE);
		map.put(Sex.MALE, Sex.MALE);
		map.put(Sex.FEMALE, Sex.FEMALE);
		for(Map.Entry<Sex,Sex> entry : map.entrySet()) {
//			System.out.println(entry.getKey());
			map.put(Sex.FEMALE, Sex.MALE);
		}
//		System.out.println("Entry is " + map.entrySet());
//		Set<Map.Entry<Sex,Sex>> set = new HashSet<>(map.entrySet());
//		System.out.println("Set size is " + set.size());
	}

}
