package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
	
	public static final List<String> strs = new ArrayList<>(Arrays.asList("asa", "sdfas"));

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		System.out.println(unmodifiableList.size());
		list.add(8);
		System.out.println(unmodifiableList.size());
		strs.add("sring");
		System.out.println(strs.size());
		
		System.out.println(Integer.class.cast(5));
//		Collections.
	}

}
