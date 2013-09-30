package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecoveringData {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("out2.java")));
		out.write("23".getBytes());
		out.writeUTF("b");
		out.write("hello".getBytes());
		out.close();
		
		DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("out2.java")) );
		
		
		
	}

}
