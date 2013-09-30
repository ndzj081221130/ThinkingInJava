package ch17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utilities {
	
	static List<String> list = Arrays.asList("one two three Four five six".split(" "));
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(list);
		System.out.println("'list' disjoint(Four)?: " + 
		Collections.disjoint(list, Collections.singletonList("Four")));
		
		System.out.println("max: " + Collections.max(list));
		System.out.println("min: " + Collections.min(list));
		
		System.out.println("max w/ comparatpr: " + Collections.max(list,String.CASE_INSENSITIVE_ORDER));		
		System.out.println("min w/ comparator: " + Collections.min(list,String.CASE_INSENSITIVE_ORDER));
		
		Collections.replaceAll(list, "one", "Yo");
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		Collections.rotate(list, 3);
		System.out.println(list);
		
		
	}

}
