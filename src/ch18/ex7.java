package ch18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ex7 {

	public static void printLinkedList(String filename) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				filename));
		String s;
		LinkedList<String> list = new LinkedList<String>();

		while ((s = bufferedReader.readLine()) != null) {
			list.add(s.toUpperCase());
		}
		bufferedReader.close();
		// Collections.sort(list);
		// Collections

		Iterator<String> iterator = list.descendingIterator();// .iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	
	public static void writeToFile(String filename,String outfile) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				filename));
		String s;
		LinkedList<String> list = new LinkedList<String>();
		PrintWriter pw = new PrintWriter(outfile);
		while ((s = bufferedReader.readLine()) != null) {
			list.add(s);
			pw.println(s);
		}
		bufferedReader.close();
		pw.close();
		// Collections.sort(list);
		// Collections

//		Iterator<String> iterator = list.descendingIterator();// .iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
	}

	public static void findLinkedList(String filename, String word)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				filename));
		String s;
		LinkedList<String> list = new LinkedList<String>();

		while ((s = bufferedReader.readLine()) != null) {
			if (s.contains(word))
				list.add(s);
		}
		bufferedReader.close();

		Iterator<String> iterator = list.descendingIterator();// .iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// printLinkedList("ChangedFile.java");
//			if (args.length >= 1)
//				printLinkedList(args[0]);
//			else {
//				System.out.println("pls set the file name");
//			}
			
//			if (args.length >= 2)
//				findLinkedList(args[0],args[1]);
//			else {
//				System.out.println("pls set the file name and key word");
//			}
			
			if (args.length >= 3) {
				writeToFile(args[0],args[2]);
			}else{
				System.out.println("input three args");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
