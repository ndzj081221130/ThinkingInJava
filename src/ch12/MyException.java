package ch12;import java.util.logging.Logger;public class MyException extends Exception{//	public   MyException() {//		// TODO Auto-generated constructor stub//	}	private static Logger logger = Logger.getLogger("LoggingMyException");		String para;	public MyException(String str) {		super(str);		para= str;		logger.severe(str);	}		public String getPara() {		return para;	}	public void setPara(String para) {		this.para = para;	}	/**	 * @param args	 */	public static void main(String[] args) {		// TODO Auto-generated method stub		try {			MyException.generate("hall");		} catch (MyException e) {			e.printStackTrace();//			e.getStackTrace()//			System.out.print(e.getPara());		}	}		public static void generate(String str) throws MyException{//		throw 		MyException exception = new MyException(str);		throw exception;	}}