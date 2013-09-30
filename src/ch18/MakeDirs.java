package ch18;

import java.io.File;

public class MakeDirs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("TextFile2.java");
//		file.renameTo(new File("ChangedFile.java"));
		if (!file.exists()) {
			file.mkdir();
		}
	}

}
