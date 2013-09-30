package ch18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFileTest {

	public static String read(String filename) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			String s;
			StringBuilder sb = new StringBuilder();
			while( (s = in.readLine()) != null ){
				sb.append(s+"\n");
				
				
			}
			in.close();
			return sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(read("ChangedFile.java"));
	}

}
