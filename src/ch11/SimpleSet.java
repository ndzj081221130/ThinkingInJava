package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<Integer> sets = new TreeSet<Integer>();
//		for (int i = 0; i < 10; i++) {
//			sets.add(i);
//		}
//		sets.add(90);
//		for(Integer i:sets){
//			System.out.println(i);
//		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>( Arrays.asList(1,2,3));
		
		Integer[] ins = {4,5,6,8,7};
		arr.addAll(Arrays.asList(ins));
		for(Integer i:arr){
			System.out.println(i);
		}
		
		List<Integer> subList = arr.subList(1, 4);
		System.out.println(subList);
		Collections.shuffle(subList);//,new Random(2)
		System.out.println(subList);
//		System.out.println();
//		Collections.addAll(arr, 11,12,13,14);
//		for(Integer i:arr){
//			System.out.println(i);
//		}
		
		List<Integer> lsiList = Arrays.asList(1,3,4);
////		lsiList.add(11);
		
		subList.retainAll(lsiList);
		System.out.println(subList);
//		Set<String> set = new TreeSet<String>(Arrays.asList("zhangjie","zhuzhu","abc","want"));
//		System.out.println(set);
		
//		Set<String> mapSet = new LinkedHashSet<String>(Arrays.asList("zhangjie","zhuzhu","abc","want"));
//		System.out.println(mapSet);
//		
//		Set<String> hashSet = new HashSet<String>(Arrays.asList("zhangjie","zhuzhu","abc","want"));
//		System.out.println(hashSet);
	}

}
