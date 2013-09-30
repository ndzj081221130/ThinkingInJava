package ch18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile file = new RandomAccessFile("ChangedFile.java", "rw");
			
			System.out.println(file.getFilePointer()+":" +  file.readChar());//.read());
			System.out.println();
			file.seek(10);
			System.out.println(file.getFilePointer()+":" + file.readLine());
			System.out.println("len=" + file.length());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
