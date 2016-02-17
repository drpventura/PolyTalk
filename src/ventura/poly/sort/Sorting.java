package ventura.poly.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
//		ArrayList<String> names =
//				new ArrayList<String>();
//		names.add("James");
//		names.add("Emil");
		List<String> names = 
				Arrays.asList("Samantha", "Max", "Cecelia");
		System.out.println("Original list: " + names);

//		Collections.sort(names, new ReverseStringCompare());
//		Collections.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}			
//		});
		Collections.sort(names, (o1, o2) -> {
			return o2.compareTo(o1);
		});
		System.out.println("\nDefault sort");
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println("\nSorted reverse lexicographically");
		for (String n : names) {
			System.out.println(n);
		}
		
//		Collections.sort(names, (o1, o2) -> {
//			if (o1.length() < o2.length()) {
//				return -1;
//				
//			}
//			else if (o2.length() < o1.length()) {
//				return 1;
//			}
//			else {
//				return 0;
//			}
//		});

		Collections.sort(names, (o1, o2) -> {
			return o1.length() - o2.length();
	});

		System.out.println("\nSorted by length");
		for (String n : names) {
			System.out.println(n);
		}
		
	}
}
