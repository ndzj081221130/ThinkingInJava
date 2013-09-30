package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		StringReader new StringBuilder("i love u".getBytes()
		BufferedReader bufferedReader = new BufferedReader(new StringReader("i love u\n thankyou"));
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.java")));
		
		int linec = 1;
		String s;
		while( (s = bufferedReader.readLine()) != null){
			out.println(linec++ + " : " + s );
		}
		bufferedReader.close();
		out.close();
		
	}

}
