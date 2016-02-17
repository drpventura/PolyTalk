package ventura.poly.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList("Samantha", "Max", "Cecelia");
		System.out.println("Original list: " + names);

		// default sort using String compare method
		Collections.sort(names);
		System.out.println("\nDefault sort: " + names);

		// Sort (polymorphically) in reverse lexicographic order
		// using anonymous inner-class
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// just switching the order of comparison
				return s2.compareTo(s1);
			}			
		});
		System.out.println("\nSorted reverse lexicographically: " + names);

		// Sort (polymorphically) in reverse lexicographical order
		// using Java 8 lambda

		Collections.sort(names, (s1, s2) -> {
			return s2.compareTo(s1);
		});			
		System.out.println("\nLambda sorted reverse lexicographically: " + names);

		// Sort (polymorphically) on length
		Collections.sort(names, (s1, s2) -> {
			return s1.length() - s2.length();
		});
		System.out.println("\nSorted by length: " + names);

	}
}
