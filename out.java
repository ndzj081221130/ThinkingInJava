package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFile extends ArrayList<String> {
	public static String read(String filename) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(
					filename).getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append('\n');
				}
			} finally {
				in.close();
			}

		} catch (IOException e) {
 			throw new RuntimeException(e);
		}
		
		return sb.toString();
	}
}
