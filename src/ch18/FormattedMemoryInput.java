package ch18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;

public class FormattedMemoryInput {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String get = "dfasgasfgdgasdga dfa qwe fdfasdsffas fasd";
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(get.getBytes()));
			while(true){
				System.out.println((char)in.readByte());
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
