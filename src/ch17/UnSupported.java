package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class UnSupported {

	static void test(String msg , List<String> list){
		System.out.println("---" + msg+ " ----");
		Collection<String> c = list;
		Collection<String> sub = list.subList(1, 8);
		Collection<String>c2 = new ArrayList<String>(sub);
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("df dafds fa ds f  ffdf sa  afdas ".split(" "));
		test("modifiable copy ", new ArrayList<String>(list));
		test("Arrays.asList", list);
		System.out.println();
		test("unmodifiableList() ", Collections.unmodifiableList(new ArrayList<String>(list)));
	}

}
